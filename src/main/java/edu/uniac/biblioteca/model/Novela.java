package edu.uniac.biblioteca.model;

public class Novela extends Libro {

    // Tipos posibles: histórica, romántica, policial, realista, ciencia ficción, aventuras.
    private String tipo;

    public Novela() {
        super();
        this.tipo = "";
    }

    public Novela(String titulo, String autor, int numeroEjemplares, int numeroPrestados, String tipo) {
        super(titulo, autor, numeroEjemplares, numeroPrestados);
        this.tipo = tipo;
    }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    @Override
    public String toString() {
        return "Novela {" +
                "titulo='" + getTitulo() + '\'' +
                ", autor='" + getAutor() + '\'' +
                ", ejemplares=" + getNumeroEjemplares() +
                ", prestados=" + getNumeroPrestados() +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}