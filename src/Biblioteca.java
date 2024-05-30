import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Autor> autores;
    private List<Libro> libros;

    public Biblioteca() {
        autores = new ArrayList<>();
        libros = new ArrayList<>();
    }

    public void agregarAutor(Autor autor) {
        autores.add(autor);
    }

    public Autor buscarAutor(String nombre) {
        for (Autor autor : autores) {
            if (autor.getNombre().equalsIgnoreCase(nombre)) {
                return autor;
            }
        }
        return null;
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void mostrarLibros() {
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }
}
