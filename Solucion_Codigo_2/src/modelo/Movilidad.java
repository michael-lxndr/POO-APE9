package modelo;

public abstract class Movilidad {
    protected String nombre;
    protected String origen;
    protected String destino;
    protected double distanciaKm;
    protected double tiempoMinutos;

    public Movilidad(String nombre, String origen, String destino, double distanciaKm, double tiempoMinutos) {
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
        this.distanciaKm = distanciaKm;
        this.tiempoMinutos = tiempoMinutos;
    }

    public abstract double calcularCosto();

    public String generarFactura(Usuario usuario) {
        return "Factura para: " + usuario.getNombre() +
               "\nServicio: " + nombre +
               "\nDesde: " + origen + " hasta: " + destino +
               "\nDistancia: " + distanciaKm + " km" +
               "\nTiempo: " + tiempoMinutos + " min" +
               "\nTotal: $" + calcularCosto();
    }
}