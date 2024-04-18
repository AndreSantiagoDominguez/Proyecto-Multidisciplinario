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

        Caja caja = new Caja(cuenta);

        do {
            try {
                System.out.print("<-------------------Caja------------------->\n");
                System.out.println("\nElige la operación:");
                System.out.println("1. Historial de órdenes");
                System.out.println("2. Corte de caja");
                System.out.println("3. Regresar al menú principal");
                int opcion = teclado.nextInt();
                System.out.print("<------------------------------------------>\n");
                teclado.nextLine();

                switch (opcion) {
                    case 1:
                        caja.historialOrdenes();
                        break;
                    case 2:
                       caja.corteCaja();
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
                teclado.next(); 
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (!salir);        
    }

    public void historialOrdenes() {
        System.out.print("<-----------------Historial de Órdenes----------------------->");
        System.out.println("\nHistorial de Órdenes:");
        for (Orden orden : cuenta.getOrdenes()) {
            System.out.println("\nOrden #" + orden.getNumOrden());
            System.out.println("Productos:");
            float totalOrden = 0;
            for (Producto producto : orden.getProductos()) {
                System.out.println("- " + producto.getNombre() + " $" + producto.getPrecio() + " x " + producto.getCantidad());
                totalOrden += producto.getPrecio() * producto.getCantidad();
            }
            System.out.println("Total: $" + totalOrden);
        }

    }

    public void corteCaja() {
        System.out.print("<--------------------Corte de Caja----------------->");
        for (Orden orden : cuenta.getOrdenes()) {
            cuenta.calcularTotal();
        }
        System.out.println("\nTotal en caja: $" + cuenta.calcularTotal());
    }
}