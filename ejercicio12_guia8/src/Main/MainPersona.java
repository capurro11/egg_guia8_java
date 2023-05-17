package Main;

import Entidad.Persona;
import Service1.PersonaService;
import java.util.Scanner;

public class MainPersona {

    /*
    Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento 
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes 
métodos:  
 Agregar un método de creación del objeto que respete la siguiente firma: 
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al 
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la 
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto. 
 Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener 
en cuenta que para conocer la edad de la persona también se debe conocer la fecha 
actual.
 Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra 
edad y retorna true en caso de que el receptor tenga menor edad que la persona que 
se recibe como parámetro, o false en caso contrario. 
 Metodo mostrarPersona(): este método muestra la persona creada en el método 
anterior.
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        PersonaService s1 = new PersonaService();
        Persona p1 = s1.CrearPersona();

        int edad = s1.CalcularEdad(p1);
        System.out.println("La edad de " + p1.getNombre() + " es: " + edad);

        System.out.println("¿Qué edad quieres comparar a la de " + p1.getNombre() + "?");
        boolean b1 = s1.MenorQue((leer.nextInt()), p1);

        System.out.println("¿Es la edad de " + p1.getNombre() + " menor en comparación?");
        System.out.println(b1);
        
        s1.MostrarPersona(p1);
    }

}
