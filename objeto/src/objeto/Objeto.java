/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package objeto;
/**
 *
 * @author any
 */
public class Objeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        perro firu;
        firu=new perro("firulais","wua wua");
        perro fido;
        fido=new perro("fido","buaf buaf");
        System.out.println("el perro "+firu.sellama()+"hace"+firu.dice());
        // TODO code application logic here
    }
}
