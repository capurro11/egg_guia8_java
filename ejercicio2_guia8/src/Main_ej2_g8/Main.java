package Main_ej2_g8;

import ClaseCircunferencia.Circunferencia;
import Service_ej2_g8.ServicioCircunferencia;

public class Main {

/*  Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de 
    tipo real. A continuación, se deben crear los siguientes métodos: 
        a) Método constructor que inicialice el radio pasado como parámetro. 
        b) Métodos get y set para el atributo radio de la clase Circunferencia. 
        c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del objeto. 
        d) Método area(): para calcular el área de la circunferencia (Area = pi ∗ Radio^2) 
        e) Método perimetro(): para calcular el perímetro (Perimetro = pi ∗ 2 ∗ Radio) 
     */
    public static void main(String[] args) {
        
        ServicioCircunferencia s1 = new ServicioCircunferencia();
        Circunferencia c1 = s1.PedirRadio();
        s1.CalcularArea(c1);
        s1.CalcularPerimetro(c1);
        
    }
    
}
