/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;
import javax.swing.*;
/**
 *
 * @author any
 */
public class Operaciones {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ventana v;
        v=new ventana();
        v.setVisible(true);
        v.setBounds(100,100,400,400);
    }
}

class ventana extends JFrame{
    JFrame marco;
    JButton boton;
    JLabel etiqueta;
    
    ventana(){
     marco=new JFrame();
     boton=new JButton();
     etiqueta= new JLabel();
     marco.add(boton);
     marco.add(etiqueta);
    }
}

