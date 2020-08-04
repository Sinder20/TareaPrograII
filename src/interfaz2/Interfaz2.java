/*
 * EJEMPLO 2 INTERFACES
 */
package interfaz2;
//Victor De Leon
public class Interfaz2 {

   
    public static void main(String[] args) {
       cliente cli= new cliente ("Luis","###");
       admin adm= new admin ("Usuario","Contraseña");
       imprimir impresora = new imprimir(cli);
       
       impresora.imprimirobjetoporimpresora();
       
       imprimir impresora1 = new imprimir(adm);
        impresora1.imprimirobjetoporimpresora();
    }
    
}
