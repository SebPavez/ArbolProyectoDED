
package dto;

public class Camioneta {
    
   
    // Letra ñ= nj
    
    private String patente;//-->Numero de patente por Camioneta
    private String marca;// --> Marca de la camioneta
    private int anjoFabricacion; // --> Año de fabricacion de la camioneta
    private String color; // --->Color de la camioneta
    private double tonelaje; //  --> Capacidad de peso que soporta la camioneta
    private String tipoCombustible;  //-->Tipo combustible que utiliza la camioneta
    private int kilometraje; // --> Kilometros recorridos de la camioneta
    private int kilometroPorLitro;//--> Kilometros que recorre la camionata por litro de combustible
    private int precio;//--> precio de venta de la camioneta
    private int score; //--> Puntuacion asociada a kilometraje,an
   
    public Camioneta() {
        this.patente = "";
        this.marca = "";
        this.anjoFabricacion = 0;
        this.color = "";
        this.tonelaje = 0;
        this.tipoCombustible = "";
        this.kilometraje = 0;
        this.kilometroPorLitro = 0;
        this.precio = 0;
        this.score = 0;
    }

    public Camioneta(String patente, String marca, int añoFabricacion, String color, double tonelaje, String tipoCombustible, int kilometraje, int kilometroPorLitro, int precio, int score) {
        this.patente = patente;
        this.marca = marca;
        this.anjoFabricacion = añoFabricacion;
        this.color = color;
        this.tonelaje = tonelaje;
        this.tipoCombustible = tipoCombustible;
        this.kilometraje = kilometraje;
        this.kilometroPorLitro = kilometroPorLitro;
        this.precio = precio;
        this.score = score;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnjoFabricacion() {
        return anjoFabricacion;
    }

    public void setAñoFabricacion(int anjoFabricacion) {
        this.anjoFabricacion = anjoFabricacion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getTonelaje() {
        return tonelaje;
    }

    public void setTonelaje(double tonelaje) {
        this.tonelaje = tonelaje;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public int getKilometroPorLitro() {
        return kilometroPorLitro;
    }

    public void setKilometroPorLitro(int kilometroPorLitro) {
        this.kilometroPorLitro = kilometroPorLitro;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Camioneta{" + "patente=" + patente + ", marca=" + marca + ", añoFabricacion=" + anjoFabricacion + ", color=" + color + ", tonelaje=" + tonelaje + ", tipoCombustible=" + tipoCombustible + ", kilometraje=" + kilometraje + ", kilometroPorLitro=" + kilometroPorLitro + ", precio=" + precio + ", score=" + score + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 235 * hash + this.score;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Camioneta other = (Camioneta) obj;
        if (this.score != other.score) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
