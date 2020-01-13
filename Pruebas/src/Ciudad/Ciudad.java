package Ciudad;

import java.util.List;

public class Ciudad{
    Edificios[][] casillas;
    int [] buildings;
    int [] building_lvl;
    int food;
    int stone;
    int wood;
    int capacity = 1500;
    int x;
    int y;
    List<Units> unitsList;


    enum Edificios{
        EMPTY, //---
        HOUSE, //0
        FARM, //1
        MILITARY, //2
        MINE, //3
        ROAD, //4
        STORAGE, //5
        SAWMILL; //6
        int lvl;
        Edificios(){
            lvl = 1;
        }
    }


    Ciudad(int x, int y){

        this.x = x;
        this.y = y;
        this.casillas = new Edificios[10][10];
        this.buildings = new int[8];
        this.building_lvl = new int[]{1, 1, 1, 1, 1, 1, 1, 1};
        this.food = 1000;
        this.stone = 1000;
        this.wood = 1000;

        for (int i = 0; i <casillas.length ; i++) {
            for (int j = 0; j <casillas[0].length ; j++) {
                casillas[i][j] = Edificios.EMPTY;
            }
        }

        countBuildings();

        seeResources();
    }

    public void upBuildings(String Building){
        switch (Building){
            case "farm":
                if (this.food >= 500 * this.building_lvl[1]) {
                    this.food -=500 * this.building_lvl[1];
                    this.building_lvl[1]++;
                }
                else System.out.println("Not enought food");
                break;
            case "sawmill":
                if (this.wood >= 500 * this.building_lvl[6]) {
                    this.wood -=500 * this.building_lvl[6];
                    this.building_lvl[6]++;
                }
                else System.out.println("Not enought wood");
                break;
            case "mine":
                if (this.stone >= 500 * this.building_lvl[3]) {
                    this.stone -=500 * this.building_lvl[3];
                    this.building_lvl[3]++;
                }
                else System.out.println("Not enought stone");
                break;

        }

    }



    public void seeResources(){
        System.out.println("Food: " + this.food);
        System.out.println("Wood: " + this.wood);
        System.out.println("Stone: " + this.stone);
    }
    public void generateResources(){
        if (this.food + this.stone + this.stone < capacity) {
            this.food += this.buildings[1] * this.building_lvl[1];
            this.stone += this.buildings[3] * this.building_lvl[3];
            this.wood += this.buildings[6] * this.building_lvl[6];
        }
    }


    public int sumBuildings() {
     int suma = 0;
     countBuildings();
        for (int i = 0; i < buildings.length ; i++) {
            suma += buildings[i];
        }
        return suma;
    }
    public void countBuildings(){
        for (int i = 0; i < buildings.length ; i++) {
            buildings[i] = 0;
        }
        
        for (int i = 0; i < this.casillas.length ; i++) {
            for (int j = 0; j < this.casillas[0].length ; j++) {
                switch (this.casillas[i][j]) {
                    case HOUSE:
                        this.buildings[0]++;
                        break;
                    case FARM:
                        this.buildings[1]++;
                        break;
                    case MILITARY:
                        this.buildings[2]++;
                        break;
                    case MINE:
                        this.buildings[3]++;
                        break;
                    case ROAD:
                        this.buildings[4]++;
                        break;
                    case STORAGE:
                        this.buildings[5]++;
                        break;
                    case SAWMILL:
                        this.buildings[6]++;
                        break;

                }
            }
        }

    }



    public void buildHouse(int x, int y){
        if (this.casillas[x][y] == Edificios.EMPTY) {
            if (this.wood >=100) {
                this.casillas[x][y] = Edificios.HOUSE;
                this.wood -= 100;
            }
        }
        else
            System.out.println("There is a " + this.casillas[x][y]);
    }
    public void buildFarm(int x, int y){
        if (this.casillas[x][y] == Edificios.EMPTY) {
            if (this.wood >= 50 && this.stone >= 50) {
                this.casillas[x][y] = Edificios.FARM;
                this.wood -= 50;
                this.stone -=50;
            }
        }
        else
            System.out.println("There is a " + this.casillas[x][y]);
    }
    public void buildMine(int x, int y){
        if (this.casillas[x][y] == Edificios.EMPTY) {
            if (this.wood >= 50 && this.food >= 50) {
                this.casillas[x][y] = Edificios.MINE;
                this.wood -= 50;
                this.food -= 50;
            }
        }
        else
            System.out.println("There is a " + this.casillas[x][y]);
    }
    public void buildSawmill(int x, int y){
        if (this.casillas[x][y] == Edificios.EMPTY) {
            if (this.food >= 50 && this.stone >= 50) {
                this.casillas[x][y] = Edificios.SAWMILL;
                this.food -= 50;
                this.stone -= 50;
            }
        }
        else
            System.out.println("There is a " + this.casillas[x][y]);
    }
    public void buildRoad(int x, int y){
        if (this.casillas[x][y] == Edificios.EMPTY) {
            this.casillas[x][y] = Edificios.ROAD;
        }
        else
            System.out.println("There is a " + this.casillas[x][y]);
    }
    public void buildBarracks(int x, int y){
        if (this.casillas[x][y] == Edificios.EMPTY) {
            if (this.wood >= 200 && this.stone >= 200 && this.food >= 100) {
                this.casillas[x][y] = Edificios.MILITARY;
                this.wood -= 200;
                this.stone -= 200;
                this.food -= 100;
            }
        }
        else
            System.out.println("There is a " + this.casillas[x][y]);
    }
    public void buildStorage(int x, int y){
        if (this.casillas[x][y] == Edificios.EMPTY) {
            if (this.stone >= 100 && this.wood >= 100 && this.food >= 100) {
                this.casillas[x][y] = Edificios.STORAGE;
                this.wood -= 100;
                this.stone -= 100;
                this.food -= 100;
                this.capacity += 500;
            }
        }
        else
            System.out.println("There is a " + this.casillas[x][y]);
    }

    public void destroy(int x, int y){
        if (this.casillas[x][y] != Edificios.EMPTY) {
            this.casillas[x][y] = Edificios.EMPTY;
        }
        else
            System.out.println("There is nothing to destroy");
    }
}
