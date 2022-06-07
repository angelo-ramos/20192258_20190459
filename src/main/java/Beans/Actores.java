package Beans;

public class Actores {
    private int idActor;
    private String nombreActor;
    private int numCategorias;
    private int numPeliculas;

    public Actores(int idActor, String nombreActor, int numCategorias, int numPeliculas) {
        this.idActor = idActor;
        this.nombreActor = nombreActor;
        this.numCategorias = numCategorias;
        this.numPeliculas = numPeliculas;
    }

    public int getIdActor() {
        return idActor;
    }

    public void setIdActor(int idActor) {
        this.idActor = idActor;
    }

    public String getNombreActor() {
        return nombreActor;
    }

    public void setNombreActor(String nombreActor) {
        this.nombreActor = nombreActor;
    }

    public int getNumCategorias() {
        return numCategorias;
    }

    public void setNumCategorias(int numCategorias) {
        this.numCategorias = numCategorias;
    }

    public int getNumPeliculas() {
        return numPeliculas;
    }

    public void setNumPeliculas(int numPeliculas) {
        this.numPeliculas = numPeliculas;
    }
}
