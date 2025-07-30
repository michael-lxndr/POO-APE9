package controlador;

import modelo.*;

public class ControladorMovilidad {

    public void mostrarFactura(Movilidad m, Usuario u) {
        System.out.println(m.generarFactura(u));
    }

    public void calificarServicio(Usuario u, int estrellas, String comentario) {
        Calificacion c = new Calificacion(estrellas, comentario);
        System.out.println("Gracias por su valoración: " + c.getEstrellas() + " estrellas. Comentario: " + c.getComentario());
    }
}