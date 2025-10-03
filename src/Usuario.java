import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private String cedula;
    private List<Libro> librosPrestados;

    public Usuario(String nombre,String cedula){
        this.nombre = nombre;
        this.cedula=cedula;
        this.librosPrestados= new ArrayList<>();

    }
    public void prestarLibro(Libro libro){
        librosPrestados.add(libro);

    }
    public void devolverLibro(Libro libro){
        librosPrestados.remove(libro);

    }







}
