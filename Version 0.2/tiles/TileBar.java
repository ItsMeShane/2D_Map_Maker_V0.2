package main.tiles;

import main.MapPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;

import static main.Main.barScroll;
import static main.tiles.TileList.tileID;

public class TileBar extends JPanel {

    public static int tileValue;
    JLabel[] allTiles;
    Tile selectedTile = new Tile();


    TileList tileList = new TileList();

    int tileScale;

    public TileBar(int tileScale) {
        this.tileScale = tileScale;
        this.setPreferredSize(new Dimension(350, 30000));//20000
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.setBackground(new Color(17, 27, 80));
        this.setBorder(BorderFactory.createLineBorder(Color.BLUE, 5));
        this.setDoubleBuffered(true);
        addTiles();
    }

    public void addTiles() {
        allTiles = new JLabel[tileID.length/2];
        for (int i = 1; i < tileID.length/2; i++) {
            allTiles[i] = new JLabel();
            if (tileID[i].image != null) {
                allTiles[i].setIcon(new ImageIcon(tileID[i].image.getScaledInstance(tileScale, tileScale, BufferedImage.SCALE_SMOOTH)));
                int finalI = i;
                allTiles[i].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent mouseEvent) {
                        if (selectedTile == tileID[finalI]) {
                            allTiles[finalI].setBorder(BorderFactory.createEmptyBorder());
                            tileValue = 0;
                            selectedTile = tileID[0];
                        } else {
                            selectedTile = tileID[finalI];
                            tileValue = finalI;
                            for (int i = 1; i < tileID.length/2; i++) {
                                if (selectedTile == tileID[i])
                                    allTiles[i].setBorder(BorderFactory.createLineBorder(Color.BLUE, 5));
                                else allTiles[i].setBorder(BorderFactory.createEmptyBorder());
                            }
//                            System.out.println(finalI);
                        }
                    }
                });
            }
        }
    }

    public void add_EVERYTHING() {
        this.removeAll();
        for (int i = 1; i < tileID.length/2; i++) this.add(allTiles[i]);
        barScroll.getVerticalScrollBar().setValue(1);
        barScroll.getVerticalScrollBar().setValue(0);
    }
    public void add_GRASS(){
        this.removeAll();
        for (int i = 1; i < tileID.length/2; i++) if (tileID[i].GRASS) this.add(allTiles[i]);
        barScroll.getVerticalScrollBar().setValue(1);
        barScroll.getVerticalScrollBar().setValue(0);
    }
    public void add_GRASS_AESTHETICS(){
        this.removeAll();
        for (int i = 1; i < tileID.length/2; i++) if (tileID[i].GRASS_AESTHETICS) this.add(allTiles[i]);
        barScroll.getVerticalScrollBar().setValue(1);
        barScroll.getVerticalScrollBar().setValue(0);
    }
    public void add_TREES(){
        this.removeAll();
        for (int i = 1; i < tileID.length/2; i++) if (tileID[i].TREES) this.add(allTiles[i]);
        barScroll.getVerticalScrollBar().setValue(1);
        barScroll.getVerticalScrollBar().setValue(0);
    }
    public void add_LEVELED_GRASS(){
        this.removeAll();
        for (int i = 1; i < tileID.length/2; i++) if (tileID[i].LEVELED_GRASS) this.add(allTiles[i]);
        barScroll.getVerticalScrollBar().setValue(1);
        barScroll.getVerticalScrollBar().setValue(0);
    }
    public void add_FARMING_AESTHETICS(){
        this.removeAll();
        for (int i = 1; i < tileID.length/2; i++) if (tileID[i].FARMING_AESTHETICS) this.add(allTiles[i]);
        barScroll.getVerticalScrollBar().setValue(1);
        barScroll.getVerticalScrollBar().setValue(0);
    }
    public void add_FENCES(){
        this.removeAll();
        for (int i = 1; i < tileID.length/2; i++) if (tileID[i].FENCES) this.add(allTiles[i]);
        barScroll.getVerticalScrollBar().setValue(1);
        barScroll.getVerticalScrollBar().setValue(0);
    }
    public void add_FLOORS(){
        this.removeAll();
        for (int i = 1; i < tileID.length/2; i++) if (tileID[i].FLOORS) this.add(allTiles[i]);
        barScroll.getVerticalScrollBar().setValue(1);
        barScroll.getVerticalScrollBar().setValue(0);
    }
    public void add_WALLS(){
        this.removeAll();
        for (int i = 1; i < tileID.length/2; i++) if (tileID[i].WALLS) this.add(allTiles[i]);
        barScroll.getVerticalScrollBar().setValue(1);
        barScroll.getVerticalScrollBar().setValue(0);
    }
    public void add_STAIRS_LADDERS(){
        this.removeAll();
        for (int i = 1; i < tileID.length/2; i++) if (tileID[i].STAIRS_LADDERS) this.add(allTiles[i]);
        barScroll.getVerticalScrollBar().setValue(1);
        barScroll.getVerticalScrollBar().setValue(0);
    }
    public void add_ROOFS(){
        this.removeAll();
        for (int i = 1; i < tileID.length/2; i++) if (tileID[i].ROOFS) this.add(allTiles[i]);
        barScroll.getVerticalScrollBar().setValue(1);
        barScroll.getVerticalScrollBar().setValue(0);
    }
    public void add_BUILDING_AESTHETICS(){
        this.removeAll();
        for (int i = 1; i < tileID.length/2; i++) if (tileID[i].BUILDING_AESTHETICS) this.add(allTiles[i]);
        barScroll.getVerticalScrollBar().setValue(1);
        barScroll.getVerticalScrollBar().setValue(0);
    }
    public void add_DOORS(){
        this.removeAll();
        for (int i = 1; i < tileID.length/2; i++) if (tileID[i].DOORS) this.add(allTiles[i]);
        barScroll.getVerticalScrollBar().setValue(1);
        barScroll.getVerticalScrollBar().setValue(0);
    }
    public void add_SIGNS(){
        this.removeAll();
        for (int i = 1; i < tileID.length/2; i++) if (tileID[i].SIGNS) this.add(allTiles[i]);
        barScroll.getVerticalScrollBar().setValue(1);
        barScroll.getVerticalScrollBar().setValue(0);
    }
    public void add_CONTAINERS(){
        this.removeAll();
        for (int i = 1; i < tileID.length/2; i++) if (tileID[i].CONTAINERS) this.add(allTiles[i]);
        barScroll.getVerticalScrollBar().setValue(1);
        barScroll.getVerticalScrollBar().setValue(0);
    }
    public void add_STATUES_STRUCTURES(){
        this.removeAll();
        for (int i = 1; i < tileID.length/2; i++) if (tileID[i].STATUES_STRUCTURES) this.add(allTiles[i]);
        barScroll.getVerticalScrollBar().setValue(1);
        barScroll.getVerticalScrollBar().setValue(0);
    }
    public void add_MARKET_SUPPLIES(){
        this.removeAll();
        for (int i = 1; i < tileID.length/2; i++) if (tileID[i].MARKET_SUPPLIES) this.add(allTiles[i]);
        barScroll.getVerticalScrollBar().setValue(1);
        barScroll.getVerticalScrollBar().setValue(0);
    }
    public void add_WATER(){
        this.removeAll();
        for (int i = 1; i < tileID.length/2; i++) if (tileID[i].WATER) this.add(allTiles[i]);
        barScroll.getVerticalScrollBar().setValue(1);
        barScroll.getVerticalScrollBar().setValue(0);
    }
    public void add_SHADOWS(){
        this.removeAll();
        for (int i = 1; i < tileID.length/2; i++) if (tileID[i].SHADOWS) this.add(allTiles[i]);
        barScroll.getVerticalScrollBar().setValue(1);
        barScroll.getVerticalScrollBar().setValue(0);
    }
    public void add_OTHER(){
        this.removeAll();
        for (int i = 1; i < tileID.length/2; i++) if (tileID[i].MISCELLANEOUS) this.add(allTiles[i]);
        barScroll.getVerticalScrollBar().setValue(1);
        barScroll.getVerticalScrollBar().setValue(0);
    }
}