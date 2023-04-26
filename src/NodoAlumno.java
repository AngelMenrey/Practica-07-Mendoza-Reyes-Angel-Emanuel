public class NodoAlumno {
    
    private Alumnos alumno;
    private NodoAlumno aptSiguiente;

    public NodoAlumno(Alumnos alumno) {
        this.alumno = alumno;
        aptSiguiente = null;
    }

    public Alumnos getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumnos alumno) {
        this.alumno = alumno;
    }

    public NodoAlumno getAptSiguiente() {
        return aptSiguiente;
    }

    public void setAptSiguiente(NodoAlumno aptSiguiente) {
        this.aptSiguiente = aptSiguiente;
    } 
}
