import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class Orden {
    private static int contadorOrdenes = 0;
    private int numOrden;
    private ArrayList<Producto> productos;

    public Orden() {
        this.numOrden = ++contadorOrdenes;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) { 
        productos.add(producto);
    }
    
    public ArrayList<Producto> getProductos() {
        return productos;
    }
    
    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    
    public int getNumOrden() {
        return numOrden;
    }


    


    public  void TomarOrden () {
        Scanner teclado = new Scanner(System.in);
        int opcion;
       
        do {

            try {  
            System.out.println("\nElige el producto:");
            System.out.println("1. Postre");
            System.out.println("2. Bebida");
            System.out.println("3. Congelado");
            System.out.println("4. Finalizar orden");
        
            opcion = teclado.nextInt();
        
            switch (opcion) {
                case 1:
                        System.out.println("\nSeleccionaste Postre.");
                        System.out.println("Elige el postre:");
                        System.out.println("1. Tiramisú ($49)");
                        System.out.println("2. Flan Napolitano ($28)");
                        System.out.println("3. Pastel de chocolate ($25)");
                        System.out.println("4. Pastel Hersheys ($45)");
                        System.out.println("5. Cheesecake Oreo ($40)");
                        System.out.println("6. Cupcake ($49)");
                        System.out.println("7. Galletas con chocolate ($15)");
                        System.out.println("8. Chimbo ($15)");


                    int opcionPostre = teclado.nextInt();
                    System.out.println("\nIngrese la cantidad:");
                    int cantidadPostre = teclado.nextInt();
                    if (cantidadPostre < 0) {
                        System.out.println("\nError: La cantidad no puede ser negativa."); 
                    }

                    switch (opcionPostre) {
                        case 1:
                        productos.add(new Postre("Tiramisú", 49, cantidadPostre, "Rebanada"));
                        break;
                    case 2:
                        productos.add(new Postre("Flan Napolitano", 28, cantidadPostre, "Rebanada"));
                        break;
                    case 3:
                        productos.add(new Postre("Pastel de chocolate", 25, cantidadPostre, "Rebanada"));
                        break;
                    case 4:
                        productos.add(new Postre("Pastel Hersheys", 45, cantidadPostre, "Rebanada"));
                        break;
                    case 5:
                        productos.add(new Postre("Cheesecake Oreo", 40, cantidadPostre, "Rebanada"));
                        break;
                    case 6:
                        productos.add(new Postre("Cupcake", 49, cantidadPostre, "Pieza"));
                        break;
                    case 7:
                        productos.add(new Postre("Galletas con chocolate", 15, cantidadPostre, "Pieza"));
                        break;
                    case 8:
                        productos.add(new Postre("Chimbo", 15, cantidadPostre, "Pieza"));
                        break;
                        default:
                            System.out.println("Opción inválida.");
                            break;
                    }
                    break;
        
                case 2:
                        System.out.println("\nSeleccionaste Bebida.");
                        System.out.println("Elije la bebida:");
                        System.out.println("1. Limonada ($20)");
                        System.out.println("2. Batido de fresa ($33)");
                        System.out.println("3. Té negro frío ($25)");
                        System.out.println("4. Té de limón ($20)");
                        System.out.println("5. Café ($20)");
                        System.out.println("6. Capuccino ($40)");
                        System.out.println("7. Macchiato de caramelo ($50)");
                        System.out.println("8. Expresso ($25)");
                    
        
                    int opcionBebida = teclado.nextInt();
                    System.out.println("\nIngrese la cantidad:");
                    int cantidadBebida = teclado.nextInt();
                    if (cantidadBebida < 0) {
                        System.out.println("\nError: La cantidad no puede ser negativa.");
                    }
                    switch (opcionBebida) {
                        case 1:
                            productos.add(new Bebida("Limonada", "Frio", 20, cantidadBebida));
                            break;
                        case 2:
                            productos.add(new Bebida("Batido de fresa", "Frio", 33, cantidadBebida));
                            break;
                        case 3:
                            productos.add(new Bebida("Té negro frío", "Frio", 25, cantidadBebida));
                            break;
                        case 4:
                            productos.add(new Bebida("Té de limón", "Frio", 20, cantidadBebida));
                            break;
                        case 5:
                            productos.add(new Bebida("Café", "Caliente", 20, cantidadBebida));
                            break;
                        case 6:
                            productos.add(new Bebida("Capuccino", "Caliente", 40, cantidadBebida));
                            break;
                        case 7:
                            productos.add(new Bebida("Macchiato de caramelo", "Caliente", 50, cantidadBebida));
                            break;
                        case 8:
                            productos.add(new Bebida("Expresso", "Caliente", 25, cantidadBebida));
                            break;
                        default:
                            System.out.println("\nOpción inválida.");
                            break;
                    }
                    break;
        
                case 3:
                        System.out.println("\nSeleccionaste Congelado.");
                        System.out.println("Elije el congelado:");
                        System.out.println("1. Helado de vainilla ($20)");
                        System.out.println("2. Helado de chocolate ($20)");
                        System.out.println("3. Helado de pica fresa ($30)");
                        System.out.println("4. Helado de oreo ($25)");
                        System.out.println("5. Helado de pay de queso ($20)");
                        System.out.println("6. Helado de café con tres leches ($30)");
                        System.out.println("7. Banana split ($80)");
                        System.out.println("8. Paleta de mango con chamoy ($25)");
                        System.out.println("9. Paleta de sandía ($20)");
                        System.out.println("10. Paleta de oreo ($20)");
                        System.out.println("11. Paleta de grosella ($20)");
                    
        
                    int opcionCongelado = teclado.nextInt();
                    System.out.println("\nIngrese la cantidad:");
                    int cantidadCongelado = teclado.nextInt();
                    if (cantidadCongelado < 0) {
                        System.out.println("\nError: La cantidad no puede ser negativa.");
                    }

                    switch (opcionCongelado) {
                        case 1:
                            productos.add(new Congelado("Helado de vainilla", "Helado", 20, cantidadCongelado));
                            break;
                        case 2:
                            productos.add(new Congelado("Helado de chocolate", "Helado", 20, cantidadCongelado));
                            break;
                        case 3:
                            productos.add(new Congelado("Helado de pica fresa", "Helado", 30, cantidadCongelado));
                            break;
                        case 4:
                            productos.add(new Congelado("Helado de oreo", "Helado", 25, cantidadCongelado));
                            break;
                        case 5:
                            productos.add(new Congelado("Helado de pay de queso", "Helado", 20, cantidadCongelado));
                            break;
                        case 6:
                            productos.add(new Congelado("Helado de café con tres leches", "Helado", 30, cantidadCongelado));
                            break;
                        case 7:
                            productos.add(new Congelado("Banana split", "Helado", 80, cantidadCongelado));
                            break;
                        case 8:
                            productos.add(new Congelado("Paleta de mango con chamoy", "Paleta de hielo", 25, cantidadCongelado));
                            break;
                        case 9:
                            productos.add(new Congelado("Paleta de sandía", "Paleta de hielo", 20, cantidadCongelado));
                            break;
                        case 10:
                            productos.add(new Congelado("Paleta de oreo", "Paleta de hielo", 20, cantidadCongelado));
                            break;
                        case 11:
                            productos.add(new Congelado("Paleta de grosella", "Paleta de hielo", 20, cantidadCongelado));
                            break;
                        default:
                            System.out.println("\nOpción inválida.");
                            break;
                    }
                    break;
        
                    case 4:
                    System.out.println("\nHas finalizado la orden " + numOrden + ".");
                    break;

                default:
                    System.out.println("\nOpción inválida. Por favor, elige una opción válida.");
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("\nError: Ingresa un número entero válido.");
            teclado.next();
            opcion = 0;
        }
    } while (opcion != 4);

    Cuenta cuenta = new Cuenta();
    cuenta.agregarOrden(this);
    float total = cuenta.calcularTotal();
    System.out.println("\nProductos seleccionados:");
    for (Producto producto : productos) {
        System.out.println("- " + producto.getNombre() + " $" + producto.getPrecio() + " x " + producto.getCantidad());
    }
    cuenta.setTotal(total);
    cuenta.seleccionarMetodoPago();

}


}

