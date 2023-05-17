package servicio;

import entidad.Raices;
import java.util.Scanner;

public class ServicioRaices {
private Raices r;
        Scanner leer = new Scanner (System.in);

    public ServicioRaices() {
        
        System.out.print("Ingrese el valor de a: ");
        double a = leer.nextDouble();
        
        System.out.print("Ingrese el valor de b: ");
        double b = leer.nextDouble();
        
        System.out.print("Ingrese el valor de c: ");
        double c = leer.nextDouble();
        
        r = new Raices(a, b , c);
    }
    
    public void Mostrar() {
        System.out.println(r.toString());
    }
    
//      Método getDiscriminante(): devuelve el valor del discriminante (double). El 
//      discriminante tiene la siguiente formula: (b^2)-4*a*c
    public double getDiscriminante() {
        return (Math.pow(r.getB(), 2) - 4 * r.getA() * r.getC());
    }
//      Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, 
//      para que esto ocurra, el discriminante debe ser mayor o igual que 0.
    public boolean tieneRaices() {
        return (getDiscriminante() > 0);
    }
    
//      Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, 
//      para que esto ocurra, el discriminante debe ser igual que 0.
    public boolean tieneRaiz(){
        return (getDiscriminante() == 0);
    }
    
//      Método obtenerRaices(): llama a tieneRaíces() y si devolvió true, 
//      imprime las 2 posibles soluciones.
    public void obtenerRaices(){
        if (tieneRaices()) {
            System.out.println("Solución 1: " + ((-r.getB() + (getDiscriminante())) / (2 * r.getA())));
            System.out.println("Solución 2: " + ((-r.getB() - (getDiscriminante())) / (2 * r.getA())));
        }
    }

//      Método obtenerRaiz(): llama a tieneRaiz() y si devolvió true imprime una única raíz. 
    public void obtenerRaiz(){
        if (tieneRaiz()) {
            System.out.println("Solución 1: " + ((- r.getB() / (2 * r.getA()))));
        }
    }
    
//      Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará
//      por pantalla las posibles soluciones que tiene nuestra ecuación con los métodos 
//      obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en 
//      caso de no existir solución, se mostrará un mensaje.
    public void calcular(){
        obtenerRaices();
        obtenerRaiz();
        
        if (!tieneRaices() && !tieneRaiz()){
            System.out.println("La ecuación no tiene soluciones.");
        }
    }
}
