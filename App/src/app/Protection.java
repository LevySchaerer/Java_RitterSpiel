package app;

public class Protection extends Equip {
    int deamage;
    int absorption;
    String Typ;

    public Protection(int damage, int absorption, String typ) {
        this.deamage = damage;
        this.absorption = absorption;
        this.Typ = typ;
    }
}
