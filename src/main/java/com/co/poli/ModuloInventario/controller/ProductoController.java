package com.co.poli.ModuloInventario.controller;

import com.co.poli.ModuloInventario.business.IProductoBusiness;
import com.co.poli.ModuloInventario.model.Producto;
import com.co.poli.ModuloInventario.path.Path.PathProducto;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author cgaop
 */

@RestController
@RequestMapping(value = "/")
public class ProductoController {
    
    @Autowired
    private IProductoBusiness productoBusiness;
    
    @GetMapping(PathProducto.PRODUCTO)
    public List<Producto> obtenerProductos(HttpServletResponse hsr){
        return productoBusiness.obtenerProductos();
    }
    
    @GetMapping(PathProducto.PRODUCTO_ID)//si me llega una variable, entro a obtener 1 producto
    public Producto obtenerProducto(@PathVariable String id_producto ,HttpServletResponse hsr){
        return productoBusiness.obtenerProducto(id_producto);
    }
    
    @PostMapping(PathProducto.PRODUCTO)
    public String crearProducto(@RequestBody Producto producto, HttpServletResponse hsr){
        return productoBusiness.crearProducto(producto);
    }
    
    @DeleteMapping(PathProducto.PRODUCTO_ID)
    private String eliminarProducto(@PathVariable String id_producto, HttpServletResponse hsr){
        return productoBusiness.eliminarProducto(id_producto);
    }
    
    @PutMapping(PathProducto.PRODUCTO)
    private String modificarProducto(@RequestBody Producto producto, HttpServletResponse hsr){
        return productoBusiness.modificarProducto(producto);
    }
}
