
public class PilaPrestamo {
     public NodoPrestamo pila;
    
    public PilaPrestamo(){
        pila = null;
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
    }
      
        public String recorrerPila(){
          String datos = "";
          NodoPrestamo aux = pila;
        
        if(pila == null){
           datos = "LA LISTA ESTA VACIA";
        }
        else{
            while(aux != null){
                datos+= "LA FECHA DE INICIO ES: "+aux.getPrestamo().getFecha_inicio()+"\n";
                datos+= "LA FECHA FINAL ES: "+aux.getPrestamo().getFecha_final()+"\n";
                datos+= "EL NOMBRE DEL ASESOR: "+aux.getPrestamo().getNombre_empleado()+"\n";
                datos+= "LA COMISION DEL LIBRO "+aux.getPrestamo().getComisionporlibro()+"\n";
                aux = aux.getAptSiguiente();
            }
        }
        return datos;
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
        }
        return mensaje;
    }
}
