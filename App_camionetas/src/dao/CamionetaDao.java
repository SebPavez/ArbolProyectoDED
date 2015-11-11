
package dao;
import dto.Camioneta;


public class CamionetaDao {
private Arbol camionetas;

private Arbol<Nodo> arbol;

public CamionetaDao(){
    this.camionetas = new Arbol();
}

public void agregarCamineta(Camioneta camioneta){
    this.camionetas.agregarNodo(camioneta);
}

public void mostrarCamionetas(){
    this.camionetas.recorrerPreOrden();
}
    
public void AsignarPuntaje()
{
    if(txtAnjoFabricacion)
    
    
}

}
