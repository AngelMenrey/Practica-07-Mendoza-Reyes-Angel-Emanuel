public class NodoLibro {
    
private Libro libro;
private NodoLibro aptSiguiente;

    public NodoLibro(Libro libro) {
        this.libro = libro;
        aptSiguiente = null;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public NodoLibro getAptSiguiente() {
        return aptSiguiente;
    }

    public void setAptSiguiente(NodoLibro aptSiguiente) {
        this.aptSiguiente = aptSiguiente;
    }    
}
