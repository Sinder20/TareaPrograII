/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseabstracto2;

/**
 *
 * @author PREDATOR
 */
public abstract class persona {
    String nombre;
    int edad;
    
     public persona(String nom, int ed) {
        this.nombre=nom;
         this.edad=ed;
     }
     
     public abstract void verdatos();
}
