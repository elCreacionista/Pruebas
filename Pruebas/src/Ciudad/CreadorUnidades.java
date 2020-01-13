package Ciudad;

import java.util.List;

public class CreadorUnidades {

    int cant_archers = 0;
    int cant_protectors = 0;
    int cant_lancers = 0;
    int cant_warriors = 0;
    Units[] unit_attack;
    Units[] unit_defend;
    public CreadorUnidades(Ciudad m){


    }

    public Units createUnit(String unit_class){
        switch (unit_class){
            case "warrior":
                this.cant_warriors += 1;
                return new Units(Units.Clas.WARRIOR);
            case "archer":
                this.cant_archers =+ 1;
                return new Units(Units.Clas.ARCHER);
            case "protector":
                this.cant_protectors += 1;
                return new Units(Units.Clas.PROTECTOR);
            case "lancer":
                this.cant_lancers =+ 1;
                return new Units(Units.Clas.LANCER);
            default: return null;
        }
    }
}
