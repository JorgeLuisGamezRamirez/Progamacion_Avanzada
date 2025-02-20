package Tarea013;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
    	
        Inventario inventario = new Inventario();
        List<Venta> ventas = new ArrayList<>();
        PersistenciaDatos<Producto> persistencia = new PersistenciaDatos<>();

        inventario.agregarProducto(new Producto("001", "Arroz", 35, 10));
        inventario.agregarProducto(new Producto("002", "Azúcar", 25, 10));

        persistencia.guardarCSV(inventario.listarProductos(), "productos.csv");

        List<Producto> productosCargados = persistencia.cargarCSV("productos.csv", Producto.class);

        boolean salir = false;
        while (!salir) {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Gestionar Inventario");
            System.out.println("2. Realizar Venta");
            System.out.println("3. Salir");
            int opcion = leerEntero("Seleccione una opción");

            switch (opcion) {
                case 1:
                    gestionarInventario(inventario);
                    break;
                case 2:
                    realizarVenta(inventario, ventas);
                    break;
                case 3:
                    salir = true;
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    private static void gestionarInventario(Inventario inventario) {
        System.out.println("\n--- GESTIÓN DE INVENTARIO ---");
        System.out.println("1. Agregar Producto");
        System.out.println("2. Listar Productos");
        System.out.println("3. Eliminar Producto");
        System.out.println("4. Volver al Menú Principal");

        int opcion = leerEntero("Seleccione una opción");
        switch (opcion) {
            case 1:
                agregarProducto(inventario);
                break;
            case 2:
                listarProductos(inventario);
                break;
            case 3:
                eliminarProducto(inventario);
                break;
            case 4:
                System.out.println("Volviendo al menú principal...");
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    private static void agregarProducto(Inventario inventario) {
        System.out.println("\n--- AGREGAR PRODUCTO ---");
        String id = leerString("Ingrese el ID del producto:");
        String nombre = leerString("Ingrese el nombre del producto:");
        double precio = leerDouble("Ingrese el precio del producto:");
        int stock = leerEntero("Ingrese el stock del producto:");

        Producto nuevoProducto = new Producto(id, nombre, precio, stock);
        inventario.agregarProducto(nuevoProducto);
        System.out.println("Producto agregado exitosamente.");
    }

    private static void listarProductos(Inventario inventario) {
        System.out.println("\n--- LISTA DE PRODUCTOS ---");
        System.out.println(inventario);
    }

    private static void eliminarProducto(Inventario inventario) {
        System.out.println("\n--- ELIMINAR PRODUCTO ---");
        String id = leerString("Ingrese el ID del producto a eliminar:");
        if (inventario.eliminarProducto(id)) {
            System.out.println("Producto eliminado exitosamente.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    private static void realizarVenta(Inventario inventario, List<Venta> ventas) {
        System.out.println("\n--- REALIZAR VENTA ---");
        String idVenta = "V" + (ventas.size() + 1);
        String fecha = "2023-10-01";
        Venta venta = new Venta(idVenta, fecha);

        boolean continuar = true;
        while (continuar) {
            System.out.println("Ingrese el ID del producto a vender (o 'salir' para terminar):");
            String idProducto = leerString("> ");
            if (idProducto.equalsIgnoreCase("salir")) {
                continuar = false;
            } else {
                Producto producto = inventario.buscarProducto(idProducto);
                if (producto != null) {
                    int cantidad = leerEntero("Ingrese la cantidad a vender:");
                    venta.agregarProducto(producto, cantidad);
                    System.out.println("Producto agregado a la venta.");
                } else {
                    System.out.println("Producto no encontrado.");
                }
            }
        }

        System.out.println("\n--- RESUMEN DE LA VENTA ---");
        System.out.println(venta);
        System.out.println("Subtotal: $" + venta.calcularSubtotal());
        System.out.println("IVA: $" + venta.calcularIVA());
        System.out.println("Total: $" + venta.calcularTotal());

        ventas.add(venta);
        System.out.println("Venta registrada exitosamente.");
    }

    private static String leerString(String mensaje) {
        System.out.print(mensaje + ": ");
        return System.console().readLine();
    }

    private static double leerDouble(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje + ": ");
                return Double.parseDouble(System.console().readLine());
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Intente nuevamente.");
            }
        }
    }

    private static int leerEntero(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje + ": ");
                return Integer.parseInt(System.console().readLine());
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Intente nuevamente.");
            }
        }
    }
}