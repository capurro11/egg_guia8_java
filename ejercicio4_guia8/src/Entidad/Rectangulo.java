package Entidad;

//    Rectángulo que modele rectángulos por medio de un atributo privado base y un atributo privado altura

public class Rectangulo {
    
   private int base;
   private int altura;

//    métodos getters, setters y constructores correspondientes.
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }
 
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
   
   
}
