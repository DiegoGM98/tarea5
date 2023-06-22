import java.util.ArrayList;

class Alumno {
    private String nombre;
    private String apellido;
    private String rut;
    private int numeroMatricula;

    public Alumno() {}

    public Alumno(String nombre, String apellido, String rut, int numeroMatricula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.numeroMatricula = numeroMatricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", rut='" + rut + '\'' +
                ", numeroMatricula=" + numeroMatricula +
                '}';
    }
}

class Curso {
    private ArrayList<Alumno> alumnos;

    public Curso() {
        alumnos = new ArrayList<>();
    }

    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    public void eliminarAlumno(Alumno alumno) {
        alumnos.remove(alumno);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Curso{");
        sb.append("alumnos=[");
        for (Alumno alumno : alumnos) {
            sb.append(alumno.toString());
            sb.append(",");
        }
        sb.append("]}");
        return sb.toString();
    }
}
