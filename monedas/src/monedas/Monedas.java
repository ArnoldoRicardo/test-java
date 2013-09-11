/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package monedas;
import javax.swing.*;
import java.lang.Math;
/**
 *
 * @author any
 */
public class Monedas {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double p,n,r;
        int i;
        r=0.5;
        p=0.5;
       n=Integer.parseInt(JOptionPane.showInputDialog(null,"escribe el numero de monedas"));
       //r=Math.pow(p,n);
       for(i=0;i<=n;i++){
           r*=p;
       }
       JOptionPane.showMessageDialog(null,"el resultado es "+p);
       //JOptionPane.showMessageDialog(null,"el resultado es "+r);
        // TODO code application logic here
    }
}
