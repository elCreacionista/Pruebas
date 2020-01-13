package Ciudad;

public class Units {

    int x;
    int y;

    public double dmg;
    public double hp;
    public double food_cost;
    public double wood_cost;
    public double stone_cost;
    public double time_cost;
    public int range;
    Clas clas;

    enum Clas{
        ARCHER,
        PROTECTOR,
        LANCER,
        WARRIOR,

    }


    public Units(Clas unit_class){

        switch (unit_class){
            case ARCHER:
                this.dmg = 10;
                this.hp = 30;
                this.food_cost = 100;
                this.wood_cost = 60;
                this.stone_cost = 20;
                this.time_cost = 5;
                break;
            case LANCER:
                this.dmg = 15;
                this.hp = 40;
                this.food_cost = 100;
                this.wood_cost = 50;
                this.stone_cost = 30;
                this.time_cost = 6;
                break;
            case WARRIOR:
                this.dmg = 15;
                this.hp = 45;
                this.food_cost = 100;
                this.wood_cost = 50;
                this.stone_cost = 50;
                this.time_cost = 7;
                break;
            case PROTECTOR:
                this.dmg = 10;
                this.hp = 60;
                this.food_cost = 100;
                this.wood_cost = 20;
                this.stone_cost = 100;
                this.time_cost = 5;
                break;
            default: System.out.println("Invalid Unit");
                break;
        }
        this.clas = unit_class;
    }

}
