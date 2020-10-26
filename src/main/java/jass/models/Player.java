/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jass.models;

import jass.models.cards.Card;
import java.util.HashSet;

/**
 *
 * @author leo
 */
public class Player {
    
    private final HashSet<Card> main = new HashSet();
    private boolean isHuman;
    private String name;
    private Player coPlayer;
    private int deskPosition;
    
    public void receivePli(Card[] cards) {
        for(Card card : cards) main.add(card);
    }

    public Player(boolean isHuman, String name, int deskPosition) {
        this.isHuman = isHuman;
        this.name = name;
        this.deskPosition = deskPosition;
    }

    public Player getCoPlayer() {
        return coPlayer;
    }

    public void setCoPlayer(Player coPlayer) {
        this.coPlayer = coPlayer;
    }

    public int getDeskPosition() {
        return deskPosition;
    }

    public boolean play() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
