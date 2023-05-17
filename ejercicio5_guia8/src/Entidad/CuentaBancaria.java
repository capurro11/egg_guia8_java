package Entidad;
//  Cuenta (bancaria) que debe tener como mínimo los atributos:
//  numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).

import java.math.BigInteger;

public class CuentaBancaria {
    
    private int NumeroDeCuenta;
    private BigInteger DNI;
    private int SaldoActual;

    public CuentaBancaria(int NumeroDeCuenta, BigInteger DNI, int SaldoActual) {
        this.NumeroDeCuenta = NumeroDeCuenta;
        this.DNI = DNI;
        this.SaldoActual = SaldoActual;
    }

    public CuentaBancaria() {
    }

    public int getNumeroDeCuenta() {
        return NumeroDeCuenta;
    }

    public void setNumeroDeCuenta(int NumeroDeCuenta) {
        this.NumeroDeCuenta = NumeroDeCuenta;
    }

    public BigInteger getDNI() {
        return DNI;
    }

    public void setDNI(BigInteger DNI) {
        this.DNI = DNI;
    }

    public int getSaldoActual() {
        return SaldoActual;
    }

    public void setSaldoActual(int SaldoActual) {
        this.SaldoActual = SaldoActual;
    }

}
