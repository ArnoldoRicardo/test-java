/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bucle;
import javax.swing.JOptionPane;

/**
 *
 * @author any
 */
public class Bucle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador;
        double r;
        contador=0;
        while(contador<100){
//            JOptionPane.showMessageDialog(null,"hola mundo num #"+(contador+1));
            r=contador%2;
            if((r==0) && (contador!=0)){
                System.out.println(contador);
            }
            contador++;
        }
    }
}
