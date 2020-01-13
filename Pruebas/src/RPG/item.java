package RPG;

public class item {

    double hp = 0;
    double dmg = 0;
    double armour = 0;
    double shield = 0;


    public item(String name,double lvl){

        switch (name){
            case "dmg":
                this.dmg = lvl;
                break;
            case "hp":
                this.hp = lvl;
                break;
            case "armour":
                this.armour = lvl;
                break;
            case "shield":
                this.shield = lvl;
                break;
            default:
                System.out.println("something went wrong");


        }



    }

}
