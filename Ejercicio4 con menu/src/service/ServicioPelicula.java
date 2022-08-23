
package service;

import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Chuky
 */
public class ServicioPelicula {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    
    public void crearPelicula( ArrayList<Pelicula> x){
        
        var seguir = true;
        var op = 1;
        while (seguir) {
     Pelicula p=new Pelicula();
            if(op ==1 ){
                System.out.println("Ingrese el nombre de la pelicula");
            p.setTitulo(sc.next());
            System.out.println("Ingrese el Titulo del director");
            p.setDirector(sc.next());
            System.out.println("Ingrese La duracion en horas");
            p.setDuracion(Integer.parseInt(sc.next()));
            
            x.add(p);
            System.out.println("Desea agregar otra pelicula? 1-Si 2-No");
            op = Integer.parseInt(sc.next());
            }
            else if(op == 2){
                System.out.println("Gracias");
                seguir = false;
            }else if(op != 1 && op !=2){
                System.out.println("Numero incorrecto ingrese de nuevo");
                System.out.println("Desea agregar otra pelicula? 1-Si 2-No");
            op = Integer.parseInt(sc.next());
            }
            
            
        }
    }
    
    public void mostrarPelicula(ArrayList<Pelicula> x){
        System.out.println("---------------------------------------------");
        for (Pelicula pelicula : x) {
            System.out.println(pelicula);
        }
        System.out.println("---------------------------------------------");
    }
    
    public void peliculasLargas(ArrayList<Pelicula> x){
        int cont = 0;
        System.out.println("---------------------------------------------");
        System.out.println("Las peliculas mas largas que una hora son:");
        for (Pelicula aux : x) {
            if(aux.getDuracion()> 1){
                System.out.println(aux.getTitulo());
                cont++;
            }
        }
            if(cont == 0){
                System.out.println("Ninguna pelicula es mayor a 1 hora");
            }
         System.out.println("---------------------------------------------");
    }
    
    public void ordenAs(ArrayList<Pelicula> x){
        x.sort(Pelicula.durAs);
        mostrarPelicula(x);
    }
    public void ordenDs(ArrayList<Pelicula> x){
        x.sort(Pelicula.durDs);
        mostrarPelicula(x);
    }
    
    public void ordenT(ArrayList<Pelicula>x){
        x.sort(Pelicula.ordenT);
        mostrarPelicula(x);
    }
    public void ordenD(ArrayList<Pelicula>x){
        x.sort(Pelicula.ordenD);
        mostrarPelicula(x);
    }
    
}

