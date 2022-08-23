package Entidad;

import java.util.Comparator;
import java.util.Objects;

/**
 *
 * @author Chuky
 */
public class Pelicula {
    private String titulo;
    private String director;
    private double duracion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, int duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula: " + titulo + " director: " + director + " duracion: " + duracion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.titulo);
        hash = 37 * hash + Objects.hashCode(this.director);
        hash = 37 * hash + (int)this.duracion;
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
        final Pelicula other = (Pelicula) obj;
        if (this.duracion != other.duracion) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        return Objects.equals(this.director, other.director);
    }
    
    
     public static Comparator<Pelicula> durAs = (Pelicula p, Pelicula p1) -> Double.compare(p.getDuracion(), p1.getDuracion());
     public static Comparator<Pelicula> durDs = (Pelicula p, Pelicula p1) -> Double.compare(p1.getDuracion(), p.getDuracion());
     public static Comparator<Pelicula> ordenT = (Pelicula t, Pelicula t1) -> t.getTitulo().compareToIgnoreCase(t1.getTitulo());
     public static Comparator<Pelicula> ordenD = (Pelicula t, Pelicula t1) -> t.getDirector().compareToIgnoreCase(t1.getDirector());
    
    
}
