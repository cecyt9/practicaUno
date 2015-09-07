/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ipn.cecyt9.customer;

import java.math.BigDecimal;
import java.util.Locale;

/**
 *
 * @author EMMANUEL
 */
public interface CustomerInterface {
    //aqui tenemos que quitar el modificador de acceso private ya que 
//    por defecto las variables en una interfaz son public static final.
    String name = "Default Customer";
    int accountNumber = 12345;
    Locale locale = Locale.ITALY;
    BigDecimal balance = new BigDecimal("0");
    
    //estoy agregando un metodo nuevo
    public String facturar();
    
}



