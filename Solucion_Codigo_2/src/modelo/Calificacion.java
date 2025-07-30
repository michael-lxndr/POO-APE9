package modelo;

public class Calificacion {
    private int estrellas;
    private String comentario;

    public Calificacion(int estrellas, String comentario) {
        this.estrellas = estrellas;
        this.comentario = comentario;
    }

    public int getEstrellas() { return estrellas; }
    public String getComentario() { return comentario; }
}