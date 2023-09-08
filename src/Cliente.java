
/**
 *
 * @author Cristian Abusleme
 */
public class Cliente {
    private int run,edad,telefono;
    private String nombre,estado;
    private char dv,antiguedad;
    
    public Cliente(){
        
    }

    public Cliente(int run, int edad, int telefono, String nombre, String estado, char dv, char antiguedad) {
        this.run = run;
        this.edad = edad;
        this.telefono = telefono;
        this.nombre = nombre;
        this.estado = estado;
        this.dv = dv;
        this.antiguedad = antiguedad;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public char getDv() {
        return dv;
    }

    public void setDv(char dv) {
        this.dv = dv;
    }

    public char getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(char antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public String toString() {
        return "Cliente{" + "run=" + run + ", edad=" + edad + ", telefono=" + telefono + ", nombre=" + nombre + ", estado=" + estado + ", dv=" + dv + ", antiguedad=" + antiguedad + '}';
    }
    
    
    
    public void MostrarCliente(){
        System.out.println("Nombre: "+this.nombre+getNombre());
        System.out.println("Rut: "+this.run+getRun());
        System.out.println("DV: "+this.dv+getDv());
        System.out.println("Estado: "+this.estado+getEstado());
        System.out.println("Telefono: "+this.telefono+getTelefono());
        System.out.println("Antiguedad"+this.antiguedad+getAntiguedad());
    }
    
    
    
    
    
    
    
    
    
    
    
}
