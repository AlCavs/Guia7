/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Producto;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 * @author NiLe
 */
public class ServicioProducto {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
    public void crearProducto(HashMap<String,Double> lista){
        boolean si = true;
        
        while (si){
            Producto p = new Producto();
            
            System.out.println("Ingrese el nombre del producto");
            p.setProducto(sc.next());
            System.out.println("Ingrese el precio del producto");
            p.setPrecio(sc.nextDouble());
            
        System.out.println("-------------");
            lista.put(p.getProducto(), p.getPrecio());
            
            System.out.println("Desea agregar otro producto? 1 - Si 2 - No");
            int resp = sc.nextInt();
            if ( resp == 2){
                System.out.println("Carga completa");
                si = false; 
            }else if ( resp != 1 && resp !=2){
                System.out.println("Ingreso una opcion incorrecta");
            }
        }
        
        System.out.println("-------------");
    }
    public void modificarPrecio(HashMap<String,Double> lista){
        System.out.println("Ingrese el nombre del producto a modificar su precio");
        String prod = sc.next();
        int cont = 0;
        
        for (Map.Entry<String,Double> aux:lista.entrySet()){
            if(prod.equalsIgnoreCase(aux.getKey())){
                System.out.println("El precio actual es de: " + aux.getValue());
                System.out.println("Ingrese el nuevo precio");
                aux.setValue(sc.nextDouble());
                cont++;
            }
        }
             if (cont == 0){
                 System.out.println("El producto no existe");
             }
             
        System.out.println("-------------");
    }
    public void eliminarProducto(HashMap<String,Double> lista){
        System.out.println("Ingrese el nombre del producto a eliminar");
        String prod = sc.next();
        int cont = 0;
        
        for (Map.Entry<String, Double> aux : lista.entrySet()) {
            if(aux.getKey().equalsIgnoreCase(prod)){
                lista.remove(aux.getKey(),aux.getValue());
                System.out.println("Producto eliminado");
                cont++;
            }
        }
        
        if (cont == 0){
            System.out.println("El producto no existe o ya fue eliminado");
        }
        
        System.out.println("-------------");
    }
    public void mostrarProductos(HashMap<String,Double> lista){
        System.out.println("Lista de productos:");
        
        for (Map.Entry<String, Double> aux : lista.entrySet()) {
            System.out.println(aux);            
        }
        System.out.println("-------------");
      
    }
}
