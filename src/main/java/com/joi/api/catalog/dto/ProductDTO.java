/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joi.api.catalog.dto;
import com.joi.api.catalog.entity.ProductFlat;

/**
 *
 * @author Ramy
 */
public class ProductDTO {
    private String id;
    private String name;
    private String price;
    private String currency;
    private String imageUrl;
   
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id==null?"":id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name==null?"":name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price==null?"":price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency==null?"":currency;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl==null?"":imageUrl;
    }

    
    public ProductDTO() {
    }
   
     public ProductDTO(ProductFlat product, String languageId) {
    
        setId(product.getProductId());
        setCurrency(product.getCurrency());
        setImageUrl(product.getProductPictureUrl());
        
        setPrice(product.getProductPrice());
        
        if(languageId.equals("1")){
            setName(product.getProductEnName());
        }else{
            setName(product.getProductArName());
        }
        
        
    }  

   
    
    
    
}
