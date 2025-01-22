package app;

public class Turn {
    String Action;
    boolean Stunned;
    int ActionPoints;

    public Turn(String Action, boolean Stunned, int ActionPoints) {
        this.Action = Action;
        this.Stunned = Stunned;
        this.ActionPoints = ActionPoints;
        System.out.println("Turn " + Action + " " + Stunned + " " + ActionPoints);
    }
}
