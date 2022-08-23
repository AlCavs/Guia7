package entidad;

import java.util.HashSet;
import java.util.Scanner;
import service.ServicioPais;

/**
 *
 * @author Chuky
 */
public class Menu {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    public void menu (HashSet<Pais> x){
        boolean bandera = true;
        int op;
        ServicioPais p = new ServicioPais();
        do {
            System.out.println("Ingrese una opcion\n1-Cargar Pais\n2-Mostrar paises ordenados alfabeticamente\n3-Buscar y eliminar un pais\n4-Salir");
            op= Integer.parseInt(sc.next());
            switch (op) {
                case 1 -> p.cargaPais(x);
                case 2 -> p.ordenar(x);
                case 3 -> p.borrar(x);
                case 4 -> bandera = false;
                default -> System.out.println("Opcion erronea");
            }
            
        } while (bandera);
        
    }
    
}
