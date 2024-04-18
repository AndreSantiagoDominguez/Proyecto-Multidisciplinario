import java.util.InputMismatchException;
import java.util.Scanner;

public class Reposteria {

    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();
        escogerCaja_Orden(cuenta);
    }


  public static void escogerCaja_Orden(Cuenta cuenta){
    Scanner teclado = new Scanner(System.in);
        String contraseña = "ABC123";
        int opcion = 0;
        
         
        do {
            try {
                System.out.println("\nElige la operación:\n1. Caja\n2. Orden\n3. Salir");
                opcion = teclado.nextInt();
        
                switch (opcion) {
                    case 1:
                        boolean salirCaja = false;
                        do {
                            System.out.print("\nIngrese la contraseña para acceder a la caja O ingresa 'regresar' si desea salir: ");
                            String contraseñaU = teclado.next();
                            if (contraseñaU.equals(contraseña)) {
                                Caja caja = new Caja(cuenta);
                                caja.EscogerOperacionCaja(cuenta);
                                salirCaja = true;
                            } else if (contraseñaU.equals("regresar")) {
                                salirCaja = true;
                            } else {
                                System.out.println("Contraseña incorrecta");
                            }
                        }
                         while (!salirCaja);
                        break;
        
                    case 2:
                    Orden orden = new Orden();
                    orden.TomarOrden();
                    if (!orden.isOrdenCancelada()) {
                        cuenta.agregarOrden(orden);
                    }
                    break;
                
        
                    case 3:
                        System.out.println("\nSaliendo del programa.");
                        break;
        
                    default:
                        System.out.println("\nOpción inválida. Por favor, elige una opción válida.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("\nError: Ingresa un número entero válido.");
                teclado.next(); 
            } catch (Exception e) {
                System.out.println("\nError: " + e.getMessage());
            }
        } while (opcion != 3);
        
        teclado.close();

  }
}