package uniandes.cupi2.avion.test;

import java.util.ArrayList;

import uniandes.cupi2.avion.mundo.Pasajero;
import uniandes.cupi2.avion.mundo.Pelicula;
import junit.framework.TestCase;

/**
 * Esta es la clase usada para verificar que los m�todos de la clase Pasajero est�n correctamente implementados.
 */
public class PasajeroTest extends TestCase
{
	// -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Pasajero 1
     */
    private Pasajero pasajero;

    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------
    
    /**
     * Escenario 1: Crea un pasajero sin pel�culas.
     */
    private void setupEscenario1()
    {
    	pasajero = new Pasajero(123456, "Radamel Falcao");
    }
    
    /**
     * Escenario 2: Crea un pasajero con pel�culas.
     */
    private void setupEscenario2()
    {
    	pasajero = new Pasajero(123456, "Radamel Falcao");
    	pasajero.agregarPelicula("p1", Pelicula.ACCION, 111, "d1");
    	pasajero.agregarPelicula("p2", Pelicula.COMEDIA, 222, "d2");
    	pasajero.agregarPelicula("p3", Pelicula.DRAMA, 333, "d3");
    	pasajero.agregarPelicula("p4", Pelicula.ROMANCE, 444, "d4");
    	pasajero.agregarPelicula("p5", Pelicula.ACCION, 555, "d5");
    	pasajero.agregarPelicula("p6", Pelicula.COMEDIA, 111, "d6");
    }
    
    /**
     * Escenario 3: Crea un pasajero con pel�culas.
     */
    private void setupEscenario3()
    {
    	pasajero = new Pasajero(123456, "Radamel Falcao");
    	pasajero.agregarPelicula("p1", Pelicula.ACCION, 111, "d1");
    	pasajero.agregarPelicula("p2", Pelicula.COMEDIA, 222, "d2");
    	pasajero.agregarPelicula("p3", Pelicula.DRAMA, 333, "d3");
    	pasajero.agregarPelicula("p4", Pelicula.ROMANCE, 444, "d4");
    	pasajero.agregarPelicula("p5", Pelicula.ACCION, 555, "d5");
    }
    
    /**
     * Prueba 1: Verifica que el pasajero sea creado correctamente, creando la lista de pel�culas vac�a.
     */
    public void testCrearPasajero()
    {
    	setupEscenario1();
    	assertEquals("El nombre deber�a ser Radamel Falcao.", "Radamel Falcao", pasajero.darNombre());
    	assertEquals("La c�dula deber�a ser 123456.", 123456 , pasajero.darCedula());
    	assertNotNull("No deber�a ser nulo.", pasajero.darPeliculas());
    	assertEquals("La lista no deber�a tener nada.", 0, pasajero.darPeliculas().size());
    }
    
    /**
     * Prueba 2: Verifica que el pasajero  aumenta en 1 al agregar una pel�cula.
     */
    public void testAgregarPelicula()
    {
    	setupEscenario1();
    	assertEquals("La lista no deber�a tener nada.", 0, pasajero.darPeliculas().size());
    	pasajero.agregarPelicula("p1", Pelicula.ACCION, 111, "d1");
    	assertEquals("La lista deber�a ser tama�o 1.", 1, pasajero.darPeliculas().size());
    }
    
    /**
     * Prueba 3: Verifica que el m�todo darDuracionTotalPeliculas est� correctamente implementado.
     */
    public void testDarDuracionTotalPeliculas()
    {
    	setupEscenario1();
    	assertEquals("La duraci�n deber�a ser 0 minutos.", 0, pasajero.darDuracionTotalPeliculas());
    	
    	setupEscenario2();
    	assertEquals("La duraci�n deber�a ser 1776 minutos.", 1776, pasajero.darDuracionTotalPeliculas());
    }
    
    /**
     * Prueba 4: Verifica que el m�todo darPeliculasGenero est� correctamente implementado.
     */
    public void testDarPeliculasGenero()
    {
    	setupEscenario2();
    	ArrayList<Pelicula> lista = pasajero.darPeliculasGenero(Pelicula.ACCION);
    	ArrayList<Pelicula> lista2 = pasajero.darPeliculasGenero(Pelicula.COMEDIA);
    	ArrayList<Pelicula> lista3 = pasajero.darPeliculasGenero(Pelicula.DRAMA);
    	ArrayList<Pelicula> lista4 = pasajero.darPeliculasGenero(Pelicula.INFANTIL);
    	ArrayList<Pelicula> lista5 = pasajero.darPeliculasGenero(Pelicula.ROMANCE);
    	
    	assertEquals("El tama�o de la lista deber�a ser 2.", 2, lista.size());
    	assertEquals("El tama�o de la lista deber�a ser 2.", 2, lista2.size());
    	assertEquals("El tama�o de la lista deber�a ser 1.", 1, lista3.size());
    	assertEquals("El tama�o de la lista deber�a ser 0.", 0, lista4.size());
    	assertEquals("El tama�o de la lista deber�a ser 1.", 1, lista5.size());
    }
    
    /**
     * Prueba 5: Verifica que el m�todo tienePeliculasMismaDuracion est� correctamente implementado.
     */
    public void testTienePeliculasMismaDuracion()
    {
    	setupEscenario2();
    	assertTrue("Deber�a ser verdadero.", pasajero.tienePeliculasMismaDuracion());
    	
    	setupEscenario3();
    	assertFalse("Deber�a ser falso.", pasajero.tienePeliculasMismaDuracion());
    }
    
    
}
