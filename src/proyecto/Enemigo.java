/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author User
 */
public class Enemigo extends Ente{
    private Image foto;
    private int contadorframes=1;
    public Enemigo(int x, int y) {
        super(x, y);
        this.foto= Toolkit.getDefaultToolkit().getImage("frame-1.png");
    }

    public Image getFoto() {
        return foto;
    }

    public void setFoto(Image foto) {
        this.foto = foto;
    }

    public int getContadorframes() {
        return contadorframes;
    }

    public void setContadorframes(int contadorframes) {
        this.contadorframes = contadorframes;
    }
    

    
}
