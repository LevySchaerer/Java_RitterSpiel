package app;

import java.util.ArrayList;

public class Creatur {
    String name;
    int Health;
    ArrayList<Attack> Attacks;
    ArrayList<Magic> Magics;
    ArrayList<Block> Blocks;

    Protection schild = new Protection(2,2,"schild");
    Weapon schwert = new Weapon(2,2,"schwert");

    Attack uppercut = new Attack("UpperCut", 3);

    Turn x = new Turn();
}
