/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;
import java.lang.Math;
/**
 *
 * @author any
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b,c;
        b=1;
        a=0;
        System.out.println(0+"\n"+1);
        while(b<100){
            c=a+b;
            a=b;
            b=c;
            System.out.println(b);
    }
}
}