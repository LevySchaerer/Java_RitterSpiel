package app.Actions;

public class Attack extends Action {
    String name;
    int actionCost;

    public Attack(String name, int actionCost) {
        this.name = name;
        this.actionCost = actionCost;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getActionCost() {
        return actionCost;
    }
}
