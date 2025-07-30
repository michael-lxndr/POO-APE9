import modelo.*;
import vista.ReportePresentaciones;
import controlador.GestorPresentaciones;

public class AppFIAVL {
    public static void main(String[] args) {
        // Crear recursos técnicos
        RecursoTecnico recurso1 = new RecursoTecnico(1000, 800, 1200);
        RecursoTecnico recurso2 = new RecursoTecnico(600, 400, 900);

        // Crear presentaciones
        Presentacion p1 = new PresentacionMusical("Concierto Andino", 90, 600, recurso1);
        Presentacion p2 = new PresentacionTeatral("Obra de los Andes", 75, 300, recurso2);

        // Controlador
        GestorPresentaciones gestor = new GestorPresentaciones();
        gestor.agregarPresentacion(p1);
        gestor.agregarPresentacion(p2);

        // Vista
        ReportePresentaciones vista = new ReportePresentaciones();
        vista.mostrarResumen(gestor.getPresentaciones());
    }
}
