package app;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Creatur player1 = new Creatur("Hans", 100);
        Creatur player2 = new Creatur("Mike", 100);

        ArrayList<Creatur> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);

        Fight fight = new Fight(players);

        fight.startTurn();

    }
}