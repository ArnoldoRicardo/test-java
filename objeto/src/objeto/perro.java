/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package objeto;

/**
 *
 * @author any
 */
public class perro {
    String nombre;
    String ladra;
    perro(String n, String l){
     this.nombre=n;
     this.ladra=l;
    }
    public String dice(){
     return ladra;   
    }
    public String sellama(){
     return nombre;   
    }
    }
