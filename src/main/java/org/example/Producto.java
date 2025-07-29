package org.example;


import java.time.LocalDate;

public class Producto {
    private String id;
    private String nombre;
    private String descripcion;
    private double precio;
    private long cantidad;
    private String categoria;
    private boolean caducidad;
    private Integer año;
    private Integer mes;
    private Integer dia;
    private LocalDate fechaVencimiento;
    private String nombrePoveedor;
    private String fotografia1;
    private String fotografia2;
    public LocalDate fechaActual;

    public Producto(String id, String nombre, double precio,String descripcion, /**/long cantidad,String categoria, boolean caducidad, Integer año, Integer mes, Integer dia, LocalDate fechaVencimiento, String nombrePoveedor, String fotografia1, String fotografia2) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.caducidad = caducidad;
        this.año = año;
        this.mes = mes;
        this.dia= dia;
        this.fechaVencimiento = fechaVencimiento;
        this.nombrePoveedor = nombrePoveedor;
        this.fotografia1 = fotografia1;
        this.fotografia2 = fotografia2;


    }

    // Get
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getDescripcion() { return descripcion; }
    public double getPrecio() { return precio; }
    public LocalDate getFechaVencimiento() { return fechaVencimiento; }
    public LocalDate getFechaActual() { return fechaActual; }

    //Set
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setPrecio(double precio) { this.precio = precio; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public void setCantidad(long cantidad) { this.cantidad = cantidad; }
    public void setCategoria(String categoria ) { this.categoria = categoria; }
    public void setCaducidad(boolean caducidad) { this.caducidad = caducidad; }
    public void setAño(Integer año) { this.año = año; }
    public void setMes(Integer mes) { this.mes = mes; }
    public void setDia(Integer dia) { this.dia = dia; }
    public void setFechaVencimiento(LocalDate fechaVencimiento) { this.fechaVencimiento = fechaVencimiento; }
    public void setNombrePoveedor(String nombrePoveedor ) { this.nombrePoveedor = nombrePoveedor; }
    public void setFotografia1(String fotografia1 ) { this.fotografia1 = fotografia1; }
    public void setFotografia2(String fotografia2 ) { this.fotografia2 = fotografia2; }




    public void mostrar() {
        System.out.println("ID: " + id  +
                "\n| Nombre: " + nombre +
                "\n| Descripcion " + descripcion +
                "\n| Precio: $" + precio +
                "\n| Cantidad: " + cantidad +
                "\n| Caducidad: " + caducidad +
                "\n| Fecha de vencimiento: " + fechaVencimiento +
                "\n| Nombre proveedor: " + nombrePoveedor +
                "\n| Enlace fotografia 1: " + fotografia1 +
                "\n| Enlace fotografia 2: " + fotografia2);
    }
}


