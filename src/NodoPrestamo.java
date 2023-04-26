public class NodoPrestamo {
    
    private Prestamo prestamo;
    private NodoPrestamo aptSiguiente;

    public NodoPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
        aptSiguiente = null;
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    public NodoPrestamo getAptSiguiente() {
        return aptSiguiente;
    }

    public void setAptSiguiente(NodoPrestamo aptSiguiente) {
        this.aptSiguiente = aptSiguiente;
    }    
}
