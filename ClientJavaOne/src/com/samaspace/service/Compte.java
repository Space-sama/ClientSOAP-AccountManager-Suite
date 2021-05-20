
package com.samaspace.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour compte complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="compte">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codeAcount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="amountAcount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="dateCreationOfAccount" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "compte", propOrder = {
    "codeAcount",
    "amountAcount",
    "dateCreationOfAccount"
})
public class Compte {

    protected Long codeAcount;
    protected double amountAcount;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCreationOfAccount;

    /**
     * Obtient la valeur de la propri�t� codeAcount.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodeAcount() {
        return codeAcount;
    }

    /**
     * D�finit la valeur de la propri�t� codeAcount.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodeAcount(Long value) {
        this.codeAcount = value;
    }

    /**
     * Obtient la valeur de la propri�t� amountAcount.
     * 
     */
    public double getAmountAcount() {
        return amountAcount;
    }

    /**
     * D�finit la valeur de la propri�t� amountAcount.
     * 
     */
    public void setAmountAcount(double value) {
        this.amountAcount = value;
    }

    /**
     * Obtient la valeur de la propri�t� dateCreationOfAccount.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateCreationOfAccount() {
        return dateCreationOfAccount;
    }

    /**
     * D�finit la valeur de la propri�t� dateCreationOfAccount.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateCreationOfAccount(XMLGregorianCalendar value) {
        this.dateCreationOfAccount = value;
    }

}
