/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo2herencia;
// Ejemplo de Herencia Simple
// Ricardo Oliva
//La clase Domestico al ser derivada de la clase Terrestre hereda lo de clase Animal
public class Domestico extends Terrestre{ 
    public String nombre;
    public String alias;
    
    //Un animal domestico puede jugar con sus dueños
    public void jugar(String nombre, String alias){
        this.nombre=nombre;
        this.alias = alias;
        System.out.printf("Hola, yo soy un %s, aunque me gusta que me digas '%s'\n"
        + "Soy un animal doméstico y me gusta jugar mucho\n",nombre,alias);
    }
}
