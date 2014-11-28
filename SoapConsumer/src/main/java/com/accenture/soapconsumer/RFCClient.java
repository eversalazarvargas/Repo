/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.accenture.soapconsumer;

import acc.Person;
import acc.RFCCalculator;
import acc.RFCCalculatorImpl;

/**
 *
 * @author e.salazar.vargas
 */
public class RFCClient {
    
    public static void main(String [] args) {
        Person person = new Person();
        person.setFirstName("everardo");
        person.setLastName("salazar");
        person.setSecondLastName("vargas");
        person.setBirthDay(19);
        person.setBirthMonth(7);
        person.setBirthYear(1980);
        
        RFCCalculatorImpl rfcCalculator = (new RFCCalculator()).getRFCCalculator();
        
        
        
        System.out.println("RFC = " + rfcCalculator.getRfc(person));
    }
}
