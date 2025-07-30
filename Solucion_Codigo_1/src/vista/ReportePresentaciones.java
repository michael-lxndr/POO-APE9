package vista;

import modelo.Presentacion;
import modelo.RecursoTecnico;

import java.util.List;

public class ReportePresentaciones {

    public void mostrarPresentacion(Presentacion p) {
        RecursoTecnico r = p.getRecursos();
        System.out.println("Título: " + p.getTitulo());
        System.out.println("Duración: " + p.getDuracion() + " minutos");
        System.out.println("Aforo: " + p.getAforo());
        System.out.println("Costo Base: $" + String.format("%.2f", p.calcularCostoBase()));
        System.out.println("Costo Final: $" + String.format("%.2f", p.calcularCostoFinal()));
        System.out.println("Recursos - Sonido: $" + r.getCostoSonido() + ", Iluminación: $" + r.getCostoIluminacion() + ", Escenografía: $" + r.getCostoEscenografia());
        System.out.println("----------------------------------------------------");
    }

    public void mostrarResumen(List<Presentacion> lista) {
        for (Presentacion p : lista) {
            mostrarPresentacion(p);
        }
    }
}
