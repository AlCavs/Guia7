/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Un cine necesita implementar un sistema en el que se puedan cargar peliculas.
 * Para esto, tendremos una clase Pelicula con el título, director y duración de
 * la película (en horas). Implemente las clases y métodos necesarios para esta
 * situación, teniendo en cuenta lo que se pide a continuación: En el servicio
 * deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
 * todos sus datos y guardándolos en el objeto Pelicula. Después, esa Pelicula
 * se guarda una lista de Peliculas y se le pregunta al usuario si quiere crear
 * otra Pelicula o no. Después de ese bucle realizaremos las siguientes
 * acciones:
 *
 * • Mostrar en pantalla todas las películas. • Mostrar en pantalla todas las
 * películas con una duración mayor a 1 hora. • Ordenar las películas de acuerdo
 * a su duración (de mayor a menor) y mostrarlo en pantalla. • Ordenar las
 * películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
 * pantalla. • Ordenar las películas por título, alfabéticamente y mostrarlo en
 * pantalla. • Ordenar las películas por director, alfabéticamente y mostrarlo
 * en pantalla.
 *
 * @author NiLe
 */
public class ServicioPelicula {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public void crearPelicula(ArrayList<Pelicula> lista) {

        boolean si = true;
        int resp = 0;

        while (si) {
            Pelicula cinta = new Pelicula();

            System.out.println("Ingrese el nombre de la pelicula");
            cinta.setTitulo(sc.next());

            System.out.println("Ingrese el nombre del director de la produccion audiovisual");

            cinta.setDirector(sc.next());

            System.out.println("Ingrese la duracion de la cinta");
            cinta.setDuracion(sc.nextDouble());

            lista.add(cinta);

            System.out.println("Desea ingresar otro largometraje? 1- Si 2- No");
            resp = sc.nextInt();

            if (resp == 2) {
                System.out.println("Carga completa");
                si = false;
            } else if (resp != 1 && resp != 2) {
                System.out.println("Ingresó un numero incorrecto");
            }
        }
    }

    public void mostrarPeliculas(ArrayList<Pelicula> pelis) {
        for (int i = 0; i < pelis.size(); i++) {
            System.out.println("Pelicula N° " + (i + 1) + ": " + pelis.get(i));
        }
        System.out.println(" ");
    }

    public void unaHora(ArrayList<Pelicula> lista) {
        int cont = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getDuracion() > 1) {
                cont++;
            }
        }

            if (cont != 0) {
                System.out.println("Las cintas mayores a una hora son");
                for (int i = 0; i < lista.size(); i++) {
                    if (lista.get(i).getDuracion() > 1) {
                        System.out.println("Pelicula " + i + ": " + lista.get(i).getTitulo());
                    }
                }
            } else {
                System.out.println("No hay largometrajes mayores a 1 hora");
            }

    }

    public void ordenMayor(ArrayList<Pelicula> lista) {
        System.out.println("Orden de Mayor a Menor por duracion");
        lista.sort(Pelicula.durACom);
        mostrarPeliculas(lista);

    }

    public void ordenMenor(ArrayList<Pelicula> lista) {
        System.out.println("Orden de Menor a Mayor por duracion");

        lista.sort(Pelicula.durDCom);
        mostrarPeliculas(lista);

    }

    public void ordenTitulo(ArrayList<Pelicula> lista) {
        System.out.println("Orden alfabético por Titulo");

        lista.sort(Pelicula.titCom);
        mostrarPeliculas(lista);

    }

    public void ordenDirector(ArrayList<Pelicula> lista) {
        System.out.println("Orden alfabético por Director");

        lista.sort(Pelicula.dirCom);
        mostrarPeliculas(lista);

    }
}
