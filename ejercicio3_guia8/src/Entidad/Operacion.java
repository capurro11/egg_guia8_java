/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Intel-DG41WV
 */
public class Operacion {

    private int num1;
    private int num2;

//    a) Método constructor con todos los atributos pasados por parámetro.
    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

//    b) Metodo constructor sin los atributos pasados por parámetro.
    public Operacion() {
    }

//    c) Métodos get y set.
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

}
