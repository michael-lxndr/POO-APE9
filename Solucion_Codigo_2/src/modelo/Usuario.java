package modelo;

public class Usuario {
    private String nombre;
    private String cedula;
    private String correo;
    private String tipoUsuario;
    private boolean estudiante;
    private boolean discapacitado;

    public Usuario(String nombre, String cedula, String correo, String tipoUsuario, boolean estudiante, boolean discapacitado) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.correo = correo;
        this.tipoUsuario = tipoUsuario;
        this.estudiante = estudiante;
        this.discapacitado = discapacitado;
    }

    public String getNombre() { return nombre; }
    public boolean isEstudiante() { return estudiante; }
    public boolean isDiscapacitado() { return discapacitado; }
    public String getTipoUsuario() { return tipoUsuario; }
}