package uniandes.cupi2.avion.mundo;

public class Pelicula {
    public final static String ACCION = "accion";
    private String nombre;

    private String genero;

    private int duracion;

    private String director;

    public Pelicula(String pNombre, String pGener, int pDuracion, String pDirector) {
        nombre = pNombre;
        genero = pGener;
        duracion = pDuracion;
        director = pDirector;
    }

    /**
     * Retorna el nombre de la pelicula
     * 
     * @return nombre de la pelicula
     */
    public String darNombre() {
        return nombre;
    }

    /**
     * Retorna el genero de la pelicula
     * 
     * @return genero de la pelicula
     */
    public String darGenero() {
        return genero;
    }

    /**
     * Retorna la duracion de la pelicula
     * 
     * @return duración de la pelicula
     */
    public int darDuracion() {
        return duracion;
    }

    /**
     * Retorna la director de la pelicula
     * 
     * @return director de la pelicula
     */
    public String darDirector() {
        return director;
    }

    /**
     * Retorna una cadena de texto con la información de la película
     * siguiendo el siguiente formato:
     * <nombre> (<genero>). <duracion> minutos - director.
     * 
     * @return La cadena de texto con el formato definido.
     */
    public String toString() {
        return nombre + "(" + genero + ")." + duracion + " minutos -" + director + ".";
    }
}
