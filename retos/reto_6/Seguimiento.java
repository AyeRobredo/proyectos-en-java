import java.util.ArrayList;
import java.util.List;

public class Seguimiento {
    List<Socio> socios;
    List<Libro> libros;
    List<Prestamo> prestamos;

    public Seguimiento(){
        libros = new ArrayList<>();
        socios = new ArrayList<>();
        prestamos = new ArrayList<>();
    }

    public void agregarLibro(Libro libro){
        libros.add(libro);
        System.out.println("Libro agregado con exito" + libro.getTitulo());
    }

    public void agregarSocio(Socio socio){
        socios.add(socio);
        System.out.println("Socio agregado con exito" + socio.getNombreCompleto());
    }

    public void agregarPrestamo(Prestamo prestamo){
        prestamos.add(prestamo);
        System.out.println("Prestamo agregado con exito" + prestamo.getLibro() + prestamo.getSocio());
    }

    public List<Socio> getSocios() {
        return socios;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void prestamosLibro(String codigoLibro){
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getLibro().getCodigo().equals(codigoLibro)){
                System.out.println("Socio: "+ prestamo.getSocio().getNombreCompleto() + "Fecha adquisicion: "+ prestamo.getFecha() + "Fecha devolucion: " + prestamo.getFechaDevolucion());
            }
        // Falta agregar logica para ver si tiene un prestamo activo o no
        }
    }

    public void prestamosSocio(int numeroSocio){
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getSocio().getNumero()==(numeroSocio)){
                System.out.println("Socio: "+ prestamo.getSocio().getNombreCompleto() + "Libro " + prestamo.getLibro().getTitulo() + "Fecha adquisicion: "+ prestamo.getFecha());
                if (prestamo.getFechaDevolucion() == null) {
                    System.out.println("Este préstamo está activo (sin fecha de devolución).");
                } else {
                    System.out.println("Fecha de devolución: " + prestamo.getFechaDevolucion());
                }
            }
            // Falta agregar logica por si no tiene prestamos el socio aun        
        }
    }

}
