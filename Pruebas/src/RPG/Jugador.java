package RPG;

import java.util.List;

public class Jugador {

    double dmg;
    double hp;
    double armour;
    double shield;
    int range;
    int lvl;

    item equipment1;
    item equipment2;
    item equipment3;

    String clas;

    enum clase{
        WARRIOR("warrior", 5,10,7,2,1),
        ALCHEMIST("alchemist",2,15,2,0,5),
        ARCHER("archer",4,10,5,0,3),
        TANK("tank",2,20,10,7,1),
        BERSERK("berserk",10,10,4,2,2),
        SPARTAN("spartan",10,14,0,10,1),
        GOD("god",100,100,100,100,100);

        String clas;
        double dmg;
        double hp;
        double armour;
        double shield;
        int range;

        clase(String clas, double dmg, double hp, double armour, double shield,int range){
            this.clas = clas;
            this.dmg = dmg;
            this.hp = hp;
            this.armour = armour;
            this.shield = shield;
            this.range = range;
        }
    }

    public void setEquipment1(item item){
        this.equipment1 = item;
    }
    public void removeEquipment1(){
        this.equipment1 = null;
    }

    public void getEquipment2(item item) {
        this.equipment2 = item;
    }
    public void removeEquipment2(){
        this.equipment2 = null;
    }

    public void getEquipment3(item item) {
        this.equipment3 = item;
    }
    public void removeEquipment3(){
        this.equipment3 = null;
    }

    public Jugador(clase clase){
        this.clas = clase.clas;
        this.dmg = clase.dmg;
        this.hp = clase.hp;
        this.armour = clase.armour;
        this.shield = clase.shield;
        this.range = clase.range;
    }

    public void lvlUp(){
        this.lvl +=1;
        switch (this.clas){
            case "warrior":
                this.setDmg(this.lvl * 1.3);
                this.setHp(this.lvl * 1.5);
                break;
            case "alchemist":
                this.setDmg(this.lvl * 1.4);
                this.setHp(this.lvl * 1.4);
                break;
            case "archer":
                this.setDmg(this.lvl * 1.5);
                this.setHp(this.lvl * 1.3);
                break;
            case "tank":
                this.setDmg(this.lvl);
                this.setHp(this.lvl * 2);
                break;
            case "berserk":
                this.setDmg(this.lvl * 1.7);
                this.setHp(this.lvl * 1.2);
                break;
            case "spartan":
                this.setDmg(this.lvl * 1.8);
                this.setHp(this.lvl * 1.2);
                break;
            case "god":
                this.setDmg(this.lvl * 10);
                this.setHp(this.lvl * 10);
                break;
        }
    }


    public Enemigo hit(Enemigo enemigo){

        double golpe = this.dmg / enemigo.armour;
        if (golpe <= 1)golpe = 1;
        System.out.println(golpe);
        enemigo.hp -= golpe;

        return enemigo;
    }

    public void setLvl(int lvl) {
        for (int i = 0; i < lvl ; i++) {
            this.lvlUp();
        }
    }

    public void setDmg(double dmg) {
        this.dmg += dmg;
    }

    public void setHp(double hp) {
        this.hp += hp;
    }



    public void getStats(){
        System.out.print(getClas());
        System.out.print("| lvl: " + lvl);
        System.out.print("| dmg: " + getDmg());
        System.out.print("| hp: " + getHp());
        System.out.print("| armour: " + getArmour());
        System.out.println("| shield: " + getShield());
    }


    public void setArmour(double armour) {
        this.armour += armour;
    }

    public void setShield(double shield) {
        this.shield += shield;
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

    public String getClas() {
        return clas;
    }
}
