/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joi.api.catalog.repository;

import com.joi.api.catalog.entity.ProductFlat;
import java.util.Collection;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Ramy
 */
@Repository
public interface ProductFlatRepository extends JpaRepository<ProductFlat, Integer>  {

    @Cacheable(value = "MobileHomePageCatalog", key = "#storeId")
    @Query(" select p from ProductFlat p where p.categoryShowOnMobileHomePage =true and "
            + "p.productShowOnHomePage=true and p.storeId=:storeId order by p.categoryId asc , p.productDisplayOrder asc")
    Collection<ProductFlat> findMobileHomePageCatalog(@Param("storeId") String storeId);

    @Cacheable(value = "ProductsByCategoryandStoreId", key = "#storeId + #categoyId")
    @Query(" select p from ProductFlat p where p.categoryId=:categoryId and p.storeId=:storeId order by p.productDisplayOrder asc")
    Collection<ProductFlat> findProductsByCategoryandStoreId(@Param("storeId") String storeId, @Param("categoryId") String categoryId);
 
 
    
}
