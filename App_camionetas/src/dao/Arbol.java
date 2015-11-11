
package dao;
import dto.Camioneta;

public class Arbol <T>{
    
    private Nodo raiz;
    
    public Arbol(){
        this.raiz = null;
    }
    
    public void agregarNodo(Camioneta auto){
        if(this.raiz == null){
            this.raiz = new Nodo(auto);
        }else{
            this.raiz.insertar(auto);
        }
    }
    
    public void preOrden(Nodo nodo){
        if(nodo == null){
            return;
        }
        System.out.println(nodo.getDato()+" ");
        this.preOrden(nodo.getNodoIzq());
        this.preOrden(nodo.getNodoDer());
    }
    
    public void recorrerPreOrden() {
        this.preOrden(this.raiz);
    }
  
    public Nodo getRaiz(){
        return raiz;
    }
    
    
    
}
