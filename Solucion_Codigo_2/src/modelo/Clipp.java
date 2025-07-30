package modelo;

public class Clipp extends Movilidad {
    private String metodoPago;

    public Clipp(String origen, String destino, double distanciaKm, double tiempoMinutos, String metodoPago) {
        super("Clipp", origen, destino, distanciaKm, tiempoMinutos);
        this.metodoPago = metodoPago;
    }

    @Override
    public double calcularCosto() {
        return distanciaKm * 0.4 + tiempoMinutos * 0.1;
    }
}