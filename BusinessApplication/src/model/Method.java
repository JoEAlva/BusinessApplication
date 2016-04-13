/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
/**
 *
 * @author JorgeIgnacio
 */
public class Method {

    ArrayList<Product> arrayProduct;
    
    public Method() {//Builder 
    
        arrayProduct = new ArrayList<Product>();
        
    }
    
    public void addProduct(String arrayInfo[]) {
        Product temp = new Product(arrayInfo[0], arrayInfo[1], arrayInfo[2]);
        arrayProduct.add(temp);
    }
    
    public void deleteProduct(String idProduct) {
        arrayProduct.remove(indexProduct(idProduct));
    }
    
    public boolean modifyProdcut(String arrayInfo[], String idProduct) {
        boolean exist = false;
        for(int j=0; j<arrayProduct.size(); j++) {
            if(arrayProduct.get(j).getIdProduct().equals(idProduct)) {
                exist = true;
                arrayProduct.get(j).setDescription(arrayInfo[0]);
                arrayProduct.get(j).setAmount(arrayInfo[1]);
            }
        }
        return exist;
    }
    
    public boolean existProduct(String idProduct) {
        boolean exist = false;
        for(int j=0; j<arrayProduct.size(); j++ ) {
            if(arrayProduct.get(j).getIdProduct().equals(idProduct)) {
                exist = true;
            }
        }
        return exist;
    }
    
    public int indexProduct(String idProduct) {
        int index = 0;
        for(int j=0; j<arrayProduct.size(); j++) {
            if(arrayProduct.get(j).getIdProduct().equals(idProduct)) {
                index = j;
            }
        }
        return index;
    }
       
}//End Method
