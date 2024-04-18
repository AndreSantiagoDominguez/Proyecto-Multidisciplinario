import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class Orden {
    private static int contadorOrdenes = 0;
    private int numOrden;
    private ArrayList<Producto> productos;
    private boolean hayProductos;
    boolean ordenCancelada = false;


    public Orden() {
        this.numOrden = ++contadorOrdenes;
        this.productos = new ArrayList<>();
        this.hayProductos = false;

        this.ordenCancelada = false;
    }

    public void agregarProducto(Producto producto) { 
        productos.add(producto);
        hayProductos = true;
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


    public boolean validarCantidad(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("\nError: La cantidad debe ser mayor que cero.");
            return false;
        }
        return true;
    }

    public boolean isOrdenCancelada() {
        return ordenCancelada;
    }

    public void cancelarOrden() {
        System.out.println("\nHas cancelado la orden " + numOrden + ".");
        ordenCancelada = true;
    }



    public  void TomarOrden () {
        Scanner teclado = new Scanner(System.in);
        int opcion, opcionPostre, opcionBebida, opcionCongelado;
       
        do {

            try { 
            System.out.print("<---------------Tomando Pedido------------------------->\n");
            System.out.println("\nElige el producto:");
            System.out.println("1. Postre");
            System.out.println("2. Bebida");
            System.out.println("3. Congelado");
            System.out.println("4. Finalizar orden");
            System.out.println("5. Cancelar orden\n");
             opcion = teclado.nextInt();
            System.out.print("\n<------------------------------------------------------>\n");
           
        
            switch (opcion) {
                case 1:
                
                        System.out.print("<---------------------- Postre ------------------------>\n");
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
                        System.out.println("\n");
                        opcionPostre = teclado.nextInt();
                        while (opcionPostre < 1 || opcionPostre > 8) {
                            System.out.println("Seleccione una opcion valida");
                            opcionPostre = teclado.nextInt();
                        }

                        System.out.println("\nIngrese la cantidad:");
                        int cantidadPostre = teclado.nextInt();
                        if (validarCantidad(cantidadPostre)) {

                    switch (opcionPostre) {
                        case 1:
                        productos.add(new Postre("Tiramisú", 49, cantidadPostre));
                        hayProductos = true;
                        break;
                    case 2:
                        productos.add(new Postre("Flan Napolitano", 28, cantidadPostre));
                        hayProductos = true;
                        break;
                    case 3:
                        productos.add(new Postre("Pastel de chocolate", 25, cantidadPostre));
                        hayProductos = true;
                        break;
                    case 4:
                        productos.add(new Postre("Pastel Hersheys", 45, cantidadPostre));
                        hayProductos = true;
                        break;
                    case 5:
                        productos.add(new Postre("Cheesecake Oreo", 40, cantidadPostre));
                        hayProductos = true;
                        break;
                    case 6:
                        productos.add(new Postre("Cupcake", 49, cantidadPostre));
                        hayProductos = true;
                        break;
                    case 7:
                        productos.add(new Postre("Galletas con chocolate", 15, cantidadPostre));
                        hayProductos = true;
                        break;
                    case 8:
                        productos.add(new Postre("Chimbo", 15, cantidadPostre));
                        hayProductos = true;
                        break;
                        default:
                            System.out.println("Opción inválida.");
                            break;
                    }
                } 
           
                    break;
        
                case 2:
                        System.out.print("<---------------------- Bebida ------------------------>\n");
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
                        System.out.println("\n");
                        opcionBebida = teclado.nextInt();
                        while (opcionBebida < 1 || opcionBebida > 8) {
                            System.out.println("Seleccione una opcion valida");
                             opcionBebida = teclado.nextInt();
                        }
                    
        
                        System.out.println("\nIngrese la cantidad:");
                        int cantidadBebida = teclado.nextInt();
                        if (validarCantidad(cantidadBebida)) {

                   
                    switch (opcionBebida) {
                        case 1:
                            productos.add(new Bebida("Limonada", 20, cantidadBebida));
                            hayProductos = true;
                            break;
                        case 2:
                            productos.add(new Bebida("Batido de fresa",  33, cantidadBebida));
                            hayProductos = true;
                            break;
                        case 3:
                            productos.add(new Bebida("Té negro frío", 25, cantidadBebida));
                            hayProductos = true;
                            break;
                        case 4:
                            productos.add(new Bebida("Té de limón",  20, cantidadBebida));
                            hayProductos = true;
                            break;
                        case 5:
                            productos.add(new Bebida("Café",  20, cantidadBebida));
                            hayProductos = true;
                            break;

                        case 6:
                            productos.add(new Bebida("Capuccino", 40, cantidadBebida));
                            hayProductos = true;
                            break;
                        case 7:
                            productos.add(new Bebida("Macchiato de caramelo",  50, cantidadBebida));
                            hayProductos = true;
                            break;
                        case 8:
                            productos.add(new Bebida("Expresso",  25, cantidadBebida));
                            hayProductos = true;
                            break;
                        default:
                            System.out.println("\nOpción inválida.");
                            break;
                    }
                } 
                    break;
        
                case 3:
                        System.out.print("<---------------------- Congelado ------------------------>\n");
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
                        System.out.println("\n");
                        opcionCongelado = teclado.nextInt();
                    while (opcionCongelado < 1 || opcionCongelado > 11){
                        System.out.println("Seleccione una opcion valida");
                        opcionPostre = teclado.nextInt();
                    }
                        System.out.println("\nIngrese la cantidad:");
                        int cantidadCongelado = teclado.nextInt();

                        while(cantidadCongelado < 1){
                            System.out.println("\nCantidad invalida, intente nuevamente");
                            cantidadCongelado = teclado.nextInt();
                        }

                        if (validarCantidad(cantidadCongelado)) {

                    switch (opcionCongelado) {
                        case 1:
                            productos.add(new Congelado("Helado de vainilla",  20, cantidadCongelado));
                            hayProductos = true;
                            break;
                        case 2:
                            productos.add(new Congelado("Helado de chocolate",  20, cantidadCongelado));
                            hayProductos = true;
                            break;
                        case 3:
                            productos.add(new Congelado("Helado de pica fresa",  30, cantidadCongelado));
                            hayProductos = true;
                            break;
                        case 4:
                            productos.add(new Congelado("Helado de oreo",  25, cantidadCongelado));
                            hayProductos = true;
                            break;
                        case 5:
                            productos.add(new Congelado("Helado de pay de queso",  20, cantidadCongelado));
                            hayProductos = true;
                            break;
                        case 6:
                            productos.add(new Congelado("Helado de café con tres leches",  30, cantidadCongelado));
                            hayProductos = true;
                            break;
                        case 7:
                            productos.add(new Congelado("Banana split",  80, cantidadCongelado));
                            hayProductos = true;
                            break;
                        case 8:
                            productos.add(new Congelado("Paleta de mango con chamoy",  25, cantidadCongelado));
                            hayProductos = true;
                            break;
                        case 9:
                            productos.add(new Congelado("Paleta de sandía",  20, cantidadCongelado));
                            hayProductos = true;
                            break;
                        case 10:
                            productos.add(new Congelado("Paleta de oreo",  20, cantidadCongelado));
                            hayProductos = true;
                            break;
                        case 11:
                            productos.add(new Congelado("Paleta de grosella",  20, cantidadCongelado));
                            hayProductos = true;
                            break;
                        default:
                            System.out.println("\nOpción inválida.");
                            break;
                       }
                    }
                    break;
        
                    case 4:
                    
                    if (hayProductos && !ordenCancelada) {
                        System.out.println("\nHas finalizado la orden " + numOrden + ".");
                        System.out.print("<---------------------- Cuenta ------------------------>\n");
                        Cuenta cuenta = new Cuenta();
                        cuenta.agregarOrden(this);
                        float total = cuenta.calcularTotal();
                        System.out.println("\nProductos seleccionados:");
                        for (Producto producto : productos) {
                            System.out.println("- " + producto.getNombre() + " $" + producto.getPrecio() + " x " + producto.getCantidad());
                        }
                        cuenta.setTotal(total);
                        cuenta.seleccionarMetodoPago();
                    } else {
                        System.out.println("\nError: Debes agregar al menos un producto antes de finalizar la orden.");
                        opcion = 0;
                    }
                    break;

                    
                    case 5:
                    cancelarOrden();
                    break;

                default:
                    System.out.println("\nOpción inválida. Por favor, elige una opción   .");
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("\nError: Ingresa un número entero válido.");
            teclado.next();
            opcion = 0;
        }
    } while ( opcion != 4 && !ordenCancelada );
  }
}

