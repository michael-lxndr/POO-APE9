package vista;

import modelo.*;
import controlador.ControladorMovilidad;

public class VistaConsola {
    ControladorMovilidad controlador = new ControladorMovilidad();

    public void iniciar() {
        Usuario u = new Usuario("Ana Perez", "1100123456", "ana@utpl.edu.ec", "Estudiante", true, false);
        Movilidad m = new KTaxi("UTPL", "Parque Central", 5.0, 12.0);

        controlador.mostrarFactura(m, u);
        controlador.calificarServicio(u, 5, "Excelente servicio y puntualidad");
    }
}