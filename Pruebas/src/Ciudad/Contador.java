package Ciudad;
import javafx.event.ActionEvent;

import javax.swing.*;
import java.awt.event.ActionListener;

public class Contador {

    int timer = 100;
    int time = 0;
    static int secs = 0;
    static long tics;

    Contador(Ciudad c,Frame f){
        System.out.println("hola soy un timer");
        ActionListener taskPerformer = new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                tics++;
                c.countBuildings();
                f.createStaticJB(c);
                if (time >= 10){
                    time = 0;
                    secs++;
                    c.generateResources();
                }
                else time++;
            }
            public void actionPerformed(ActionEvent e) {
            }
        };
        new Timer(timer,taskPerformer).start();

    }

}