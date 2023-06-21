
import javax.swing.JOptionPane;

public class PilaAlumno {
    
    public NodoAlumno pila;
    private int cantnodos;
    public PilaAlumno(){
        pila = null;
    }

    public int getCantnodos() {
        return cantnodos;
    }
    
    
     public void push(Alumnos alumno){
     NodoAlumno nuevo = new NodoAlumno(alumno);
        
        if(pila == null){
            pila = nuevo;
        }
        else{
            NodoAlumno aux = pila;
            pila = nuevo;
            nuevo.setAptSiguiente(aux);
        }
        cantnodos++;
    }
      
    public Alumnos [] recorrerPila(){
    NodoAlumno aux = pila;
    Alumnos[] alumnos = new Alumnos[cantnodos];
    int j=0;
    int I=1;
    if(pila==null){
    JOptionPane.showMessageDialog(null, "pila esta vacia");
    }else {
        while(aux != null){
           alumnos[j]= aux.getAlumno();
            aux = aux.getAptSiguiente();
            j++;
            I++;
        }
    }
    return alumnos;
    }
        
    
    public String pop(){
        String mensaje =  "";
        NodoAlumno aux = pila;
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
