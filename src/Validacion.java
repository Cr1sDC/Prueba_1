

/**
 *
 * @author Cristian Abusleme
 */
public class Validacion {
    
    public boolean ValidarPatente(String largo){
        if (largo.length()==6) {
            return true;
        } else {
            return false;
        }
    }



    public boolean ValidarNombreBlanco(String car){
        if (car.isBlank()) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean ValidarLargo8(int valor){
        if (valor>=00000000 && valor<=99999999) {
            return true;
        } else {
            System.out.println("El telefono del cliente debe tener 8 digitos.");
            return false;
        }
    }
    
    public boolean ValidarKm(int kim){
        if (kim>=0 && kim<=500000) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean VerificarAntiguedad(char ant){
        switch (ant) {
            case 'A' -> {
                System.out.println("Cliente Antiguo");
                return true;
            }
            case 'N' -> {
                System.out.println("Cliente Nuevo");
                return true;
            }
            default -> {
                return false;
            }
        }
        
    }
    
    public void Descuento(char ant,int des,int pre,float desc){
        if (ant=='N') {
            System.out.println("Se le aplicara descuento");
            des = (int) (pre*desc);
        }
    }
    
    
}
