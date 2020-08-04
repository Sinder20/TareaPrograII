
package ejemplo1herencia;
// Ejemplo de Herencia Simple
// Ricardo Oliva
public class Profesor extends Persona {
    public double salario;
    
    public void enseñar()
    {
        System.out.println("Soy un objeto de la clase Profesor y herede atributos de la clase Persona");
    }
}
