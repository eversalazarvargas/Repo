/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.accenture.soapproducer.service;

import com.accenture.soapproducer.model.Person;
import javax.jws.WebService;

/**
 *
 * @author e.salazar.vargas
 */
public interface RFCCalculator {
    public String getRFC(Person person);
    public String getNamePart(Person person);
    public String getDatePart(Person person);
}
