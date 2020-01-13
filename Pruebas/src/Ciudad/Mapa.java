package Ciudad;

public class Mapa {

    int[][] mapa;
    boolean[][] ciudades;

    Mapa(int size){
        this.mapa = new int[size][size];
        this.ciudades = new boolean[size][size];

        for (int i = 0; i < size ; i++) {
            for (int j = 0; j < size ; j++) {
                this.mapa[i][j] = 0;
                this.ciudades[i][j] = false;
            }
        }

    }


}
