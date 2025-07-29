package org.example;

import java.time.LocalDate;
import java.util.Scanner;

public class MenuPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inventario inventario = new Inventario();
        int opcion;

        do {

            System.out.println("\n===== MENÚ DE INVENTARIO =====");
            System.out.println("1. Agregar producto ✅");
            System.out.println("2. Ver productos 🔎");
            System.out.println("3. Actualizar producto ⬆️");
            System.out.println("4. Eliminar producto 🗑️");
            System.out.println("5. Salir 🏃💨");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("ID del producto: ");
                    String id = sc.nextLine();
                    System.out.print("Nombre del producto: ");
                    String nombre = sc.nextLine();
                    System.out.print("Descripcion del producto");
                    String descripcion= sc.nextLine();
                    System.out.print("Precio del producto: ");
                    double precio = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Cantidad del producto: ");
                    long cantidad = sc.nextLong();
                    sc.nextLine();
                    System.out.print("Categoria del producto: ");
                    String categoria = sc.nextLine();

                    System.out.print("SI el producto cuenta con caducidad por favor escriba true, de lo contrario false: ");
                    boolean caducidad = sc.nextBoolean();
                    sc.nextLine();
                    Integer año=null;
                    Integer mes=null;
                    Integer dia=null;
                    if (caducidad == true) {
                        System.out.println("Por favor ingrese la fecha de vencimiento");
                        System.out.print("Por favor ingrese el año: ");
                        año = sc.nextInt();
                        System.out.print("Por favor ingrese el mes: ");
                        mes = sc.nextInt();
                        System.out.print("Por favor ingrese el dia: ");
                        dia = sc.nextInt();
                    }
                    LocalDate fechaVencimiento = LocalDate.of(año, mes, dia);
                    sc.nextLine();
                    System.out.print("Ingrese el nombre del proveedor: ");
                    String nombreProveedor = sc.nextLine();
                    System.out.print("Por favor ingrese la direcion URL de la primera foto del producto: ");
                    String fotografia1 = sc.nextLine();
                    System.out.print("Por favor ingrese la direcion URL de la drgunda foto del producto: ");
                    String fotografia2 = sc.nextLine();

                    Producto nuevo = new Producto(id, nombre, precio, descripcion, cantidad, categoria, caducidad, año, mes, dia, fechaVencimiento ,nombreProveedor, fotografia1, fotografia2 );
                    inventario.agregarProducto(nuevo);
                    inventario.productoCaducado(fechaVencimiento, nuevo);

                    break;

                case 2:
                    inventario.mostrarProductos();
                    break;

                case 3:
                    System.out.print("ID del producto a actualizar: ");
                    String idActualizar = sc.nextLine();
                    System.out.print("Nuevo nombre: ");
                    String nuevoNombre = sc.nextLine();
                    System.out.print("Nueva descripcion: ");
                    String nuevaDescripcion = sc.nextLine();
                    System.out.print("Nuevo precio: ");
                    double nuevoPrecio = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Nueva cantidad: ");
                    long nuevaCantidad = sc.nextLong();
                    sc.nextLine();
                    System.out.print("Nueva categoria: ");
                    String nuevaCategoria = sc.nextLine();
                    System.out.println("SI el producto cuenta con caducidad por favor escriba true, de lo contrario false: ");
                    boolean nuevaCaducidad = sc.nextBoolean();
                    sc.nextLine();
                    Integer nuevoAño=null;
                    Integer nuevoMes=null;
                    Integer nuevoDia=null;
                    if (nuevaCaducidad == true) {
                        System.out.println("Por favor ingrese la fecha de vencimiento");
                        System.out.print("Por favor ingrese el año: ");
                        nuevoAño = sc.nextInt();
                        System.out.print("Por favor ingrese el mes: ");
                        nuevoMes = sc.nextInt();
                        System.out.print("Por favor ingrese el dia: ");
                        nuevoDia = sc.nextInt();
                    }
                    LocalDate nuevaFechaVencimiento = LocalDate.of(nuevoAño, nuevoMes, nuevoDia);
                    sc.nextLine();
                    System.out.print("Ingrese el nuevo nombre del proveedor: ");
                    String nuevoNombrePoveedor = sc.nextLine();
                    System.out.print("Ingrese la URL de la primera foto: ");
                    String nuevaFotografia1 = sc.nextLine();
                    System.out.print("Ingrese la URL de la segunda foto: ");
                    String nuevaFotografia2 = sc.nextLine();

                    inventario.actualizarProducto(idActualizar, nuevoNombre, nuevaDescripcion, nuevoPrecio, nuevaCantidad, nuevaCategoria, nuevaCaducidad ,nuevoAño, nuevoMes, nuevoDia, nuevaFechaVencimiento, nuevoNombrePoveedor, nuevaFotografia1, nuevaFotografia2 );


                case 4:
                    System.out.print("ID del producto a eliminar: ");
                    String idEliminar = sc.nextLine();
                    inventario.eliminarProducto(idEliminar);
                    break;

                case 5:
                    System.out.println("Gracias por usar este inventario" +
                            "\nSaliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 5);
    }
}

