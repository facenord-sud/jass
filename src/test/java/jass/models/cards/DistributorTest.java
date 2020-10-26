/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jass.models.cards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author leo
 */
public class DistributorTest {
    
    public DistributorTest() {
    }

    @Test
    public void testGetCards() {
        System.out.println("getCards");
        Distributor dist = new Distributor();
        ArrayList<Card> cards = dist.getCards();
        assertEquals(36, cards.size());
        assertEquals(new HashSet<>(cards).size(), cards.size());
    }
    
    /**
     * Test of takeThreeCards method, of class Distributor.
     */
    @Test
    public void testGiveCards() throws Exception {
        System.out.println("takeThreeCards");
        Distributor instance = new Distributor();
        Card[] result = instance.giveCards(3);
        assertEquals(3, result.length);
        assertEquals(new HashSet<>(Arrays.asList(result)).size(), result.length);
        assertEquals(33, instance.getCards().size());
    }
    
}
