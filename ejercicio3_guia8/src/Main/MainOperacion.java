package Main;

import Entidad.Operacion;
import Service.ServicioOperacion;

 /*Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2. 
   A continuación, se deben crear los siguientes métodos: 
       a) Método constructor con todos los atributos pasados por parámetro. 
       b) Metodo constructor sin los atributos pasados por parámetro. 
       c) Métodos get y set. 
       d) Método para crearOperacion(): que le pide al usuario los dos números 
       y los guarda en los atributos del objeto. 
       e) Método sumar(): calcular la suma de los números y devolver el resultado al main. 
       f) Método restar(): calcular la resta de los números y devolver el resultado al main. 
       g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
       se fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. 
       Si no, se hace la multiplicación y se devuelve el resultado al main.
       h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar 
       una división por cero, el método devuelve 0 y se le informa al usuario el error se le 
       informa al usuario. Si no, se hace la división y se devuelve el resultado al main. */
public class MainOperacion {

    public static void main(String[] args) {
        
        ServicioOperacion s1 = new ServicioOperacion();
        Operacion o1 = s1.CrearOperacion();
        
        int sum = s1.Sumar(o1);
        System.out.println(o1.getNum1() + " + " + o1.getNum2() + " = " + sum);
        
        int res = s1.Restar(o1);
        System.out.println(o1.getNum1() + " - " + o1.getNum2() + " = " + res);
        
        int mult = s1.Multiplicar(o1);
        System.out.println(o1.getNum1() + " * " + o1.getNum2() + " = " + mult);
        
        int div = s1.Dividir(o1);
        System.out.println(o1.getNum1() + " : " + o1.getNum2() + " = " + div);
        
    }
    
}
