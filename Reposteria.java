import java.util.InputMismatchException;
import java.util.Scanner;

public class Reposteria {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String contraseña = "ABC123";
        int opcion = 0;
        Cuenta cuenta = new Cuenta();
        
        do {
            try {
                System.out.println("\nElige la operación:\n1. Caja\n2. Orden\n3. Salir");
                opcion = teclado.nextInt();
                teclado.nextLine(); 
        
                switch (opcion) {
                    case 1:
                        boolean salirCaja = false;
                        do {
                            System.out.print("\nIngrese la contraseña para acceder a la caja: ");
                            String contraseñaU = teclado.next();
                            if (contraseñaU.equals(contraseña)) {
                                Caja caja = new Caja(cuenta);
                                caja.EscogerOperacionCaja(cuenta);
                                salirCaja = true;
                            } else {
                                System.out.println("\nContraseña incorrecta. No puede acceder al menú de la caja.");
                            }
                        } while (!salirCaja);
                        break;
        
                    case 2:
                        Orden orden = new Orden();
                        orden.TomarOrden();
                        cuenta.agregarOrden(orden);
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
                String errorMessage = (e.getMessage() != null) ? e.getMessage() : "Ocurrió un error";
                System.out.println("\nError: " + errorMessage);
            }
        } while (opcion != 3);
        
        teclado.close();
    }
}