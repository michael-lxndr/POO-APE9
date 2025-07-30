package modelo;

public class Situ extends Movilidad {
    private boolean estudiante;
    private boolean discapacitado;

    public Situ(String origen, String destino, boolean estudiante, boolean discapacitado) {
        super("Situ", origen, destino, 0, 0);
        this.estudiante = estudiante;
        this.discapacitado = discapacitado;
    }

    @Override
    public double calcularCosto() {
        double tarifa = 0.30;
        if (estudiante || discapacitado) {
            tarifa /= 2;
        }
        return tarifa;
    }
}