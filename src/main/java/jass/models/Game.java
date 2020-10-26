/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jass.models;

import jass.models.cards.Distributor;
import java.util.Comparator;
import java.util.stream.Stream;

/**
 *
 * @author leo
 */
public class Game {
    private Team teamOne, teamTwo;
    private Player playerToPlay;
    private int turnsLeft;
    
    public Game(String humanPlayerName) throws Exception {
        teamOne = new Team(new Player(false, "Joueur1", 1), new Player(false, "Joueur 2", 3));
        teamTwo = new Team(new Player(false, "Joueur 3", 2), new Player(true, humanPlayerName, 4));
        nouvelleDonne();
        Player player = withSeptdeCarreau();
        player.chooseAtout();
        playerToPlay = player;
        this.turnsLeft = 9;
    }
    
    
    public Player[] getPlayersByDeskPosition() {
         return Stream.concat(
                 teamOne.getPlayers().stream(),
                 teamTwo.getPlayers().stream()
         ).sorted((p1, p2) -> {
             return ((Integer)p1.getDeskPosition()).compareTo(p2.getDeskPosition());
         }).toArray(Player[]::new);
    }
    
    public final void nouvelleDonne() throws Exception {
        Distributor distributor = new Distributor();
        Player[] players = getPlayersByDeskPosition();
        for (int i = 0; i < 3; i++) {
            for (Player player : players) {
                player.receivePli(distributor.giveCards(3));
            }
        }
    }
}
