package Service;

import Entidad.Operacion;
import java.util.Scanner;

public class ServicioOperacion {
    Scanner leer = new Scanner(System.in);
    
//    d) Método para crearOperacion(): que le pide al usuario
//    los dos números y los guarda en los atributos del objeto. 
    
    public Operacion CrearOperacion(){
        Operacion o1 = new Operacion();
                
        System.out.println("Digite a continuación el primer número de la operación:");
        o1.setNum1(leer.nextInt());
        
        System.out.println("Digite a continuación el segundo número de la operación:");
        o1.setNum2(leer.nextInt());
        
        return o1;
    }
    
//    e) Método sumar(): calcular la suma de los números
//    y devolver el resultado al main.
    public int Sumar(Operacion o1){
        
        int suma = (o1.getNum1() + o1.getNum2());
        return suma;
    }
    
//    f) Método restar(): calcular la resta de los números
//    y devolver el resultado al main.
    public int Restar(Operacion o1) {
        
        int resta = (o1.getNum1() - o1.getNum2());
        return resta;
    }
    
//    g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, 
//    si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. 
//    Si no, se hace la multiplicación y se devuelve el resultado al main.
    public int Multiplicar(Operacion o1) {
        
        if (o1.getNum1() != 0 && o1.getNum2() != 0) {
            int producto = (o1.getNum1() * o1.getNum2());
            return producto; 
        } else {
            System.out.println("Las multiplicaciones por 0 darán siempre 0 como resultado.");
            return 0;
        }
    }
        
//        h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar 
//       una división por cero, el método devuelve 0 y se le informa al usuario el error se le 
//       informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
        public int Dividir(Operacion o1) {
        
        if (o1.getNum1() != 0 && o1.getNum2() != 0) {
            int producto = (o1.getNum1() / o1.getNum2());
            return producto; 
        } else {
            System.out.println("Error: ambos o uno de los números a dividir es 0.");
            return 0;
        }
    }
}
