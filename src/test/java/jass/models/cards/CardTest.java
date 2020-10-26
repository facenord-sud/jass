/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jass.models.cards;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author leo
 */
public class CardTest {
    
    public CardTest() {
    }

    /**
     * Test of equals method, of class Card.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Card card1 = new Card(CardName.ASS, CardColor.CARREAU);
        Card card2 = new Card(CardName.DAME, CardColor.COEUR);
        Card card3 = new Card(CardName.ASS, CardColor.CARREAU);
        assertEquals(true, card3.equals(card1));
        assertNotEquals(card1, card2);
        assertNotEquals(card1, this);
    }
    
}
