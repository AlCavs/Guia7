/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.ArrayList;
import java.util.Scanner;
import service.ServicioPelicula;

/**
 *
 * @author Chuky
 */
public class Menu {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    public void menu(ArrayList<Pelicula> x){
        ServicioPelicula sp = new ServicioPelicula();
        
                
        int opc;
        boolean bandera = true;
        do {
            System.out.println("Ingrese una opcion:\n1-Cargar Peliculas\n2-Mostrar en pantalla todas las películas.\n3-Mostrar en pantalla todas las películas con una duración mayor a 1 hora.\n4-Ordenar las películas de acuerdo a su duración Mayor a menor\n5-Ordenar las películas de acuerdo a su duración menor a Mayor\n6-Ordenar las películas por título\n7-Ordenar las películas por director\n8-Salir");
            opc = Integer.parseInt(sc.next());
            switch (opc) {
                case 1 -> sp.crearPelicula(x);
                case 2 -> sp.mostrarPelicula(x);
                case 3 -> sp.peliculasLargas(x);
                case 4 -> sp.ordenDs(x);
                case 5 -> sp.ordenAs(x);
                case 6 -> sp.ordenT(x);
                case 7 -> sp.ordenD(x);
                case 8 -> { 
                    bandera = false;
                    System.out.println("Gracias por utilizar el programa");
                }
                default -> System.out.println("Opcion incorrecta");
            }
        } while (bandera);
    }
}
