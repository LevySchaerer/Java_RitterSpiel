package app.Actions;

public class Block extends Action {
    String name;
    int actionCost;

    public Block(String name, int actionCost) {
        this.name = name;
        this.actionCost = actionCost;
    }
}
