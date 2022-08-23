
package servicios;

import entidades.Pais;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author agos.tutto
 */
public class ServicioPais {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public void crearPais(HashSet<Pais>paises) {
    boolean salir = true; 
    int respuesta = 0;
    while (salir) {
        Pais p1 = new Pais();
        System.out.println("Ingrese el nombre del pais");
        p1.setNombre(leer.next());
        System.out.println("Ingrese la cantidad de habitantes");
        p1.setHabitantes(leer.nextInt());
        paises.add(p1);
        System.out.println("desea agregar otro pais? 1-SI 2-NO");
        respuesta = leer.nextInt();
        if (respuesta==2) {
            salir = false;
            System.out.println("carga completa, gracias");
        } else if (respuesta!=1 && respuesta!=2){
            System.out.println("opcion incorrecta");
        }
        
    }
    }
    
    public void mostrarPais(HashSet<Pais>paises){
        for (Pais aux : paises) {
            System.out.println(aux);
        }
    }
    
    public void ordenarPaises(HashSet<Pais>paises){
        ArrayList<Pais> ordenado = new ArrayList(paises);
        ordenado.sort(Pais.alfa);
        for (Pais aux : ordenado) {
            System.out.println(aux);
        }
    }
    
    public void borrarPais(HashSet<Pais>paises){
        System.out.println("ingrese un pais a borrar:");
        String borrado = leer.next();
        Iterator<Pais>ite = paises.iterator();
        int cont = 0;
        while (ite.hasNext()){
            if (ite.next().getNombre().equals(borrado)){
                ite.remove();
                mostrarPais(paises);
                cont++;
            } 
        }
        if (cont==0){
            System.out.println("el pais no se encontro");
        }
    }
}
