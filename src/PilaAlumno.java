public class PilaAlumno {
    
    public NodoAlumno pila;
    
    public PilaAlumno(){
        pila = null;
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
    }
      
        public String recorrerPila(){
          String datos = "";
          NodoAlumno aux = pila;
        
        if(pila == null){
           datos = "LA LISTA ESTA VACIA";
        }
        else{
            while(aux != null){
                datos+= "EL NOMBRE DEL ALUMNO : "+aux.getAlumno().getNombre()+"\n";
                datos+= "EL APELLIDO DEL ALUMNO: "+aux.getAlumno().getApellido()+"\n";
                datos+= "EL DOMICILIO DEL ALUMNO: "+aux.getAlumno().getDomicilio()+"\n";
                datos+= "EL REGISTRO DEL ALUMNO: "+aux.getAlumno().getRegistro()+"\n";
                aux = aux.getAptSiguiente();
            }
        }
        return datos;
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
        }
        return mensaje;
    }
}
