/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.FRM_Main;
import model.Method;
/**
 *
 * @author JorgeIgnacio
 */
public class Controller_FRM_Main implements ActionListener {

    FRM_Main fRM_Main;
    Method method;
    
    
    public Controller_FRM_Main(FRM_Main fRM_Main) {
        this.fRM_Main = fRM_Main;
        method = new Method();
    }
       
    public void actionPerformed(ActionEvent e) {
        
        if(e.getActionCommand().equals("CONSULT")) {
            //System.out.println("Funciona CONSULT");
            method.consultProduct(fRM_Main.getIdProduct());
            fRM_Main.setInfo_jT(method.getArrayConsult());
        }
        
        if(e.getActionCommand().equals("SAVE")) {
            //System.out.println("Funciona SAVE");
            
        }
        
        if(e.getActionCommand().equals("CLOSE")) {
            //System.out.println("Funciona CLOSE");
        }
        
        if(e.getActionCommand().equals("ADD")) {
            //System.out.println("Funciona CLOSE");
            method.addProduct(fRM_Main.getInfo_jT());
            fRM_Main.clean_jT();
        }
        
        if(e.getActionCommand().equals("MODIFY")) {
            //System.out.println("Funciona CLOSE");
            method.modifyProdcut(fRM_Main.getInfo_jT() ,fRM_Main.getIdProduct());
            fRM_Main.clean_jT();
        }
        
        if(e.getActionCommand().equals("DELETE")) {
            //System.out.println("Funciona CLOSE");
            method.deleteProduct(fRM_Main.getIdProduct());
            fRM_Main.clean_jT();
        }
        
        if(e.getActionCommand().equals("UPDATE")) {
            //System.out.println("Funciona CLOSE");
        }
        
    }
    
}//End Controller_FRM_Main
