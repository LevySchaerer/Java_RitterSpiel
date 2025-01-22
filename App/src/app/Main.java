package app;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int playerHealth = 100;

        Creatur player1 = new Creatur("Hans", playerHealth);
        Creatur player2 = new Creatur("Peter", playerHealth);

        ArrayList<Creatur> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);

        Fight fight = new Fight(players);

        fight.startFight();
    }
}