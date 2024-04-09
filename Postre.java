public class Postre extends Producto {
    private String tamaño;

    public Postre(String nombre, int precio, int cantidad, String tamaño) {
        super(nombre, precio, cantidad);
        this.tamaño = tamaño;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

}

