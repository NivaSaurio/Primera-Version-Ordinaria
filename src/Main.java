public class Main {
    public static void main(String[] args) {
        // Crear biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Agregar autor
        Autor autor1 = new Autor("Gabriel García Márquez");
        Autor autor2 = new Autor("Isabel Allende");
        biblioteca.agregarAutor(autor1);
        biblioteca.agregarAutor(autor2);
    
        // Crear y agregar libros
        try {
            Libro libro1 = new Libro("Cien años de soledad", autor1, "Sudamericana", 417, "Una obra magistral sobre la familia Buendía.", false);
            Libro libro2 = new Libro("La casa de los espíritus", autor2, "Debolsillo", 433, "Un clásico de la literatura latinoamericana.", true);
            biblioteca.agregarLibro(libro1);
            biblioteca.agregarLibro(libro2);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    
        // Mostrar libros
        biblioteca.mostrarLibros();
    }
}