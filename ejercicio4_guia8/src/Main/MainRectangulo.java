package Main;

import Entidad.Rectangulo;
import Servicio.ServicioRectangulo;

/* Crear una clase Rectángulo que modele rectángulos por medio de un atributo 
privado base y un atributo privado altura. La clase incluirá un método para crear 
el rectángulo con los datos del Rectángulo dados por el usuario. También incluirá 
un método para calcular la superficie del rectángulo y un método para calcular el 
perímetro del rectángulo. Por último, tendremos un método que dibujará el rectángulo 
mediante asteriscos usando la base y la altura. Se deberán además definir los métodos 
getters, setters y constructores correspondientes. 
Superficie = base * altura / Perímetro = (base + altura) * 2.*/

public class MainRectangulo {

    public static void main(String[] args) {
        
        ServicioRectangulo s1 = new ServicioRectangulo();
        Rectangulo r1 = s1.CrearReactangulo();
        
        int per1 = s1.Perimetro(r1);
        System.out.println("Perímetro del rectángulo: " + per1);
        
        int sup1 = s1.Superficie(r1);
        System.out.println("Superficie del rectángulo: " + sup1);
        
        s1.RectanguloEnAsteriscos(r1);
    }
    
}
