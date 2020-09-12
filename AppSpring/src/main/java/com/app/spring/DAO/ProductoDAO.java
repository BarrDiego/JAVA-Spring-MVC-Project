/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.spring.DAO;

import com.app.spring.entidades.Producto;
import java.util.List;

/**
 *
 * @author diego
 */
public interface ProductoDAO {
    
    public void saveProducto(Producto producto);
    public Producto getProducto(Integer idProducto);
    public List<Producto> getAllProducto();
    public void updateProducto(Producto producto);
    public void deleteProducto(Integer idProducto);
    
}
