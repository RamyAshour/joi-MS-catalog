/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joi.api.catalog.rest;

import com.joi.api.catalog.dto.CategoryDTO;
import com.joi.api.catalog.help.DTOHelper;
import com.joi.api.catalog.service.IProductFlatService;
import java.util.Collection;
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Ramy
 */
@RestController
@RequestMapping("/catalog")
public class CatalogRestController {

   
    @Autowired
    IProductFlatService productFlatService;

 

    @GetMapping("/mobile/categories/home")
    HashMap<String, Collection<CategoryDTO>> getMobileHomeScreenCatalogByStoreId(@RequestHeader HttpHeaders headers) {

        String languageId;
        String storeId;
        String customerId;
        HashMap<String, Collection<CategoryDTO>> returnMap = new HashMap<>();
        if (headers.get("LanguageId") == null) {
            languageId = "1";

        } else {
            languageId = headers.get("LanguageId").get(0);

        }
        if (headers.get("StoreId") == null) {

            storeId = "1";
        } else {

            storeId = headers.get("StoreId").get(0);
        }
        if (headers.get("CustomerId") != null) {
            customerId = headers.get("CustomerId").get(0);
        }

        returnMap.put("categories", DTOHelper.toCategoryDTOs(productFlatService.getMobileHomePageCatalog(storeId), languageId,5));
        return returnMap;
    }

    @GetMapping("/mobile/category/{id}/products")
    HashMap<String, Collection<CategoryDTO>> getProductsByCategory(@PathVariable("id") String categoryId, @RequestHeader HttpHeaders headers) {

        if (categoryId == null || categoryId.isEmpty()) {
            return null;
        }
        String languageId;
        String storeId;
        String customerId;
        HashMap<String, Collection<CategoryDTO>> returnMap = new HashMap<>();
        
            languageId = headers.get("LanguageId").get(0);

            storeId = headers.get("StoreId").get(0);
        
        if (headers.get("CustomerId") != null) {
            customerId = headers.get("CustomerId").get(0);
        }


        returnMap.put("categories", 
                DTOHelper.toCategoryDTOs(
                        productFlatService.getProductsByCategory(storeId, categoryId),languageId,0));
        return returnMap;
    }

}
