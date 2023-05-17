package Main;

import Entidad.Cafetera;
import Servicio.ServicioCafetera;
import java.util.Scanner;

/* 6. Programa Nespresso. Desarrolle una clase Cafetera con los atributos
capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
cantidadActual (la cantidad actual de café que hay en la cafetera).
Implemente, al menos, los siguientes métodos: 
 Constructor predeterminado o vacío
 Constructor con la capacidad máxima y la cantidad actual
 Métodos getters y setters.
 Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
 Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza
 y simula la acción de servir la taza con la capacidad indicada. Si la cantidad actual de café “no
 alcanza” para llenar la taza, se sirve lo que quede. El método le informará al usuario si se llenó o no la taza,
 y de no haberse llenado en cuanto quedó la taza.
 Método vaciarCafetera(): pone la cantidad de café actual en cero.
 Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe
 y se añade a la cafetera la cantidad de café indicada.*/
public class MainCafetera {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        ServicioCafetera s1 = new ServicioCafetera();
        Cafetera c2 = s1.CrearCafetera();

        System.out.println("Menú:");
        System.out.println("1. Llenar la cafetera");
        System.out.println("2. Vaciar la cafetera");
        System.out.println("3. Servir una taza");
        System.out.println("4. Agregar café");
        System.out.println("-  -  -  -  -  -  -  -  -  -  -  -");
        int opcion = leer.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("-  -  -  -  -  -  -  -  -  -  -  -");
                c2 = s1.llenarCafetera();
                break;
            case 2:
                System.out.println("-  -  -  -  -  -  -  -  -  -  -  -");
                s1.vaciarCafetera(c2);
                break;
            case 3:
                System.out.println("-  -  -  -  -  -  -  -  -  -  -  -");
                System.out.print("Tamaño de la taza: ");
                s1.servirTaza(leer.nextInt(), c2);
                break;
            case 4:
                System.out.println("-  -  -  -  -  -  -  -  -  -  -  -");
                System.out.print("Cantidad de café a agregar: ");
                s1.agregarCafe((leer.nextInt()), c2);
                break;
        }
    }
}
