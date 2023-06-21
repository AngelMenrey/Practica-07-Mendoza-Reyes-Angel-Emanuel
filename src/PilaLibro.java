
import javax.swing.JOptionPane;

public class PilaLibro {
    public NodoLibro pila;
    private int cantnodos;
    
     public PilaLibro(){
        pila = null;
    }

    public int getCantnodos() {
        return cantnodos;
    }
     
     public void push(Libro libro){
        NodoLibro nuevo = new NodoLibro(libro);
        
        if(pila == null){
            pila = nuevo;
        }
        else{
            NodoLibro aux = pila;
            pila = nuevo;
            nuevo.setAptSiguiente(aux);
        }
        cantnodos++;
    }
     
    public Libro [] recorrerPila(){
    NodoLibro aux = pila;
    Libro[] libros = new Libro[cantnodos];
    int j=0;
    int I=1;
    if(pila==null){
    JOptionPane.showMessageDialog(null, "pila esta vacia"); 
    }else {
        while(aux != null){
           libros[j]= aux.getLibro();
            aux = aux.getAptSiguiente();
            j++;
            I++;
        }
    }
    return libros;
    }
    
    public String pop(){
        String mensaje =  "";
        NodoLibro aux = pila;
        if(pila == null){
            mensaje = "LA PILA ESTA VACIA ";
        }
        else{
            if(aux.getAptSiguiente() == null){
                pila = null;
            }
            else{
                pila = aux.getAptSiguiente();
                mensaje = "SE ELIMINO CORRECTAMENTE";
            }
            cantnodos--;
        }
        return mensaje;
    }
}
