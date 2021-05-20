
package com.samaspace.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour conversionDollarToDHS complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="conversionDollarToDHS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amountOfAccount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "conversionDollarToDHS", propOrder = {
    "amountOfAccount"
})
public class ConversionDollarToDHS {

    protected double amountOfAccount;

    /**
     * Obtient la valeur de la propriété amountOfAccount.
     * 
     */
    public double getAmountOfAccount() {
        return amountOfAccount;
    }

    /**
     * Définit la valeur de la propriété amountOfAccount.
     * 
     */
    public void setAmountOfAccount(double value) {
        this.amountOfAccount = value;
    }

}
