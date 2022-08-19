/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Perro;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author NiLe
 */
public class ServicioPerro {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public void crearPerro(ArrayList<Perro> p){
        
        boolean si = true;
        while(si){
            System.out.println("Desea agregar un perro?\n1- Si\n2- No");
            int resp = sc.nextInt();
            if(resp == 1){
                Perro p1 = new Perro();
                System.out.println("Ingrese la raza");
                p1.setRaza(sc.next());
                p.add(p1);
            }else if (resp == 2){
                System.out.println("Adios, muchas gracias");
                si = false;
            }else{
                System.out.println("Ingresó una opcion incorrecta");
            }
        }        
    }
    
}
