package dao;

import dto.Camioneta;

public class Nodo {
    private Camioneta dato;
    private Nodo nodoIzq;
    private Nodo nodoDer;

    public Nodo(Camioneta dato) {
        this.dato = dato;
        this.nodoDer = null;
        this.nodoIzq = null;
    }

    public Camioneta getDato() {
        return dato;
    }

    public void setDato(Camioneta dato) {
        this.dato = dato;
    }

    public Nodo getNodoIzq() {
        return nodoIzq;
    }

    public void setNodoIzq(Nodo nodoIzq) {
        this.nodoIzq = nodoIzq;
    }

    public Nodo getNodoDer() {
        return nodoDer;
    }

    public void setNodoDer(Nodo nodoDer) {
        this.nodoDer = nodoDer;
    }  
    
    public synchronized boolean insertar(Camioneta nuevaCuenta){
        if(nuevaCuenta.hashCode()<this.dato.hashCode()){
            if(this.nodoIzq==null)
                this.nodoIzq = new Nodo(nuevaCuenta);
            else
                this.nodoIzq.insertar(nuevaCuenta);
            return true;
        }
        if(nuevaCuenta.hashCode()>this.dato.hashCode()){
            if(this.nodoDer==null)
                this.nodoDer = new Nodo(nuevaCuenta);
            else
                this.nodoDer.insertar(nuevaCuenta);
            return true;
        }
        return false;
    }   
    
}
