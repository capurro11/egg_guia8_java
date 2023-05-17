package Servicio;

import ClaseLibro.Libro;
import java.util.Scanner;

public class LibroServicio {
    
        Scanner leer = new Scanner(System.in);
        
    public Libro CrearLibro() {
        Libro l1 = new Libro();
        
        System.out.println("Título del libro:");
        l1.setTitulo(leer.nextLine());
        
        System.out.println("Autor del libro:");
        l1.setAutor(leer.nextLine());
        
        System.out.println("ISBN del libro:");
        l1.setISBN(leer.nextInt());
        
        System.out.println("Número de páginas del libro:");
        l1.setPags(leer.nextInt());
        
        return l1;
    }
    public void MostrarLibro(Libro l1) {
        
        System.out.println("El Título del libro es: " + l1.getTitulo());
        
        System.out.println("El ISBN del libro es: " + l1.getISBN());
        
        System.out.println("El Autor del libro  es: " + l1.getAutor());
        
        System.out.println("La cantidad de paginas que tiene el libro es de: " + l1.getPags());
    }
}
