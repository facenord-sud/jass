/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jass.models.cards;

import java.util.Arrays;

/**
 *
 * @author leo
 */
public enum CardName {
    SIX(11,0),
    SEVEN(10, 0),
    HEIGHT(9, 0),
    NINE(8, 0),
    TEN(7, 10),
    VALET(6, 2),
    DAME(5, 3),
    ROI(4, 4),
    ASS(3, 11),
    NEL(2, 14),
    BUR(1, 20);
    
    private final int rank, points;
    CardName(int rank, int points) {
        this.rank = rank;
        this.points = points;
    }
    
    public int rank() {
        return this.rank;
    }
    
    public int points() {
        return this.points;
    }
    
    public static CardName[] valuesWithoutAtout() {
        return Arrays.stream(CardName.values())
                .filter(card -> !(card == CardName.NEL || card == CardName.BUR))
                .toArray(CardName[]::new);
    }
    
    @Override
    public String toString() {
        return this.name();
    }
}
