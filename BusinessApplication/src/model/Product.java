/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author JorgeIgnacio
 */
public class Product {
    
    private String idProduct;
    private String description;
    private String amount;

    public Product(String idProduct, String description, String amount) {
        this.idProduct = idProduct;
        this.description = description;
        this.amount = amount;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
       
}//End Product
