package app;

import java.util.ArrayList;
import java.util.List;

public class Fight {
    private List<Creatur> players;
    private int currentPlayerIndex = 0;

    public Fight(List<Creatur> players) {
        this.players = players;
    }

    public void startFight() {
        while (!isFightOver()) {
            startTurn();
        }
    }

    public void startTurn() { // Startet einen Neuen Spielzug.
        Creatur currentPlayer = players.get(currentPlayerIndex);
        System.out.println("Dieser Spieler ist am Zug: " + currentPlayer.getName());

        currentPlayer.choosAction();
        Turn playerTurn = new Turn(currentPlayer.getAction(), currentPlayer.isStunned(), currentPlayer.getActionPoints());

        nextPlayer();
    }

    private void nextPlayer() {
        currentPlayerIndex++;
        if (currentPlayerIndex >= players.size()) {
            currentPlayerIndex = 0;
        }
    }

    public boolean isFightOver() { //Überprüft ob einer der Zwei Spieler schon tot ist.
        for (Creatur creatur : players) {
            if (creatur.getHealth() > 0) {
                return false;
            } else if (creatur.getHealth() <= 0) {
                return true;
            }
        }
        return false; // Diese Zeile sollte eig nie erreicht werden aber es ist da des es keine Probleme mit Java gibt.
    }


}
