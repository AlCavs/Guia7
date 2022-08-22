/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import entidad.Alumno;
import java.util.ArrayList;
import service.ServicioAlumno;

/**
 *
 * @author Chuky
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Alumno> listado = new ArrayList();
        
        ServicioAlumno s = new ServicioAlumno();
        
        s.crearAlumno(listado);        
        var nota = s.buscarAlumno(listado);
        if(nota!=0){
            System.out.println("El promedio del alumno es: " +nota);
        }
    }
    
}
