/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo2herencia;
// Ejemplo de Herencia Multinivel
// Ricardo Oliva
public class Ejemplo2Herencia {

    public static void main(String[] args) {
       //Objeto de la clase Domestico, la cual accede a los metodos 
       //de la clase Animal y clase Terrestre
        Domestico d = new Domestico();
        d.jugar("perro", "firu");
        d.caminar("4");
        d.aspecto("bonito");
    }   
}
