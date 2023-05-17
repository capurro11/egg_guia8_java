package Main_ej1_g8;

import ClaseLibro.Libro;
import Servicio.LibroServicio;

public class Ejercicio1 {
    public static void main(String[] args) {
      
        LibroServicio c1 = new LibroServicio();
        Libro l1 = c1.CrearLibro();
        c1.MostrarLibro(l1);
        
    }

    
}
