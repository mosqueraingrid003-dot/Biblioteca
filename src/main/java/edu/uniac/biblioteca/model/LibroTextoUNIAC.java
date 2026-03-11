package edu.uniac.biblioteca.model;

public class LibroTextoUNIAC extends LibroTexto {

    private String facultad;

    public LibroTextoUNIAC() {
        super();
        this.facultad = "";
    }

    public LibroTextoUNIAC(String titulo, String autor, int numeroEjemplares, int numeroPrestados,
                           String curso, String facultad) {
        super(titulo, autor, numeroEjemplares, numeroPrestados, curso);
        this.facultad = facultad;
    }

    public String getFacultad() { return facultad; }
    public void setFacultad(String facultad) { this.facultad = facultad; }

    @Override
    public String toString() {
        return "LibroTextoUNIAC {" +
                "titulo='" + getTitulo() + '\'' +
                ", autor='" + getAutor() + '\'' +
                ", ejemplares=" + getNumeroEjemplares() +
                ", prestados=" + getNumeroPrestados() +
                ", curso='" + getCurso() + '\'' +
                ", facultad='" + facultad + '\'' +
                '}';
    }
}