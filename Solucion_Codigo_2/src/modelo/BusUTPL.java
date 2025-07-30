package modelo;

public class BusUTPL extends Movilidad {
    private String tipoUsuario;

    public BusUTPL(String origen, String destino, String tipoUsuario) {
        super("Bus UTPL", origen, destino, 0, 0);
        this.tipoUsuario = tipoUsuario;
    }

    @Override
    public double calcularCosto() {
        return 0; // servicio gratuito
    }
}