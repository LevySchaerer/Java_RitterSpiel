package app;

import app.Actions.Attack;
import app.Actions.Block;
import app.Actions.Magic;
import app.Equip.Protection;
import app.Equip.Weapon;

import java.util.ArrayList;
import java.util.Scanner;

public class Creatur {
    String name;
    int health;
    boolean stunned = false;
    String action;
    int actionPoints;
    int attackIndex = 0;
    ArrayList<Attack> Attacks = new ArrayList<>();
    ArrayList<Magic> Magics;
    ArrayList<Block> Blocks;

    Protection schild = new Protection(2,2,"schild");
    Weapon schwert = new Weapon(2,2,"schwert");

    Attack uppercut = new Attack("UpperCut", 3);
    Attack kick = new Attack("Kick", 4);
    Attack punch = new Attack("Punch", 2);
    Attack powerpunch = new Attack("PowerPunch", 3);
    Attack spinn = new Attack("Spinnattack", 6);

    public Creatur(String name, int health) {
        this.name = name;
        this.health = health;

        Attacks.add(uppercut);
        Attacks.add(kick);
        Attacks.add(punch);
        Attacks.add(powerpunch);
        Attacks.add(spinn);
    }

    public String choosAction() {
        for (Attack attack : Attacks) {
            attackIndex ++;
            System.out.println(attackIndex + ". Costs: " + attack.getActionCost() + ", " + attack.getName());
        }
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which action do you want to perform? ");
        action = scanner.nextLine();
        return action;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getActionPoints() {
        return actionPoints;
    }

    public String getAction() {
        return action;
    }

    public boolean isStunned() {
        return stunned;
    }
}
