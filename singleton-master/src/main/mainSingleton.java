/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Singleton.DemoSingleton;

/**
 *
 * @author USUARIO
 */
public class mainSingleton {
    public static void main(String[] args) {
       DemoSingleton obcreado = DemoSingleton.getSingletonInstance("Singleton");
        DemoSingleton obnocreado = DemoSingleton.getSingletonInstance("2");
        
        System.out.println(obcreado);
        System.out.println(obnocreado); 
    }
    
}
