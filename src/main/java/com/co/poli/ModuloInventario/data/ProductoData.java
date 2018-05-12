package com.co.poli.ModuloInventario.data;

import com.co.poli.ModuloInventario.model.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cgaop
 */
public class ProductoData {
    
    private static List<Producto> listaProductos;
    
    static{//constructor
        listaProductos = new ArrayList<Producto>()
        {
            {
                add(new Producto("001", "Gaseosa", "Refrescos", 0D));
                add(new Producto("002", "Hit", "Refrescos", 0D));
                add(new Producto("003", "Leche", "Lacteos", 0D));
                add(new Producto("004", "1LAgua", "Agua", 0D));
            }
        };
    }

    public static List<Producto> getListaProductos() {
        return listaProductos;
    }

    public static void setListaProductos(List<Producto> aListaProductos) {
        listaProductos = aListaProductos;
    }
    
    
}
