package RPG;

public class Enemigo {

    double dmg;
    double hp;
    double armour;
    double shield;
    int range;
    int lvl;

    public Enemigo(int lvl, boolean ranged){
        int ranger = 1;
        if (ranged) ranger = 3;
        this.dmg = lvl;
        this.hp = lvl;
        this.range = ranger;
        this.armour = lvl;
        this.shield = lvl;
        this.lvl = lvl;

    }


    public Enemigo(double dmg, double hp, int range, double armour, double shield, int lvl){
        this.dmg = dmg;
        this.hp = hp;
        this.range = range;
        this.armour = armour;
        this.shield = shield;
        this.lvl = lvl;
    }


    public Jugador hit(Jugador jugador){

        double golpe = this.dmg / jugador.armour;
        if (golpe <= 1)golpe = 1;
        System.out.println(golpe);
        jugador.hp -= golpe;

        return jugador;
    }


    public void getStats(){
        System.out.print("Enemigo");
        System.out.print("| lvl: " + lvl);
        System.out.print("| dmg: " + getDmg());
        System.out.print("| hp: " + getHp());
        System.out.print("| armour: " + getArmour());
        System.out.println("| shield: " + getShield());
    }
    public int getLvl() {
        return lvl;
    }

    public double getDmg() {
        return dmg;
    }

    public double getHp() {
        return hp;
    }

    public double getArmour() {
        return armour;
    }

    public double getShield() {
        return shield;
    }

    public int getRange() {
        return range;
    }
}
