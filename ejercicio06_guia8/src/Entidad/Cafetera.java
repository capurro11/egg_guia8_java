package Entidad;

//      clase Cafetera con los atributos capacidadMaxima (la cantidad máxima de café que puede contener) 
//      y cantidadActual (la cantidad actual de café que hay en la cafetera)
public class Cafetera {
   
    private int capacidadMaxima;
    private int cantidadActual;

//       Constructor con la capacidad máxima y la cantidad actual 
    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

//       Constructor predeterminado o vacío 
    public Cafetera() {
    }

//       Métodos getters y setters.
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
}
