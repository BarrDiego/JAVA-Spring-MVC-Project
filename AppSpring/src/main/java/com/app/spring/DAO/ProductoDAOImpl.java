/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.spring.DAO;

import com.app.spring.entidades.Producto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 *
 * @author diego
 */

@Repository
public class ProductoDAOImpl implements ProductoDAO{
    
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    
    

    @Override
    public void saveProducto(Producto producto) {
        
        String sql = "INSERT INTO productos values(?,?,?,?,?)";
        jdbcTemplate.update(sql, new Object[]{
        producto.getIdProducto(), producto.getModelo(), producto.getDescripcion(), producto.getTalle(),producto.getPrecio()
        });
    }

    @Override
    public Producto getProducto(Integer idProducto) {
        String sql = "SELECT * FROM productos where idProducto=?";
        Producto producto = (Producto) jdbcTemplate.queryForObject(sql, new Object[]
        {idProducto}, new RowMapper<Producto>()
        {
            
            
            @Override
            public Producto mapRow(ResultSet rs , int rowNum) throws SQLException{
                Producto prod = new Producto();
                prod.setIdProducto(rs.getInt(1));
                prod.setModelo(rs.getString(2));
                prod.setDescripcion(rs.getString(3));
                prod.setTalle(rs.getString(4));
                prod.setPrecio(rs.getDouble(5));
                return prod;
                
            }
        });
        return producto;
    }

    @Override
    public List<Producto> getAllProducto() {
        String sql = "SELECT * FROM productos";
        List <Producto> listaProducto = jdbcTemplate.query(sql, new ResultSetExtractor<List<Producto>>(){
            
            @Override
            public List <Producto> extractData(ResultSet rs) throws SQLException{
                
                List <Producto> list = new ArrayList<>();
                while(rs.next()){
                    Producto prod = new Producto();
                    prod.setIdProducto(rs.getInt(1));
                    prod.setModelo(rs.getString(2));
                    prod.setDescripcion(rs.getString(3));
                    prod.setTalle(rs.getString(4));
                    prod.setPrecio(rs.getDouble(5));
                    list.add(prod);
                }
                return list;
            }
    
         });
        return listaProducto;
    }

    @Override
    public void updateProducto(Producto producto) {
        String sql = "UPDATE productos SET modelo=?, descripcion=?, talle=?, precio=? WHERE idProducto=?";
        jdbcTemplate.update(sql, new Object[]{
        producto.getModelo(), producto.getDescripcion(), producto.getTalle(), producto.getPrecio(), producto.getIdProducto()
        });
    }

    @Override
    public void deleteProducto(Integer idProducto) {
        String sql = "DELETE FROM productos where idProducto=?";
        jdbcTemplate.update(sql, new Object[]
        {idProducto});
    }
    
}
