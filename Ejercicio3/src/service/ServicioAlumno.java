/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entidad.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Chuky
 */
public class ServicioAlumno {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public void crearAlumno(ArrayList<Alumno> x) {
        boolean bandera = true;
        int not,opc;
        
        while (bandera) {
            
            Alumno a = new Alumno();
            System.out.println("Ingrese el nombre del alumno");
            a.setNombre(sc.next());

            System.out.println("Ingrese la 1 nota: ");
            not = Integer.parseInt(sc.next());
            a.getNotas().add(not);
            System.out.println("Ingrese la 2 nota: ");
            not = Integer.parseInt(sc.next());
            a.getNotas().add(not);
            System.out.println("Ingrese la 3 nota: ");
            not = Integer.parseInt(sc.next());
            a.getNotas().add(not);
            x.add(a);
            
            System.out.println("Desea agregar otro alumno?\n 1- SI 2-NO");
            opc = Integer.parseInt(sc.next());
            if (opc == 2){
                bandera = false;
                System.out.println("Carga terminada");
            }else if(opc != 1 && opc !=2){
                System.out.println("Numero incorrecto intente de nuevo");
            }
        }
    }
    
    public void mostrar(ArrayList<Alumno> x){
        for (Alumno alumno : x) {
            System.out.println(alumno);
            }
        }
    
    public double buscarAlumno(ArrayList<Alumno> x){
        System.out.println("Ingrese el nombre del alumno a buscar");
        String alumno = sc.next();
        double nota =0;
        boolean esta = false;
        for(Alumno aux : x){
            if(aux.getNombre().equalsIgnoreCase(alumno)){
              nota = notaFinal(aux);
              esta = true; 
            }
        }
        if (!esta){
            System.out.println("El alumno no se encuentra");
        }
        return nota;
    }
    private double notaFinal(Alumno x){
        double prom = 0;
        for (int nota : x.getNotas()) {
           
            prom += nota;
        }
         return prom/3;   
        }
        
    }

