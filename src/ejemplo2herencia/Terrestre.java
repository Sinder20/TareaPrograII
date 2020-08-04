/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo2herencia;
// Ejemplo de Herencia Simple
// Ricardo Oliva
public class Terrestre extends Animal{
    public String cantidad_patas; //Cantidad de patas que puede tener un animal terrestre
    
    public void caminar(String cantidad_patas){
        this.cantidad_patas=cantidad_patas;
        System.out.printf("Soy un animal terrestre y tengo %s patas  \n",cantidad_patas);
    }
}
