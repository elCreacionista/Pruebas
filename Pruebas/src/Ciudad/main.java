package Ciudad;

import javax.swing.*;

public class main {

    public static void main(String[] args) {
        Ciudad Athens = new Ciudad(0,0);
        Frame HUD = new Frame(Athens);
        Units creadorUnidades = new Units(Units.Clas.PROTECTOR);
        Contador c = new Contador(Athens,HUD);

    }


}
