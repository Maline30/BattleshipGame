package com.game;

import com.sun.javafx.geom.Rectangle;
import javafx.scene.Parent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class Ship extends Parent {
    public int type;
    public boolean vertical = true;

    private int health;

    public Ship(int type, boolean vertical) {
        this.type = type;
        this.vertical = vertical;
        health = type;

        /*VBox ship = new VBox();
        for (int i = 0; i < type; i++) {
            Rectangle square = new Rectangle(30, 30);
            square.setFill(null);
            square.setStroke(Color.BLACK);
            ship.getChildren().add(square);
        }
        getChildren().add(ship);
        */

    }

    public void hit() {
        health--;
    }

    public boolean isAlive() {
        return health > 0;
    }
}
