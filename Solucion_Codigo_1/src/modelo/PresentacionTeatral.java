package modelo;

public class PresentacionTeatral extends Presentacion {

    public PresentacionTeatral(String titulo, int duracionMin, int aforo, RecursoTecnico recursos) {
        super(titulo, duracionMin, aforo, recursos);
    }

    @Override
    public double calcularCostoFinal() {
        double base = calcularCostoBase();
        return base * 1.1 + duracionMin * 0.05;
    }
}
