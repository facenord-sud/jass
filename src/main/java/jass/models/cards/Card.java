/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jass.models.cards;

import jass.models.Player;
import java.util.Objects;

/**
 *
 * @author leo
 */
public class Card {
    
    private CardName name;
    private CardColor color;
    private boolean isAtout;
    private boolean isPlayed;
    
    private Player player;
    
    public Card(CardName name, CardColor color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Card)) return false;
        Card card = ((Card) obj);
        return card.color == this.color && card.name == this.name;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.name);
        hash = 79 * hash + Objects.hashCode(this.color);
        return hash;
    }
    
    
}
