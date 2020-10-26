/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jass.models;

import java.util.ArrayList;

/**
 *
 * @author leo
 */
public class Team {
    private ArrayList<Player> players = new ArrayList<>();
    private int points = 0;

    public Team(Player one, Player two) {
        players.add(one);
        players.add(two);
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public int getPoints() {
        return points;
    }
    
    
}
