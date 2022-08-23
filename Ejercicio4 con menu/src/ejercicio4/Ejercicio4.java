/*
 • Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package ejercicio4;

import Entidad.Menu;
import Entidad.Pelicula;
import java.util.ArrayList;

/**
 *
 * @author Chuky
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Pelicula> listado = new ArrayList();
        
        Menu men = new Menu();
        men.menu(listado);
        
    }
    
}
