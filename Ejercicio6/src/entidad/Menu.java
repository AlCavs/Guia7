package entidad;

import java.util.HashMap;
import java.util.Scanner;
import serice.ServicioProducto;

/**
 *
 * @author Chuky
 */
public class Menu {

    public void menu(HashMap<String, Double> x) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        ServicioProducto sp = new ServicioProducto();
        boolean bandera = true;
        int op;
        do {
            System.out.println("----------------------------------------------\nIngrese una opcion\n1-Ingresar Productos\n2-Mostrar lista de productos\n3-Modificar precio del producto\n4-Eliminar un producto\n5-Salir");
            op = Integer.parseInt(sc.next());
            System.out.println("----------------------------------------------------");
            switch (op) {
                case 1 ->
                    sp.cargarProducto(x);
                case 2 ->
                    sp.mostrar(x);
                case 3 ->
                    sp.modificar(x);
                case 4 ->
                    sp.eliminar(x);
                case 5 ->
                    bandera = false;
                default ->
                    System.out.println("Opcion incorrecta intente de nuevo");
            }
        } while (bandera);

    }
}
