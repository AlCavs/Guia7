package ejercicio6;

import entidad.Menu;
import java.util.HashMap;

/**
 *
 * @author Chuky
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        HashMap<String, Double> listado = new HashMap();

        Menu m = new Menu();
        m.menu(listado);
    }
}
