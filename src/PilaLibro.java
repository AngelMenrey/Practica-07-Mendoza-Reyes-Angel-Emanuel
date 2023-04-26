public class PilaLibro {
    public NodoLibro pila;
    
     public PilaLibro(){
        pila = null;
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
    }
      
        public String recorrerPila(){
          String datos = "";
          NodoLibro aux = pila;
        
        if(pila == null){
           datos = "LA LISTA ESTA VACIA";
        }
        else{
            while(aux != null){
                datos+= "EL AUTOR DEL LIBRO : "+aux.getLibro().getAutor()+"\n";
                datos+= "El NOMBRE DEL LIBRO: "+aux.getLibro().getNom_libro()+"\n";
                datos+= "LA EDITORIAL DEL LIBRO: "+aux.getLibro().getEditorial()+"\n";
                datos+= "El NUMERO DE PAGINAS DEL LIBRO: "+aux.getLibro().getNum_paginas()+"\n";
                aux = aux.getAptSiguiente();
            }
        }
        return datos;
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
        }
        return mensaje;
    }
}
