/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joi.api.catalog.service;

import com.joi.api.catalog.entity.ProductFlat;

import java.util.Collection;

/**
 *
 * @author Ramy
 */
public interface IProductFlatService {

    Collection<ProductFlat> getMobileHomePageCatalog(String storeId);

    Collection<ProductFlat> getProductsByCategory(String storeId, String categoryId);


}
