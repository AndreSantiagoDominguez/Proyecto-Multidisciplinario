import java.util.ArrayList;
import java.util.Scanner;

class Cuenta {
    private ArrayList<Orden> ordenes;
    private float total;

    public Cuenta() {
        this.ordenes = new ArrayList<>();
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public float getTotal() {
        return total;
    }

    public ArrayList<Orden> getOrdenes() {
        return ordenes;
    }

    public void agregarOrden(Orden orden) {
        ordenes.add(orden);
    }

    public float calcularTotal() {
        float total = 0;
        for (Orden orden : ordenes) {
            for (Producto producto : orden.getProductos()) {
                total += producto.getPrecio() * producto.getCantidad();
            }
        }
        return total;
    }

    public void mostrarProductos() {
        System.out.println("\nProductos seleccionados:");
        for (Orden orden : ordenes) {
            for (Producto producto : orden.getProductos()) {
                System.out.println("- " + producto.getNombre() + " $" + producto.getPrecio() + " x " + producto.getCantidad());
            }
        }
    }

    public void seleccionarMetodoPago() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("\nSeleccione el método de pago:");
        System.out.println("1. Efectivo");
        System.out.println("2. Tarjeta");
        int opcion = teclado.nextInt();

        while (opcion < 1 || opcion > 2 ) {
            System.out.println("\nSeleccione un metodo de pago valido:");
            opcion = teclado.nextInt();
        }

        switch (opcion) {
            case 1:
                System.out.println("\nPago se realizara en efectivo.");
                System.out.println("\nEl total a pagar es: $" + total);
                System.out.println("Ingrese la cantidad con la que paga:");
                float cantidadPaga;
                while (true) {
                    if (teclado.hasNextFloat()) {
                        cantidadPaga = teclado.nextFloat();
                        if (cantidadPaga >= total) {
                            break;
                        } else {
                            System.out.println("\nError: La cantidad ingresada es insuficiente.");
                        }
                    } else {
                        System.out.println("\nError: Por favor, ingrese un número válido.");
                        teclado.next(); 
                    }
                }
                float cambio = cantidadPaga - total;
                if (cambio > 0) {
                    System.out.println("\nEl cambio es: $" + cambio);
                }
                break;
            case 2:
                System.out.println("\nEl total a pagar es: $" + total);
                System.out.println("\nPago se realizara con tarjeta.");
                System.out.println("\nPor favor, ingrese su PIN de 4 dígitos:");
                int pin;
                while (true) {
                    if (teclado.hasNextInt()) {
                        pin = teclado.nextInt();
                        if (pin >= 1000 && pin <= 9999) {
                            break;
                        } else {
                            System.out.println("\nError: El PIN debe ser un número de 4 dígitos.");
                        }
                    } else {
                        System.out.println("\nError: Por favor, ingrese un número válido.");
                        teclado.next(); 
                    }
                }
                System.out.println("\nPago realizado ");
                break;
            default:
                System.out.println("\nOpción inválida.");
                break;
        }
    }
}