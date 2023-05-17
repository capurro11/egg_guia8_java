package Servicio;

import Entidad.Cafetera;

public class ServicioCafetera {
    
    public Cafetera CrearCafetera(){
        
        Cafetera c1 = new Cafetera();
        c1.setCapacidadMaxima(10);
        c1.setCantidadActual(0);
        
        return c1;
    }
    
/*  Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.*/
    public Cafetera llenarCafetera() {

        Cafetera c1 = new Cafetera();
        c1.setCantidadActual(c1.getCapacidadMaxima());
        System.out.println("La cafetera se ha llenado correctamente. Cantidad actual de café: " + (c1.getCantidadActual()));

        return c1;
    }

/*  Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño 
   de la taza y simula la acción de servir la taza con la capacidad indicada. Si la cantidad 
   actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El método le informará
   al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza. */
    public void servirTaza(int taza, Cafetera c1) {

        if (c1.getCantidadActual() > taza) {
            System.out.println("Su taza de Nescafé ha sido servida con éxito.");
            c1.setCantidadActual(c1.getCantidadActual() - taza);
            System.out.println("Cantidad Actual: " + c1.getCantidadActual());
        } else {
            System.out.println("Café insuficiente. Se sirvieron " + c1.getCantidadActual());
            c1.setCantidadActual(0);
        }
    }

/*  Método vaciarCafetera(): pone la cantidad de café actual en cero. */
    public void vaciarCafetera(Cafetera c1) {
        c1.setCantidadActual(0);
        System.out.println("La cafetera se ha vaciado correctamente. Cantidad actual de café: " + (c1.getCantidadActual()));
    }
    
/*  Método agregarCafe(int): se le pide al usuario una cantidad de café, 
   el método lo recibe y se añade a la cafetera la cantidad de café indicada.*/
    public void agregarCafe(int cafeAgregado, Cafetera c1){
        
        if ((c1.getCantidadActual() + cafeAgregado) < c1.getCapacidadMaxima()) {
            c1.setCantidadActual(c1.getCantidadActual() + cafeAgregado);
            System.out.println("El café se agregó correctamente. Cantidad actual: " + c1.getCantidadActual());
        } else {
            System.out.println("Error: se superó la capacidad máxima. Se retornará el exceso: "
                    + ((c1.getCantidadActual() + cafeAgregado) - c1.getCapacidadMaxima()));
            c1.setCantidadActual(c1.getCapacidadMaxima());
        }
    }
}
