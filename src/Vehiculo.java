
/**
 *
 * @author Cristian Abusleme
 */
public class Vehiculo {
    private String marca,modelo,patente,problema;
    private int km,precio;
    
    public Vehiculo(){
        
    }

    public Vehiculo(String marca, String modelo, String patente, String problema, int km, int precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
        this.problema = problema;
        this.km = km;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", patente=" + patente + ", problema=" + problema + ", km=" + km + ", precio=" + precio + '}';
    }
    
    
    
    public void MostrarVehiculo(){
        
        System.out.println("Marca: "+this.marca+getMarca());
        System.out.println("Modelo: "+this.modelo+getModelo());
        System.out.println("KM"+this.km+getKm());
        System.out.println("Patente: "+this.patente+getPatente());
        System.out.println("Problema: "+this.problema+getProblema());
        System.out.println("Costo Arreglo: "+this.precio+getPrecio());
        
    }
    
}
