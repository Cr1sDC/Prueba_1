
import java.util.Scanner;

/**
 *
 * @author Cristian Abusleme
 */
public class Main {
    public static void main(String[] args) {
        //menu
        int opcion;
        boolean flag = true ;
        //Cliente
        int run,edad,telefono;
        String nombre,estado;
        char dv,antiguedad;
        //Vehiculo
        String marca,modelo,patente,problema;
        int km,precio,desc;
        
        Cliente cliente = new Cliente();
        Vehiculo vehiculo = new Vehiculo();
        Validacion validar = new Validacion();
        
        
        Scanner leer = new Scanner(System.in);
        
        do {
            System.out.println("---------------MENU--------------");
            System.out.println("1-Crear un vehículo.");
            System.out.println("2-Mostrar la información de un vehículo y su dueño.");
            System.out.println("3-Calcular el descuento al total de servicios prestados.");
            System.out.println("Ingrese una opcion: ");
            opcion= leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("DATOS DEL CLIENTE: ");
                    System.out.println("Ingrese su rut: ");
                    run = leer.nextInt();
                    System.out.println("Ingrese su dv: ");
                    dv=leer.next().charAt(0);
                    do {
                        System.out.println("Ingrese su Nombre: ");
                        nombre=leer.next();
                        validar.ValidarNombreBlanco(nombre);
                    } while (flag==false);
                    System.out.println("Ingrese su Estado civil: ");
                    estado=leer.next();
                    System.out.println("Ingrese Edad: ");
                    edad= leer.nextInt();
                    do  { 
                        System.out.println("Ingrese su nro de telefono: ");
                        telefono=leer.nextInt();
                        validar.ValidarLargo8(telefono);  
                    } while (flag==false);
                    System.out.println("Es cliente nuevo o antiguo?");
                    antiguedad=leer.next().charAt(0);
                    System.out.println("--------------------------------");
                    System.out.println("DATOS DEL VEHICULO:");
                    do {
                        System.out.println("Ingrese Marca:");
                        marca=leer.next();
                        validar.ValidarNombreBlanco(marca);
                    } while (flag==false);
                    System.out.println("Ingrese Modelo: ");
                    modelo=leer.next();
                    do {
                        System.out.println("Ingrese Patente: ");
                        patente=leer.next();
                        validar.ValidarPatente(patente);
                    } while (flag==false);
                    do {
                        System.out.println("Ingrese KM: ");
                        km=leer.nextInt();
                        validar.ValidarKm(km);
                    } while (flag==false);
                    System.out.println("Ingrese Problema:");
                    problema=leer.next();
                    System.out.println("Ingrese Costo de Arreglo: ");
                    precio=leer.nextInt();
                    cliente.setNombre(nombre);
                    cliente.setRun(run);
                    cliente.setDv(dv);
                    cliente.setEdad(edad);
                    cliente.setTelefono(telefono);
                    cliente.setEstado(estado);
                    vehiculo.setMarca(marca);
                    vehiculo.setModelo(modelo);
                    vehiculo.setPatente(patente);
                    vehiculo.setKm(km);
                    vehiculo.setProblema(problema);
                    vehiculo.setPrecio(precio);
                    System.out.println("DATOS GUARDADOS");
                    System.out.println(cliente);
                    System.out.println("-----------------------------");
                    System.out.println(vehiculo);
                    break;
                case 2:
                    System.out.println("--------------CLIENTE-------------");
                    cliente.MostrarCliente();
                    System.out.println("---------------VEHICULO------------");
                    vehiculo.MostrarVehiculo();
                    break;
                    
                case 3:
                    System.out.println("Ingrese Descuento");
                    desc=leer.nextInt();
                    break;
                default:
                    throw new AssertionError();
            }
        } while (flag==false);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
