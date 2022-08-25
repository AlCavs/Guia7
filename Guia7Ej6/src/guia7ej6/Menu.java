/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia7ej6;

import java.util.HashMap;
import java.util.Scanner;
import servicios.ServicioProducto;

/**
 *
 * @author NiLe
 */
public class Menu {

    public Menu() {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        HashMap<String, Double> lista = new HashMap();
        
        ServicioProducto sp = new ServicioProducto();
        
        boolean si = true;
        int op = 0;

        do {
            System.out.println("Ingrese la opcion del menú:\n1- Ingresar producto.\n2- Modificar precio.\n3- Eliminar producto.\n4- Mostrar lista de productos.\n5- Salir");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    sp.crearProducto(lista);
                    break;
                case 2:
                    sp.modificarPrecio(lista);
                    break;
                case 3:
                    sp.eliminarProducto(lista);
                    break;
                case 4:
                    sp.mostrarProductos(lista);
                    break;
                case 5:
                    System.out.println("Adios, muchas gracias");
                    si = false;
                    break;
                default:
                    System.out.println("Ingresó una opcion incorrecta, intente nuevamente");
            }
        System.out.println("-------------");
        } while (si);
        
    }
}
