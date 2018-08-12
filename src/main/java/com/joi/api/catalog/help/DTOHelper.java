/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joi.api.catalog.help;

import com.joi.api.catalog.dto.CategoryDTO;
import com.joi.api.catalog.dto.ProductDTO;
import com.joi.api.catalog.entity.ProductFlat;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Ramy
 */
public class DTOHelper {

    public static Collection<CategoryDTO> toCategoryDTOs(Collection<ProductFlat> productFlatList, String languageId, int productsLimit) {

        Collection<CategoryDTO> categories = new ArrayList<CategoryDTO>();
       
        
        for (ProductFlat p : productFlatList) {

            CategoryDTO c = new CategoryDTO(p, languageId);

            if (!categories.contains(c)) {
                if (c.getProducts().size() < productsLimit|| productsLimit==0) {
                    c.getProducts().add(new ProductDTO(p, languageId));
                }
                categories.add(c);

            } else {
                for (CategoryDTO cat : categories) {
                    if (c.equals(cat)) {
                        if (cat.getProducts().size() < productsLimit|| productsLimit==0) {
                            cat.getProducts().add(new ProductDTO(p, languageId));   
                        }
                    }
                }
            }

        }
        return categories;
    }

}
