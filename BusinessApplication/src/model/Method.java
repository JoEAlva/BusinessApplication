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
    public String[] arrayConsult = new String[2];
    
    public Method() {//Builder 
    
        arrayProduct = new ArrayList<Product>();
        
    }
    
    public void addProduct(String arrayInfo[]) {
        Product temp = new Product(arrayInfo[0], arrayInfo[1], arrayInfo[2]);
        arrayProduct.add(temp);
    }
    
    public void consultProduct(String idProduct) {
        
        if(existProduct(idProduct)) {
            arrayConsult[0] = ""+arrayProduct.get(indexProduct(idProduct)).getDescription();
            arrayConsult[1] = arrayProduct.get(indexProduct(idProduct)).getAmount();
        }
        
    }
    
    public String[] getArrayConsult() {
        return this.arrayConsult;
    }
    
    public void deleteProduct(String idProduct) {
        arrayProduct.remove(indexProduct(idProduct));
    }
    
    public void modifyProdcut(String arrayInfo[], String idProduct) {
        if(existProduct(idProduct)) {
            arrayProduct.get(indexProduct(idProduct)).setIdProduct(arrayInfo[0]);
            arrayProduct.get(indexProduct(idProduct)).setDescription(arrayInfo[1]);
            arrayProduct.get(indexProduct(idProduct)).setAmount(arrayInfo[2]);
        }
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
    
    public String showReport() {
        String report = "";
        for(int j=0; j<arrayProduct.size(); j++) {
            report+="IDPRODUCTO"+arrayProduct.get(j).getIdProduct()+" "+
                    "DESCRIPTION"+arrayProduct.get(j).getDescription()+" "+
                    "AMOUNT"+arrayProduct.get(j).getAmount()+"\n";        
        }
        return report;
    }
       
}//End Method
