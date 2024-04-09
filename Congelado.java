public class Congelado extends Producto {
    private String tipo;

    public Congelado(String nombre, String tipo, int precio,int cantidad ) {
        super(nombre, precio, cantidad);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
