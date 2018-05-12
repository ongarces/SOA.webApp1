package com.co.poli.ModuloInventario.business.impl;

import com.co.poli.ModuloInventario.business.IProductoBusiness;
import com.co.poli.ModuloInventario.dao.IProductoDao;
import com.co.poli.ModuloInventario.data.ProductoData;
import com.co.poli.ModuloInventario.model.Producto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author cgaop
 */
@Service
public class ProductoBusinessImpl implements IProductoBusiness {

    @Autowired
    private IProductoDao productoDao;//inyecto los metodos

    @Override
    public List<Producto> obtenerProductos() {
        return productoDao.obtenerProductos();
    }

    @Override
    public Producto obtenerProducto(String idProducto) {
        return productoDao.obtenerProducto(idProducto);
    }

    @Override
    public String crearProducto(Producto producto) {
        String respuesta = "";
        List<Producto> listaProductos = ProductoData.getListaProductos();

        if (producto.getExistencia() < 0) {
            respuesta = "...No se puede ingresar, existencia negativa";
        } else {
            if (listaProductos.contains(producto)) {
                respuesta = "Producto ya esta registrado...";
            } else {
                respuesta = productoDao.crearProducto(producto);
            }
        }
        return respuesta;
    }

    @Override
    public String eliminarProducto(String idProducto) {
        String respuesta = "Producto no Existe";
        List<Producto> listaProductos = ProductoData.getListaProductos();
        if (listaProductos.contains(productoDao.obtenerProducto(idProducto))) {
            respuesta = productoDao.eliminarProducto(idProducto);
        }
        return respuesta;
    }

    @Override
    public String modificarProducto(Producto producto) {
        String respuesta = "";
        List<Producto> listaProductos = ProductoData.getListaProductos();
        if (!listaProductos.contains(producto)) {
            respuesta = "Producto NO esta registrado...";
        } else {
            if (producto.getExistencia() < 0) {
                respuesta = "no puede ingresar existencia negativa";
            } else {
                respuesta = productoDao.modificarProducto(producto);
            }
        }
        return respuesta;
    }

}
