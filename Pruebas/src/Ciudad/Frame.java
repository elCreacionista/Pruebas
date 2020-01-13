package Ciudad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame {
    JFrame f_city;
    JPanel f_city0;
    JButton[][] buildings;
    JFrame f_actions;
    JPanel f_actions0;
    JLabel statics;
    JLabel[] resources;
    JButton[] actions;
    public Frame(Ciudad m){
        createFrameCity(m);
        createFrameActions(m);
        createStatics(m);
    }

    public void createStatics(Ciudad m){
        statics = new JLabel();
        statics.setLayout(new GridLayout(6,1,10,10));
        f_actions.add(statics);
        resources = new JLabel[6];

        for (int i = 0; i < resources.length ; i++) {
            resources[i] = new JLabel();
            statics.add(resources[i]);
        }
        createStaticJB(m);
    }

    public void createStaticJB(Ciudad m){
        resources[0].setText("  FOOD:      " + m.food + "       food/sec  " + m.buildings[1] * m.building_lvl[1] + "    lvl: " + m.building_lvl[1]);
        resources[1].setText("  WOOD:      " + m.wood + "       wood/sec  " + m.buildings[6] * m.building_lvl[6] + "    lvl: " + m.building_lvl[6]);
        resources[2].setText("  STONE:      " + m.stone + "       stone/sec  " + m.buildings[3] * m.building_lvl[3] + "    lvl: " + m.building_lvl[3]);
        resources[3].setText("  BUILDINGS:  " + m.sumBuildings());
        resources[4].setText("  TIME:   " + Contador.secs + "s");
        resources[5].setText("  CAPACITY:     " + (m.food + m.stone + m.wood) + "/" + m.capacity);
    }


    public void createFrameActions(Ciudad m){
        f_actions = new JFrame("ACTIONS");
        f_actions0 = new JPanel();
        f_actions.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f_actions.setSize(300,300);
        f_actions.add(f_actions0);
        f_actions.setLayout(new GridLayout(2,1, 0,0));
        f_actions0.setLayout(new GridLayout(5,2,10,10));
        actions = new JButton[10];
        for (int i = 0; i < actions.length ; i++) {
            actions[i] = new JButton();
            actions[i].setBackground(Color.GRAY);
            f_actions0.add(actions[i]);
        }
        actions[0].setText("FARM");
        actions[0].addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) {
                int x;
                int y;
                while (true) {
                    x = (int) (Math.random() * m.casillas.length);
                    y = (int) (Math.random() * m.casillas[0].length);
                    if (m.sumBuildings() >= m.casillas.length * m.casillas[0].length) {
                        break;
                    }
                    if (m.casillas[x][y] == Ciudad.Edificios.EMPTY) {
                        break;
                    }

                }
                m.buildFarm(x, y);
                createCity(m, x, y);

            }
        });
        actions[1].setText("LVL UP FARMS");
        actions[1].addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) {
                m.upBuildings("farm");
            }
        });
        actions[2].setText("SAWMILL");
        actions[2].addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) {
                int x;
                int y;
                while (true) {
                    x = (int) (Math.random() * m.casillas.length);
                    y = (int) (Math.random() * m.casillas[0].length);
                    if (m.sumBuildings() >= m.casillas.length * m.casillas[0].length) {
                        break;
                    }
                    if (m.casillas[x][y] == Ciudad.Edificios.EMPTY) {
                        break;
                    }

                }
                m.buildSawmill(x, y);
                createCity(m, x, y);

            }
        });
        actions[3].setText("LVL UP SAWMILL");
        actions[3].addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) {
                m.upBuildings("sawmill");
            }
        });
        actions[4].setText("MINE");
        actions[4].addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) {
                int x;
                int y;
                while (true) {
                    x = (int) (Math.random() * m.casillas.length);
                    y = (int) (Math.random() * m.casillas[0].length);
                    if (m.sumBuildings() >= m.casillas.length * m.casillas[0].length) {
                        break;
                    }
                    if (m.casillas[x][y] == Ciudad.Edificios.EMPTY) {
                        break;
                    }

                }
                m.buildMine(x, y);
                createCity(m, x, y);

            }
        });
        actions[5].setText("LVL UP MINE");
        actions[5].addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) {
                m.upBuildings("mine");
            }
        });
        actions[6].setText("HOUSE");
        actions[6].addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) {
                int x;
                int y;
                while (true) {
                    x = (int) (Math.random() * m.casillas.length);
                    y = (int) (Math.random() * m.casillas[0].length);
                    if (m.sumBuildings() >= m.casillas.length * m.casillas[0].length) {
                        break;
                    }
                    if (m.casillas[x][y] == Ciudad.Edificios.EMPTY) {
                        break;
                    }

                }
                    m.buildHouse(x, y);
                    createCity(m, x, y);

            }
        });




        actions[7].setText("STORAGE");
        actions[7].addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) {
                int x;
                int y;
                while (true) {
                    x = (int) (Math.random() * m.casillas.length);
                    y = (int) (Math.random() * m.casillas[0].length);
                    if (m.sumBuildings() >= m.casillas.length * m.casillas[0].length) {
                        break;
                    }
                    if (m.casillas[x][y] == Ciudad.Edificios.EMPTY) {
                        break;
                    }

                }
                m.buildStorage(x, y);
                createCity(m, x, y);

            }
        });

        actions[8].setText("BARRACKS");
        actions[8].addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) {
                int x;
                int y;
                while (true) {
                    x = (int) (Math.random() * m.casillas.length);
                    y = (int) (Math.random() * m.casillas[0].length);
                    if (m.sumBuildings() >= m.casillas.length * m.casillas[0].length) {
                        break;
                    }
                    if (m.casillas[x][y] == Ciudad.Edificios.EMPTY) {
                        break;
                    }

                }
                m.buildBarracks(x, y);
                createCity(m, x, y);

            }
        });

        actions[9].setText("REBUILD");
        actions[9].addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < m.casillas.length ; i++) {
                    for (int j = 0; j < m.casillas[0].length ; j++) {
                        m.destroy(i,j);
                        createCity(m,i,j);
                    }
                }


            }
        });


        f_actions.setVisible(true);

    }


