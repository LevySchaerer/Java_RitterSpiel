package app;

public class Weapon extends Equip{
    int deamage;
    int absorption;
    String Typ;

    public Weapon(int damage, int absorption, String typ) {
        this.deamage = damage;
        this.absorption = absorption;
        this.Typ = typ;
    }
}
