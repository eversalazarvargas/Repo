/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.accenture.soapproducer.service;

import com.accenture.soapproducer.model.Person;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 *
 * @author e.salazar.vargas
 */
@WebService(portName = "RFCCalculator", serviceName = "RFCCalculator", targetNamespace = "acc")
public class RFCCalculatorImpl implements RFCCalculator {
    
    @Override
    @WebMethod(operationName = "get_rfc")
    @WebResult(name = "rfc")
    public String getRFC(@WebParam(name = "person_param") Person person) {
        
        StringBuilder rfc = new StringBuilder();
        rfc.append(getNamePart(person));
        rfc.append(getDatePart(person));
        return rfc.toString();
    }
    
    @WebMethod(exclude = true)
    public String getNamePart(Person person) {
        StringBuilder namePart = new StringBuilder();
        namePart.append(Character.toUpperCase(person.getLastName().charAt(0)));
        
        for(int i=1 ; i<person.getLastName().length() ; i++) {
            char letter = Character.toUpperCase(person.getLastName().charAt(i));
            if(letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
                namePart.append(letter);
                break;
            }
        }
        
        namePart.append(Character.toUpperCase(person.getSecondLastName().charAt(0)));
        namePart.append(Character.toUpperCase(person.getFirstName().charAt(0)));
        
        return namePart.toString();
    }
    
    @WebMethod(exclude = true)
    public String getDatePart(Person person) {
        StringBuilder datePart = new StringBuilder();
        String year = Integer.toString(person.getBirthYear());
        datePart.append(year.substring(year.length()-2, year.length()));
        datePart.append(person.getBirthMonth() < 10 ? "0" + person.getBirthMonth() : Integer.toString(person.getBirthMonth()));
        datePart.append(person.getBirthDay() < 10 ? "0" + person.getBirthDay() : Integer.toString(person.getBirthDay()));
        
        return datePart.toString();
    }
}
