public class Curso {
    private int idCurso;
    private String nombreCurso;
    private String horario;
    private String duracion;
    private String dias;
    private int cantEstudiantes;

    // Constructor
    public Curso(int idCurso, String nombreCurso, String horario, String duracion, String dias, int cantEstudiantes) {
        this.idCurso = idCurso;
        this.nombreCurso = nombreCurso;
        this.horario = horario;
        this.duracion = duracion;
        this.dias = dias;
        this.cantEstudiantes = cantEstudiantes;
    }

    // Métodos de acceso (getters)
    public int getIdCurso() {
        return idCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public String getHorario() {
        return horario;
    }

    public String getDuracion() {
        return duracion;
    }

    public String getDias() {
        return dias;
    }

    public int getCantEstudiantes() {
        return cantEstudiantes;
    }

}
