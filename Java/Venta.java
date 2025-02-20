package Tarea013;
import java.util.ArrayList;
import java.util.List;

public class Venta {
    private String id;
    private String fecha;
    private List<Producto> productosVendidos;

    public Venta(String id, String fecha) {
        this.id = id;
        this.fecha = fecha;
        this.productosVendidos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto, int cantidad) {
        if (producto.reducirStock(cantidad)) {
            for (int i = 0; i < cantidad; i++) {
                productosVendidos.add(producto);
            }
        } else {
            System.out.println("No hay suficiente stock para el producto: " + producto.getNombre());
        }
    }

    public double calcularSubtotal() {
        double subtotal = 0;
        for (Producto producto : productosVendidos) {
            subtotal += producto.getPrecio();
        }
        return subtotal;
    }

    public double calcularIVA() {
        return calcularSubtotal() * 0.16;
    }

    public double calcularTotal() {
        return calcularSubtotal() + calcularIVA();
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    public List<Producto> getProductosVendidos() { return productosVendidos; }

    @Override
    public String toString() {
        return "Venta{id='" + id + "', fecha='" + fecha + "', productosVendidos=" + productosVendidos.size() + "}";
    }
}