public class Libro {
    private String titulo;
    private Autor autor;
    private String editorial;
    private int numeroPaginas;
    private String sinopsis;
    private boolean prestado;

    public Libro(String titulo, Autor autor, String editorial, int numeroPaginas, String sinopsis, boolean prestado) {
        if (numeroPaginas <= 100) {
            throw new IllegalArgumentException("El libro debe tener más de 100 páginas.");
        }
        if (sinopsis.length() < 100 || sinopsis.length() > 500) {
            throw new IllegalArgumentException("La sinopsis debe tener entre 100 y 500 caracteres.");
        }
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.numeroPaginas = numeroPaginas;
        this.sinopsis = sinopsis;
        this.prestado = prestado;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor.getNombre() + ", Editorial: " + editorial + 
               ", Páginas: " + numeroPaginas + ", Sinopsis: " + sinopsis + ", Prestado: " + prestado;
    }
}
