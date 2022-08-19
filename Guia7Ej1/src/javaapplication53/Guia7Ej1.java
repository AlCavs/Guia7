/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication53;

import entidades.Perro;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import servicios.ServicioPerro;

/**
 *
 * @author NiLe
 */
public class Guia7Ej1 {

    /**
     * Diseñar un programa que lea y guarde razas de perros en un ArrayList de
     * tipo String. El programa pedirá una raza de perro en un bucle, el mismo
     * se guardará en la lista y después se le preguntará al usuario si quiere
     * guardar otro perro o si quiere salir. Si decide salir, se mostrará todos
     * los perros guardados en el ArrayList.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Perro> raza = new ArrayList();
        ServicioPerro sp = new ServicioPerro();
        sp.crearPerro(raza);
        for (Perro pe : raza) {
            System.out.println(pe);
        }

        System.out.println("Ingrese una raza a eliminar para siempre");
        String del = sc.next();
        int cont = 0;
        int pos = 0;

        Iterator<Perro> ite = raza.iterator();
        while (ite.hasNext()) {

            if (ite.next().getRaza().equalsIgnoreCase(del)) {
                ite.remove();
                System.out.println("Raza eliminada");
                cont++;
            }

        }

//        
//        for (Perro ite : raza) {
//            if(ite.getRaza().equals(del)){
//                
//                raza.remove(ite);
//                System.out.println("Raza eliminada");
//                cont++;
        if (cont == 0) {
            System.out.println("La raza no se encuentra");
        }
//            

        raza.sort(Perro.compararRaza);

        for (Perro pe : raza) {
            System.out.println(pe);
        }
    }

}
