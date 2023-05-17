package Servicio;

import Entidad.Rectangulo;
import java.util.Scanner;

public class ServicioRectangulo {

    Scanner leer = new Scanner(System.in);

//    La clase incluirá un método para crear un Rectángulo con datos dados por el usuario. 
    public Rectangulo CrearReactangulo() {
        Rectangulo r1 = new Rectangulo();

        System.out.print("Base del rectángulo: ");
        r1.setBase(leer.nextInt());

        System.out.print("Altura del rectángulo: ");
        r1.setAltura(leer.nextInt());

        return r1;
    }

//    También incluirá un método para calcular la superficie del rectángulo
    public int Superficie(Rectangulo r1) {
        int sup = (r1.getAltura() * r1.getBase());
        return sup;
    }

//    y un método para calcular el perímetro del rectángulo.
    public int Perimetro(Rectangulo r1) {
        int per = (2 * (r1.getAltura() + r1.getBase()));
        return per;
    }

//     un método que dibujará el rectángulo mediante asteriscos usando la base y la altura.
    public void RectanguloEnAsteriscos(Rectangulo r1) {
        for (int i = 1; i <= r1.getAltura(); i++) {
            for (int j = 1; j <= r1.getBase(); j++) {
                if (i == r1.getAltura() || j == r1.getBase() || i == 1 || j == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
