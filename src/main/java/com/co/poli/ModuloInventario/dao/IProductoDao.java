package com.co.poli.ModuloInventario.dao;

import com.co.poli.ModuloInventario.model.Producto;
import java.util.List;

/**
 *
 * @author cgaop
 */
public interface IProductoDao {
    
    List<Producto> obtenerProductos();
    Producto obtenerProducto(String idProducto);
    String crearProducto(Producto producto);
    String eliminarProducto(String idProducto);
    String modificarProducto(Producto producto);
    
}
