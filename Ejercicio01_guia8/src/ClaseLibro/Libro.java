package ClaseLibro;

public class Libro {

    private String Titulo;
    private int ISBN;
    private String Autor;
    private String Editorial;
    private int Pags;

    public Libro(String Titulo, int ISBN, String Autor, String Editorial, int Pags) {
        this.Titulo = Titulo;
        this.ISBN = ISBN;
        this.Autor = Autor;
        this.Editorial = Editorial;
        this.Pags = Pags;
    }

    public Libro() {
       }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    public int getPags() {
        return Pags;
    }

    public void setPags(int Pags) {
        this.Pags = Pags;
    }
   
    @Override
    public String toString() {
        return "Libro{" + ", ISBN=" + ISBN + ", Autor=" + Autor + ", Editorial=" + Editorial + ", Pags=" + Pags + '}';
    }
}
