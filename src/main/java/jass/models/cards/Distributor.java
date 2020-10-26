/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jass.models.cards;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author leo
 */
public class Distributor {
    private final ArrayList<Card> cards = new ArrayList<>();
    
    public Distributor() {
        for(CardColor color : CardColor.values()) {
            for(CardName name : CardName.valuesWithoutAtout()) {
                cards.add(new Card(name, color));
            }
        }
        Collections.shuffle(cards);
    }
    
    public Card[] giveCards(int number) throws Exception{
        if(cards.size() < number) throw new NotEnoughCardsException();
        Card[] givenCards = new Card[number];
        for (int i = 0; i <number; i++) {
            givenCards[i] = cards.remove(i);
        }
        return givenCards;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }
}
