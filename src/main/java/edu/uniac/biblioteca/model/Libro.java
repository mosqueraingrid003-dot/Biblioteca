package edu.uniac.biblioteca.model;

public class Libro {

    private String titulo;
    private String autor;
    private int numeroEjemplares;
    private int numeroPrestados;

    // Constructor vacío
    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.numeroEjemplares = 0;
        this.numeroPrestados = 0;
    }

    // Constructor con parámetros
    public Libro(String titulo, String autor, int numeroEjemplares, int numeroPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroEjemplares = Math.max(0, numeroEjemplares);
        this.numeroPrestados = Math.max(0, Math.min(numeroPrestados, this.numeroEjemplares));
    }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public int getNumeroEjemplares() { return numeroEjemplares; }
    public void setNumeroEjemplares(int numeroEjemplares) {
        this.numeroEjemplares = Math.max(0, numeroEjemplares);
        if (this.numeroPrestados > this.numeroEjemplares) {
            this.numeroPrestados = this.numeroEjemplares;
        }
    }

    public int getNumeroPrestados() { return numeroPrestados; }
    public void setNumeroPrestados(int numeroPrestados) {
        this.numeroPrestados = Math.max(0, Math.min(numeroPrestados, this.numeroEjemplares));
    }

    // Método prestar()
    public boolean prestar() {
        if (numeroPrestados < numeroEjemplares) {
            numeroPrestados++;
            return true;
        }
        return false;
    }

    // Método devolver()
    public boolean devolver() {
        if (numeroPrestados > 0) {
            numeroPrestados--;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        int disponibles = numeroEjemplares - numeroPrestados;
        return "Libro {" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", ejemplares=" + numeroEjemplares +
                ", prestados=" + numeroPrestados +
                ", disponibles=" + disponibles +
                '}';
    }
}