private void createFrameCity(Ciudad m){
    f_city = new JFrame("CIUDAD");
    f_city0 = new JPanel();
    f_city.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    f_city.setSize(600,600);
    f_city.add(f_city0);
    f_city0.setLayout(new GridLayout(10,10,0,0));
    buildings = new JButton[m.casillas.length][m.casillas[0].length];
    for (int i = 0; i < buildings.length ; i++) {
        for (int j = 0; j < buildings[0].length ; j++) {
            buildings[i][j] = new JButton();
            f_city0.add(buildings[i][j]);
            buildings[i][j].setVisible(true);
            buildings[i][j].addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    System.out.println("Hola soy una casilla");
                }
            });
        }
    }
    f_city.setVisible(true);
    f_city0.setVisible(true);
    for (int i = 0; i < m.casillas.length ; i++) {
        for (int j = 0; j < m.casillas[0].length ; j++) {
            createCity(m,i,j);

        }
    }
}
    public void createCity(Ciudad m, int x, int y){
        
                switch (m.casillas[x][y]) {
                    case EMPTY:
                        switch ((int) (Math.random() * 3)) {
                            case 0:
                                buildings[x][y].setIcon(new ImageIcon("img/arena0.png"));
                                break;
                            case 1:
                                buildings[x][y].setIcon(new ImageIcon("img/arena1.png"));
                                break;
                            case 2:
                                buildings[x][y].setIcon(new ImageIcon("img/arena2.png"));
                                break;
                        }
                        break;
                    case FARM:
                        buildings[x][y].setIcon(new ImageIcon("img/granja.png"));
                        break;
                    case HOUSE:
                        buildings[x][y].setIcon(new ImageIcon("img/casa0.png"));
                        break;
                    case SAWMILL:
                        buildings[x][y].setIcon(new ImageIcon("img/aserradero.png"));
                        break;
                    case MINE:
                        buildings[x][y].setIcon(new ImageIcon("img/mina0.png"));
                        break;
                    case STORAGE:
                        buildings[x][y].setIcon(new ImageIcon("img/almacen.png"));
                        break;
                    case MILITARY:
                        buildings[x][y].setIcon(new ImageIcon("img/military.png"));
                        break;
                    case ROAD:
                        buildings[x][y].setIcon(new ImageIcon("img/camino.png"));
                        break;
                    default:
                        System.out.println("Something is wrong");
                        break;


                }

    }
}
