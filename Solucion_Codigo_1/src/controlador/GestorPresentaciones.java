    package controlador;

import modelo.Presentacion;

import java.util.ArrayList;
import java.util.List;

public class GestorPresentaciones {
    private List<Presentacion> presentaciones;

    public GestorPresentaciones() {
        presentaciones = new ArrayList<>();
    }

    public void agregarPresentacion(Presentacion p) {
        presentaciones.add(p);
    }

    public List<Presentacion> getPresentaciones() {
        return presentaciones;
    }
}
