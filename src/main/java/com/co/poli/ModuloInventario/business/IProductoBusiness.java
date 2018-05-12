package com.co.poli.ModuloInventario.business;

import com.co.poli.ModuloInventario.model.Producto;
import java.util.List;

/**
 *
 * @author cgaop
 */
public interface IProductoBusiness {
    
    List<Producto> obtenerProductos();
    Producto obtenerProducto(String idProducto);
    String crearProducto(Producto producto);
    String eliminarProducto(String idProducto);
    String modificarProducto(Producto producto);
    
}
