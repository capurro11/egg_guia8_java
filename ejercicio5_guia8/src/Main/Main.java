package Main;

import Entidad.CuentaBancaria;
import Servicio.ServicioCuenta;

/* Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). 
Las operaciones asociadas a dicha clase son:  
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés. 
b) Agregar los métodos getters y setters correspondientes.
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar 
y se la sumara a saldo actual. 
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se 
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se 
pondrá el saldo actual en 0.  
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el 
usuario no saque más del 20%. 
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta. 
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta. */
public class Main {

    public static void main(String[] args) {

        ServicioCuenta s1 = new ServicioCuenta();
        CuentaBancaria c1 = s1.CrearCuenta();

        int opcion = s1.Menu(c1);

        switch (opcion) {
            case 1:
                s1.ConsultarDatos(c1);
            case 2:
                s1.ConsultarSaldo(c1);
            case 3:
                s1.Ingresar(c1);
            case 4:
                s1.Retirar(c1);
            case 5:
                s1.extraccionRapida(c1);
        }
    }
}
