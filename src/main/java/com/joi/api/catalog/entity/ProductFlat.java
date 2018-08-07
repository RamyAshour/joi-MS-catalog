/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joi.api.catalog.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Ramy
 */
@Entity
@Table(name = "product_flat")
public class ProductFlat {

    @Id
    private String id;
    @Column(name = "product_id")
    private String productId;
    @Column(name = "product_en_name")
    private String productEnName;
     @Column(name = "product_ar_name")
    private String productArName;
    @Column(name = "category_id")
    private String categoryId;
    @Column(name = "category_en_name")
    private String categoryEnName;
    @Column(name = "category_ar_name")
    private String categoryArName;
    @Column(name="category_en_description")
    private String categoryEnDescription;
    @Column(name="category_ar_description")
    private String categoryArDescription;
    @Column(name = "store_id")
    private String storeId;
    @Column(name = "product_price")
    private String productPrice;
    @Column(name = "product_image_url")
    private String productPictureUrl;
    @Column(name = "currency")
    private String currency;
    @Column(name="product_display_order")
    private int productDisplayOrder; 
    @Column(name="category_display_order")
    private int categoryDisplayOrder; 
    @Column(name = "product_showonhomepage")
    private boolean productShowOnHomePage;
    @Column(name = "category_showonhomepage")
    private boolean categoryShowOnHomePage;
    @Column(name = "category_showonmobilehomepage")
    private boolean categoryShowOnMobileHomePage;
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductEnName() {
        return productEnName;
    }

    public void setProductEnName(String productEnName) {
        this.productEnName = productEnName;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryEnName() {
        return categoryEnName;
    }

    public void setCategoryEnName(String categoryEnName) {
        this.categoryEnName = categoryEnName;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    @Override
    public boolean equals(Object obj) {

        return (((ProductFlat) obj).categoryId == this.categoryId);
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductPictureUrl() {
        return productPictureUrl;
    }

    public void setProductPictureUrl(String productPictureUrl) {
        this.productPictureUrl = productPictureUrl;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getProductArName() {
        return productArName;
    }

    public void setProductArName(String productArName) {
        this.productArName = productArName;
    }

    public String getCategoryArName() {
        return categoryArName;
    }

    public void setCategoryArName(String categoryArName) {
        this.categoryArName = categoryArName;
    }

       public String getCategoryArDescription() {
        return categoryArDescription;
    }

    public void setCategoryArDescription(String categoryArDescription) {
        this.categoryArDescription = categoryArDescription;
    }

    public String getCategoryEnDescription() {
        return categoryEnDescription;
    }

    public void setCategoryEnDescription(String categoryEnDescription) {
        this.categoryEnDescription = categoryEnDescription;
    }

 public int getProductDisplayOrder() {
        return productDisplayOrder;
    }

    public void setProductDisplayOrder(int productDisplayOrder) {
        this.productDisplayOrder = productDisplayOrder;
    }

    public int getCategoryDisplayOrder() {
        return categoryDisplayOrder;
    }

    public void setCategoryDisplayOrder(int categoryDisplayOrder) {
        this.categoryDisplayOrder = categoryDisplayOrder;
    }

    public boolean isProductShowOnHomePage() {
        return productShowOnHomePage;
    }

    public void setProductShowOnHomePage(boolean productShowOnHomePage) {
        this.productShowOnHomePage = productShowOnHomePage;
    }

    public boolean isCategoryShowOnHomePage() {
        return categoryShowOnHomePage;
    }

    public void setCategoryShowOnHomePage(boolean categoryShowOnHomePage) {
        this.categoryShowOnHomePage = categoryShowOnHomePage;
    }

    public boolean isCategoryShowOnMobileHomePage() {
        return categoryShowOnMobileHomePage;
    }

    public void setCategoryShowOnMobileHomePage(boolean categoryShowOnMobileHomePage) {
        this.categoryShowOnMobileHomePage = categoryShowOnMobileHomePage;
    }

    
}
