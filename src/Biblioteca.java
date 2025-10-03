import com.sun.source.doctree.SeeTree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Biblioteca {
    private String nombre;
    private List<Libro> catalogo;
    private List<Usuario> usuarios;

    public Biblioteca(String nombre, List<Usuario> usuarios, List<Libro> catalogo) {
        this.nombre = nombre;
        this.catalogo = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void agregarLibro(Libro libro){
        catalogo.add(libro);
    }

    public List<Libro> buscarPorTitulo(String titulo){
        return catalogo.stream().filter(libro -> libro.getTitulo().equalsIgnoreCase(titulo))
                .collect(Collectors.toList());

    }



    public void agregarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public List<Libro> getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(List<Libro> catalogo) {
        this.catalogo = catalogo;
    }
}

