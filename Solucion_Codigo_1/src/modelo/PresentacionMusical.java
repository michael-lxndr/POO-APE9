package modelo;

public class PresentacionMusical extends Presentacion {

    public PresentacionMusical(String titulo, int duracionMin, int aforo, RecursoTecnico recursos) {
        super(titulo, duracionMin, aforo, recursos);
    }

    @Override
    public double calcularCostoFinal() {
        double base = calcularCostoBase();
        double indiceAforo = (aforo >= 500) ? 0.05 : 0.01;
        return base + duracionMin * 0.08 + aforo * indiceAforo;
    }
}
