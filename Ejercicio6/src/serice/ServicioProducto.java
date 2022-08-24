package serice;

import entidad.Producto;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Chuky
 */
public class ServicioProducto {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public void cargarProducto(HashMap<String, Double> x) {

        System.out.println("Ingrese el nombre del producto");
        Producto p = new Producto();
        p.setNombre(sc.next());
        System.out.println("Ingrese el precio del producto");
        p.setPrecio(sc.nextDouble());

        x.put(p.getNombre(), p.getPrecio());
    }

    public void mostrar(HashMap<String, Double> x) {
        for (Map.Entry<String, Double> entry : x.entrySet()) {
            System.out.println("Producto: " + entry.getKey());
            System.out.println("Precio: " + entry.getValue());
        }
    }

    public void modificar(HashMap<String, Double> x) {
        System.out.println("Ingrese el nombre del articulo a modificar");
        var pala = sc.next();
        for (Map.Entry<String, Double> entry : x.entrySet()) {
            if (entry.getKey().equals(pala)) {
                System.out.println("El precio antiguo es: " + entry.getValue());
                System.out.println("Ingrese el nuevo precio");
                x.replace(pala, sc.nextDouble());
            }

        }
    }

    public void eliminar(HashMap<String, Double> x) {
        System.out.println("Ingrese la palabra");
        var pala = sc.next();
        if (x.keySet().removeIf(key -> key.equals(pala))) {
            System.out.println("Producto Eliminado");
        } else {
            System.out.println("No se encontro el producto");
        }
    }

}
