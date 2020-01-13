package RPG;

public class Ver {

    public static void main(String[] args) {

        Jugador jugador1 = new Jugador(Jugador.clase.ALCHEMIST);
        Jugador jugador2 = new Jugador(Jugador.clase.GOD);

        Enemigo enemigo1 = new Enemigo(3,true);


        while (jugador1.getHp() > 0 && enemigo1.getHp() > 0){
            enemigo1 = jugador1.hit(enemigo1);
            jugador1 = enemigo1.hit(jugador1);
            jugador1.getStats();
            enemigo1.getStats();
        }





    }
}
