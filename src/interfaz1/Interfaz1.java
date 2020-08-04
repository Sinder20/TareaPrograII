/*
 * EJEMPLO 1 INTERFACES
 */
package interfaz1;
//Victor De Leon
public class Interfaz1 {

    
    public static void main(String[] args) {
        carro c = new carro();
        bicicleta b = new bicicleta();
        c.avanzar();
        b.avanzar();
        c.detenerse();
        b.detenerse();
        b.sentarse();
    }
    
}
