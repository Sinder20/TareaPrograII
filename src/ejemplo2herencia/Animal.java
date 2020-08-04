/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo2herencia;
// Ejemplo de Herencia Simple
// Ricardo Oliva
public class Animal {
    public String aspecto;
    public void aspecto(String aspecto){
        this.aspecto=aspecto;
        System.out.printf("Y como soy un animal muy %s, merezco que me trates bien\n",aspecto);
    }
}
