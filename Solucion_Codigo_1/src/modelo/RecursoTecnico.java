package modelo;

public class RecursoTecnico {
    private double costoSonido;
    private double costoIluminacion;
    private double costoEscenografia;

    public RecursoTecnico(double costoSonido, double costoIluminacion, double costoEscenografia) {
        this.costoSonido = costoSonido;
        this.costoIluminacion = costoIluminacion;
        this.costoEscenografia = costoEscenografia;
    }

    public double getCostoTotal() {
        return costoSonido + costoIluminacion + costoEscenografia;
    }

    public double getCostoSonido() { return costoSonido; }
    public double getCostoIluminacion() { return costoIluminacion; }
    public double getCostoEscenografia() { return costoEscenografia; }
}
