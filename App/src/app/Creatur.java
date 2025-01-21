package app;

import app.Actions.Attack;
import app.Actions.Block;
import app.Actions.Magic;
import app.Equip.Protection;
import app.Equip.Weapon;

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

    public Creatur(String name, int health) {
        this.name = name;
        this.Health = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return Health;
    }
}
