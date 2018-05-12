package com.co.poli.ModuloInventario.dao.impl;

import com.co.poli.ModuloInventario.dao.IProductoDao;
import com.co.poli.ModuloInventario.data.ProductoData;
import com.co.poli.ModuloInventario.model.Producto;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author cgaop
 */
@Repository
public class ProductoDaoImpl implements IProductoDao{

    @Override
    public List<Producto> obtenerProductos() {
        return ProductoData.getListaProductos();
    }

    @Override
    public Producto obtenerProducto(String idProducto) {
        Producto producto = null;
        List<Producto> listaProductos = ProductoData.getListaProductos();
        for (Producto p : listaProductos) {
            if (p.getId_producto().equals(idProducto)) {
                producto = p;
            }
        }
        return producto;
    }

    @Override
    public String crearProducto(Producto producto) {
        List<Producto> listaProductos = ProductoData.getListaProductos();//traigo la lista
        listaProductos.add(producto);//agrego producto a la lista
        ProductoData.setListaProductos(listaProductos);//actualizo la data de lista en la clase Producto
        return"Producto creado...";
    }

    @Override
    public String eliminarProducto(String idProducto) {
        List<Producto> listaProducto = ProductoData.getListaProductos();
        //Producto p = new Producto();
        //p.setId_producto(idProducto);
        //listaProducto.remove(p);
        listaProducto.remove(obtenerProducto(idProducto));//lo removi de la lista
        ProductoData.setListaProductos(listaProducto);
        return "Producto eliminado..";
    }

    @Override
    public String modificarProducto(Producto producto) {
        List<Producto> listaProducto = ProductoData.getListaProductos();
        listaProducto.set(listaProducto.indexOf(producto), producto);
        ProductoData.setListaProductos(listaProducto);
        return"Producto modificado..";
    }
    
}
