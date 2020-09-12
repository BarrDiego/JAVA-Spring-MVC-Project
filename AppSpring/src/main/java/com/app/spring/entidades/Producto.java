/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.spring.entidades;

/**
 *
 * @author diego
 */
public class Producto {
    
    private Integer idProducto;
    private String modelo;
    private String descripcion;
    private String talle;
    private double precio;

    public Producto() {
    }

    public Producto(Integer idProducto, String modelo, String descripcion, String talle, double precio) {
        this.idProducto = idProducto;
        this.modelo = modelo;
        this.descripcion = descripcion;
        this.talle = talle;
        this.precio = precio;
    }
    
    

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTalle() {
        return talle;
    }

    public void setTalle(String talle) {
        this.talle = talle;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", modelo=" + modelo + ", descripcion=" + descripcion + ", talle=" + talle + ", precio=" + precio + '}';
    }
    
    
   
    
  
}
