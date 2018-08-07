/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joi.api.catalog.service;

import com.joi.api.catalog.entity.ProductFlat;
import com.joi.api.catalog.repository.ProductFlatRepository;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ramy
 */
@Service
public class ProductFlatService implements IProductFlatService{
    
    @Autowired
    ProductFlatRepository productFlatRepository;
  
    public Collection<ProductFlat> getMobileHomePageCatalog(String storeId){
        
        return productFlatRepository.findMobileHomePageCatalog(storeId);
    }
    
  
//    @Override
//    public Collection<ProductFlat> getProductsByCategory(String storeId, String categoryId) {
//    
//        return productFlatRepository.findProductsByCategoryandStoreId(storeId, categoryId);
//    }
      @Override
    public Collection<ProductFlat> getProductsByCategory(String storeId, String categoryId) {
    
        return productFlatRepository.findProductsByCategoryandStoreId(storeId, categoryId);
    }
   }
