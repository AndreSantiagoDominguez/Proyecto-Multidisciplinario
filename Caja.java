import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;


class Caja {
    private Cuenta cuenta;
    private ArrayList<Orden> ordenes;

    public void recibirOrdenes(ArrayList<Orden> ordenes) {
      this.ordenes = ordenes;
  }


  
    public Caja(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public Caja() {}

    public void EscogerOperacionCaja(Cuenta cuenta) {
        Scanner teclado = new Scanner(System.in);
        
 boolean salir = false;

        do {
            
            
            

            try {
                System.out.println("\nElige la operación:");
                System.out.println("1. Historial de órdenes");
                System.out.println("2. Corte de caja");
                System.out.println("3. Regresar al menú principal");
                System.out.println("\n");
                
                String input = teclado.nextLine();
                if (input.isEmpty()) {
                    throw new InputMismatchException("Entrada vacía");
                }
                int opcion = Integer.parseInt(input);
               
                switch (opcion) {
                    case 1:
                        historialOrdenes();
                        break;
                    case 2:
                        corteCaja();
                        break;
                    case 3:
                        salir = true;
                        break;
                    default:
                        System.out.println("\nOpción inválida. Por favor, elige una opción válida.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingresa un número entero válido.");
            } 
        } while (!salir);
        
       
    }

    public void historialOrdenes() {
        System.out.println("\nHistorial de Órdenes:");
        for (Orden orden : cuenta.getOrdenes()) {
            System.out.println("\nOrden #" + orden.getNumOrden());
            System.out.println("Productos:");
            for (Producto producto : orden.getProductos()) {
                System.out.println("- " + producto.getNombre() + " $" + producto.getPrecio() + " x " + producto.getCantidad());
            }
            System.out.println("Total: $" + cuenta.calcularTotal());
            System.out.println();
        }
    }

    public void corteCaja() {
        float totalCaja = 0;
        for (Orden orden : cuenta.getOrdenes()) {
            totalCaja += cuenta.calcularTotal();
        }
        System.out.println("\nTotal en caja: $" + totalCaja);
    }
}