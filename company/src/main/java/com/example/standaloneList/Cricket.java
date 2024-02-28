package com.example.standaloneList;

import java.util.List;

public class Cricket {
    private List<String> players;

    public List<String> getPlayers() {
        return players;
    }

    public void setPlayers(List<String> players) {
        this.players = players;
    }

    @Override
    public String toString() {
        return "Cricket [players=" + players + "]";
    }

}
