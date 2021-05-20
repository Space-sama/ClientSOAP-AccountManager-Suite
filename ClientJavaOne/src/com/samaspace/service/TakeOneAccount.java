
package com.samaspace.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour takeOneAccount complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="takeOneAccount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codeAccount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "takeOneAccount", propOrder = {
    "codeAccount"
})
public class TakeOneAccount {

    protected Long codeAccount;

    /**
     * Obtient la valeur de la propriété codeAccount.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodeAccount() {
        return codeAccount;
    }

    /**
     * Définit la valeur de la propriété codeAccount.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodeAccount(Long value) {
        this.codeAccount = value;
    }

}
