package service;

import entidad.Pais;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


/**
 *
 * @author Chuky
 */
public class ServicioPais {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    public void cargaPais(Set<Pais> x){
        
        var s = true;
        var o=1;
        
        while (s) {
            Pais p = new Pais();
            switch (o) {
                case 1:
                    System.out.println("Ingrese el pais");
                    p.setNombre(sc.next());
                    x.add(p);
                    System.out.println("Desea ingresar otro pais?\n1-SI 2-NO");
                    o = Integer.parseInt(sc.next());
                    break;
                case 2:
                    System.out.println("gracias");
                    s = false;
                    mostrar(x);
                    break;
                default:
                    System.out.println("Error de opcion intente de nuevo");
                    System.out.println("Desea ingresar otro pais?\n1-SI 2-NO");
                    o = Integer.parseInt(sc.next());
                    break;
            }
        }
        
    }
    public void mostrar(Set<Pais> x){
        System.out.println("--------------------------------\nPaises\n--------------------------------");
        for (Pais pais : x) {
            System.out.println(pais.getNombre());
        }
        System.out.println("--------------------------------");
    }
    public void ordenar(Set<Pais> x){
        ArrayList<Pais> p = new ArrayList(x);
        Collections.sort(p,Pais.compara);
        System.out.println("--------------------------------\nPaises ordenados\n--------------------------------");
        for (Pais pais : p) {
            System.out.println(pais.getNombre());
        }
        System.out.println("--------------------------------");
    }
    public void borrar(Set<Pais>x){
        var pais = "";
        Iterator<Pais> it = x.iterator();
        System.out.println("Ingrese el pais que desea borrar");
        pais = sc.next();
        while (it.hasNext()) {
           if(it.next().getNombre().equals(pais)){
               it.remove();
           }
        }
        System.out.println("--------------------------------\nPais eliminado\n--------------------------------");
    }

}
