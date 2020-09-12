/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.spring.controller;

import com.app.spring.DAO.ProductoDAO;
import com.app.spring.entidades.Producto;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author diego
 */

@Controller

public class ProductoController {
    
   
    @Autowired
    private ProductoDAO productoDAO;
    
    
    
    @RequestMapping(value="/producto", method=RequestMethod.GET)
    public ModelAndView addProducto(HttpServletRequest req, HttpServletResponse res){
        ModelAndView mav = new ModelAndView("producto");
        mav.addObject("producto", new Producto());
        return mav;
    }
    
     @RequestMapping(value="/productos",method=RequestMethod.POST)
    public ModelAndView saveProducto(@ModelAttribute("producto") Producto producto, HttpServletRequest req, HttpServletResponse res){
        try{
            if(productoDAO.getProducto(producto.getIdProducto()) != null){
                productoDAO.updateProducto(producto);
                
            }                  
                   
            } catch (EmptyResultDataAccessException e){
                productoDAO.saveProducto(producto);
        }
        return new ModelAndView("redirect:/productos");
        
    }  
    
    @RequestMapping(value="/editar/{idProducto}", method = { RequestMethod.GET})
    public String editProducto(@ModelAttribute("producto") Producto producto,@PathVariable("idProducto")  Integer idProducto, Model mav){
        
        
        producto = productoDAO.getProducto(idProducto);
        List <Producto> listaProducto = productoDAO.getAllProducto();
        productoDAO.updateProducto(producto);
        mav.addAttribute("producto", producto);
        mav.addAttribute("listaProducto", listaProducto);
       
        
        
        return "actualizar";
    
    }
    
    @RequestMapping(method = {RequestMethod.POST})    
    public @ResponseBody ModelAndView updateProducto(@ModelAttribute("producto") Producto producto,HttpServletResponse res){
            
            productoDAO.updateProducto(producto);
                      
        return new ModelAndView("redirect:/productos");
        
    } 
    
    @RequestMapping(value="/eliminar/{idProducto}")
    public ModelAndView deleteProducto(@ModelAttribute("producto") Producto producto, @PathVariable("idProducto") Integer idProducto){
           
        productoDAO.deleteProducto(idProducto);
        return new ModelAndView("redirect:/productos");
    }
    
    @RequestMapping(value="/productos")    
    public ModelAndView listaProductos(@ModelAttribute("producto") Producto producto){
        
        ModelAndView mav = new ModelAndView("/productos");
        List <Producto> listaProducto = productoDAO.getAllProducto();
        mav.addObject("listaProducto", listaProducto);
        return mav;
    
    }
    
    
    
}
