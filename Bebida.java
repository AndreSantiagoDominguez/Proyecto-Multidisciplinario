public class Bebida extends Producto{
    private String tipo;

    public Bebida(String nombre,String tipo ,int precio , int cantidad ) {
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
