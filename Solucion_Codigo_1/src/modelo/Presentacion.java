package modelo;

public abstract class Presentacion {
    protected String titulo;
    protected int duracionMin;
    protected int aforo;
    protected RecursoTecnico recursos;

    public Presentacion(String titulo, int duracionMin, int aforo, RecursoTecnico recursos) {
        this.titulo = titulo;
        this.duracionMin = duracionMin;
        this.aforo = aforo;
        this.recursos = recursos;
    }

    public double calcularCostoBase() {
        double totalRecursos = recursos.getCostoTotal();
        return aforo / totalRecursos;
    }

    public abstract double calcularCostoFinal();

    public String getTitulo() { return titulo; }
    public int getDuracion() { return duracionMin; }
    public int getAforo() { return aforo; }
    public RecursoTecnico getRecursos() { return recursos; }
}
