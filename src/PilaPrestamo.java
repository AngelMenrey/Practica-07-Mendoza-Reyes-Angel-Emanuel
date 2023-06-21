
import javax.swing.JOptionPane;


public class PilaPrestamo {
     public NodoPrestamo pila;
        private int cantnodos;
    public PilaPrestamo(){
        pila = null;
    }

    public int getCantnodos() {
        return cantnodos;
    }
    
     public void push(Prestamo prestamo){
        NodoPrestamo nuevo = new NodoPrestamo(prestamo);
        
        if(pila == null){
            pila = nuevo;
        }
        else{
            NodoPrestamo aux = pila;
            pila = nuevo;
            nuevo.setAptSiguiente(aux);
        }
        cantnodos++;
    }
      
    public Prestamo [] recorrerPila(){
    NodoPrestamo aux = pila;
    Prestamo[] prestamos = new Prestamo[cantnodos];
    int j=0;
    int I=1;
    if(pila==null){
    JOptionPane.showMessageDialog(null, "pila esta vacia");  
    }else {
        while(aux != null){
           prestamos[j]= aux.getPrestamo();
            aux = aux.getAptSiguiente();
            j++;
            I++;
        }
    }
    return prestamos;
    }
    
    public String pop(){
        String mensaje =  "";
        NodoPrestamo aux = pila;
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
