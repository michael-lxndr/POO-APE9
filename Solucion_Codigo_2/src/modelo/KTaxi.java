package modelo;

public class KTaxi extends Movilidad {
    private double tarifaPorKm = 0.50;
    private double tarifaPorMinuto = 0.20;

    public KTaxi(String origen, String destino, double distanciaKm, double tiempoMinutos) {
        super("KTaxi", origen, destino, distanciaKm, tiempoMinutos);
    }

    @Override
    public double calcularCosto() {
        return distanciaKm * tarifaPorKm + tiempoMinutos * tarifaPorMinuto;
    }
}