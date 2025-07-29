package org.example;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;


public class Inventario {
    private ArrayList<Producto> listaProductos = new ArrayList<>();


    // Agregar producto
    public void agregarProducto(Producto p) {
        listaProductos.add(p);
        System.out.println("Producto agregado con éxito 🗿✅.");
    }

    // Mostrar producto
    public void mostrarProductos() {
        if (listaProductos.isEmpty()) {
            System.out.println("No hay productos registrados 🗑️.");
            return;
        }
        for (Producto p : listaProductos) {
            p.mostrar();
        }
    }

    // Actualizar producto
    public void actualizarProducto(String id, String nuevoNombre, String nuevaDescipcion, double nuevoPrecio, long nuevaCantidad, String nuevaCategoria, boolean nuevaCaducidad , Integer nuevoAño, Integer nuevoMes, Integer nuevoDia, LocalDate nuevaFechaVencimiento, String nuevoNombrePoveedor, String nuevaFotografia1, String nuevaFotografia2) {
        for (Producto p : listaProductos) {
            if (p.getId().equals(id)) {
                p.setNombre(nuevoNombre);
                p.setPrecio(nuevoPrecio);
                p.setDescripcion(nuevaDescipcion);
                p.setCantidad(nuevaCantidad);
                p.setCategoria(nuevaCategoria);
                p.setCaducidad(nuevaCaducidad);
                p.setAño(nuevoAño);
                p.setMes(nuevoMes);
                p.setDia(nuevoDia);
                p.setFechaVencimiento(nuevaFechaVencimiento);
                p.setNombrePoveedor(nuevoNombrePoveedor);
                p.setFotografia1(nuevaFotografia1);
                p.setFotografia2(nuevaFotografia2);

                System.out.println("Producto actualizado ✅.");
                return;
            }
        }
        System.out.println("Producto no encontrado⚠️.");
    }

    // Eliminar producto
    public void eliminarProducto(String id) {
        for (Producto p : listaProductos) {
            if (p.getId().equals(id)) {
                listaProductos.remove(p);
                System.out.println("Producto eliminado✖️.");
                return;
            }
        }
        System.out.println("Producto no encontrado⚠️.");
    }
    //Eliminar producto caducado nuevo
    public void productoCaducado(LocalDate fechaVencimiento, Producto p){
        LocalDate fechaActual = LocalDate.now();
        long diasVencidos = ChronoUnit.DAYS.between(fechaActual, fechaVencimiento);



            if ( diasVencidos <= 3 ) {
                listaProductos.remove(p);
                System.out.println("Producto vencido con" + diasVencidos + "dias vencidos, se va eliminar del inventario ⚠️✖️");
            }




    }

    public void productoCaducadoActualizado(LocalDate nuevaFechaVencimiento, Producto p){

        LocalDate fechaActual = LocalDate.now();
        long diasVencidosActualizados = ChronoUnit.DAYS.between(fechaActual, nuevaFechaVencimiento);


            if ( diasVencidosActualizados >= 3 ) {
                listaProductos.remove(p);
            }


    }




}
