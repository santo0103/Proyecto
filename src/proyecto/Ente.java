/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.awt.Rectangle;

/**
 *
 * @author User
 */
public class Ente {
    private int x;
    private int y;
    private Rectangle bordes;

    public Ente(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Rectangle getBordes() {
        return bordes;
    }

    public void setBordes(Rectangle bordes) {
        this.bordes = bordes;
    }

}
