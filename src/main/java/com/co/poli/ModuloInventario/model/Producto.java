package com.co.poli.ModuloInventario.model;

import java.util.Objects;

/**
 *
 * @author cgaop
 */
public class Producto {
    
    private String id_producto;
    private String nombre;
    private String categoria;
    private Double existencia;

    public Producto() {
    }

    public Producto(String id_producto, String nombre, String categoria, double existencia) {
        this.id_producto = id_producto;
        this.nombre = nombre;
        this.categoria = categoria;
        this.existencia = existencia;
    }

    public double getExistencia() {
        return existencia;
    }

    public void setExistencia(double existencia) {
        this.existencia = existencia;
    }

    public String getId_producto() {
        return id_producto;
    }

    public void setId_producto(String id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id_producto);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        if (!Objects.equals(this.id_producto, other.id_producto)) {
            return false;
        }
        return true;
    }    
    
}
