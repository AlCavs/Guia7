package entidad;

import java.util.Comparator;
import java.util.Objects;

/**
 *
 * @author Chuky
 */
public class Pais {
    
    private String nombre;

    public Pais() {
    }

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pais other = (Pais) obj;
        return Objects.equals(this.nombre, other.nombre);
    }
    
    
    public static Comparator<Pais> compara = (Pais t, Pais t1) -> t.getNombre().compareToIgnoreCase(t1.getNombre());
}