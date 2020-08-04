
package ejemplo1herencia;
// Ejemplo de Herencia Simple
// Ricardo Oliva
public class Persona {
    public String nombre;
    public String apellido;
    public int edad;
    
    public void hablar(String nombre, int edad)
    {
        this.nombre= nombre;
        this.edad=edad;
        System.out.printf("Hola,mi nombre es %s  y tengo  %d  años \n",nombre,edad);
    }
}
