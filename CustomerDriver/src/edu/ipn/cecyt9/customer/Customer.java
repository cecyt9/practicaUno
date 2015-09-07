/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ipn.cecyt9.customer;

/**
 *
 * @author EMMANUEL
 */
import java.math.BigDecimal;
import java.util.Locale;

/**
 *
 * @author EMMANUEL
 */
public class Customer {

    private String name;
    private int accountNumber;
    private Locale locale;
    private BigDecimal balance;

    /**
     *
     */
//    contructor vacio
    public Customer() {
        this.name = "Default Customer";
        this.accountNumber = 12345;
        this.locale = Locale.ITALY;
        this.balance = new BigDecimal("0");
    }
    //    contructor que recibe un parametro
    public Customer(String nameParam) {
        this.name = nameParam;
        this.accountNumber = 12345;
        this.locale = Locale.ITALY;
        this.balance = new BigDecimal("0");
    }
     //    contructor que recibe dos parametros
    public Customer(String nameParam, String accountParam) {
        this.name = nameParam;
        this.accountNumber = Integer.parseInt(accountParam);
        this.locale = Locale.ITALY;
        this.balance = new BigDecimal("0");
    }
    //    contructor que recibe tres parametros
    public Customer(String nameParam, String accountParam, String balanceParam) {
        this.name = nameParam;
        this.accountNumber = Integer.parseInt(accountParam);
        this.locale = Locale.ITALY;
        this.balance = new BigDecimal(balanceParam);
    }
    
    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * @throws Exception
     */
    public void setName(String name) throws Exception {
        if (name == null) {
            throw new IllegalArgumentException(
                    "Names must not be null");
        } else {
            this.name = name;
        }
    }

    /**
     *
     * @return
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     *
     * @param accountNumber
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     *
     * @return
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     *
     * @param balance
     */
    public void setBalance(float balance) {
        this.balance = new BigDecimal(balance);
    }

    public String toString() {
        java.text.NumberFormat format
                = java.text.NumberFormat.getCurrencyInstance(locale);
        StringBuilder value = new StringBuilder();
        value.append(String.format("Name: %s%n", this.name));
        value.append(String.format("Account Number: %d%n",
                this.accountNumber));
        value.append(String.format("Balance: %s%n",
                format.format(this.balance)));
        return value.toString();
    }
}
