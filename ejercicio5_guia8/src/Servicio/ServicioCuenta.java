package Servicio;

import Entidad.CuentaBancaria;
import java.util.Scanner;

public class ServicioCuenta {

    Scanner leer = new Scanner(System.in);

//      c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
    public CuentaBancaria CrearCuenta() {
        CuentaBancaria c1 = new CuentaBancaria();

        System.out.print("Número de cuenta:");
        c1.setNumeroDeCuenta(leer.nextInt());

        System.out.print("DNI:");
        c1.setDNI(leer.nextBigInteger());

        return null;
    }

//      d) Método ingresar(double ingreso): el método recibe una 
//      cantidad de dinero a ingresar y se la sumará al saldo actual.
    public void Ingresar(CuentaBancaria c1) {

        System.out.println("¿Qué cantidad desea ingresar?");
        c1.setSaldoActual(c1.getSaldoActual() + leer.nextInt());

    }

//      e) Método retirar(double retiro): el método recibe una cantidad de dinero 
//      a retirar y se la restará al saldo actual. Si la cuenta no tiene la cantidad de 
//      dinero a retirar, se pondrá el saldo actual en 0.
    public void Retirar(CuentaBancaria c1) {

        System.out.println("¿Qué cantidad desea a retirar?");
        c1.setSaldoActual(c1.getSaldoActual() - leer.nextInt());

        if (c1.getSaldoActual() < 0) {
            System.out.println("Saldo insuficiente.");
            c1.setSaldoActual(0);
        }
    }

//      f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. 
//      Validar que el usuario no saque más del 20%. 
    public void extraccionRapida(CuentaBancaria c1) {

        System.out.println("Para realizar una extracción rápida, la cantidad a retirar deberá "
                + "estar por debajo del 20% de su saldo actual, que es de $" + c1.getSaldoActual());

        System.out.println("Digite la cantidad que desea extraer:");
        int ext = leer.nextInt();

        while (ext > (c1.getSaldoActual() * 0.2)) {
            ext = (0);

            if (ext < (c1.getSaldoActual() * 0.2)) {
                System.out.println("Error. Digite una cantidad válida.");
                ext = leer.nextInt();
            }
        }
        System.out.println("Proceso exitoso.");
        c1.setSaldoActual(c1.getSaldoActual() - ext);
    }

//      g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
    public void ConsultarSaldo(CuentaBancaria c1) {

        System.out.println("Su saldo actual es de: " + c1.getSaldoActual());

    }

//      h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta.
    public void ConsultarDatos(CuentaBancaria c1) {

        System.out.println("Su número de cuenta es: " + c1.getNumeroDeCuenta());
        System.out.println("DNI vinculado a la cuenta: " + c1.getDNI());
        System.out.println("Su saldo actual es de: " + c1.getSaldoActual());

    }

    public int Menu(CuentaBancaria c1) {
        System.out.println("Ha ingresado exitosamente en su cuenta.");
        System.out.println("");
        System.out.println("Menú:");

        System.out.println("1. Consultar Datos");
        System.out.println("2. Consultar Saldo");
        System.out.println("3. Ingresar monto");
        System.out.println("4. Extraer monto");
        System.out.println("5. Extrancción rápida");
        System.out.println("");

        int opcion;

        do {
            opcion = leer.nextInt();

            if (opcion < 1 || opcion > 5) {
                System.out.println("Elija una opción válida.");
            }

        } while ((opcion < 1 || opcion > 5));

        return opcion;
    }
}
