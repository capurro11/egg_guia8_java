package Service_ej2_g8;

import ClaseCircunferencia.Circunferencia;
import java.util.Scanner;

public class ServicioCircunferencia {

    Scanner leer = new Scanner(System.in);

//     Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del objeto.
    public Circunferencia PedirRadio() {

        Circunferencia c1 = new Circunferencia();

        System.out.print("Radio de la circunferencia: ");
        c1.setRadio(leer.nextInt());

        return c1;
    }
//     Método area(): para calcular el área de la circunferencia (Area = pi ∗ Radio^2)

    public void CalcularArea(Circunferencia c1) {

        System.out.println("El área de la circunferencia es: "
                + Math.round(Math.PI * (Math.pow(c1.getRadio(), 2))));
    }
//    Método perimetro(): para calcular el perímetro (Perimetro = pi ∗ 2 ∗ Radio)

    public void CalcularPerimetro(Circunferencia c1) {

        System.out.println("El perímetro de la circunferencia es: "
                + Math.round(Math.PI * 2 * c1.getRadio()));
    }
}
