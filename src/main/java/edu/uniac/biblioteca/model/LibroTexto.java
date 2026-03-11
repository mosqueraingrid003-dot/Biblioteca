package edu.uniac.biblioteca.model;

public class LibroTexto extends Libro {

    private String curso;

    public LibroTexto() {
        super();
        this.curso = "";
    }

    public LibroTexto(String titulo, String autor, int numeroEjemplares, int numeroPrestados, String curso) {
        super(titulo, autor, numeroEjemplares, numeroPrestados);
        this.curso = curso;
    }

    public String getCurso() { return curso; }
    public void setCurso(String curso) { this.curso = curso; }

    @Override
    public String toString() {
        return "LibroTexto {" +
                "titulo='" + getTitulo() + '\'' +
                ", autor='" + getAutor() + '\'' +
                ", ejemplares=" + getNumeroEjemplares() +
                ", prestados=" + getNumeroPrestados() +
                ", curso='" + curso + '\'' +
                '}';
    }
}