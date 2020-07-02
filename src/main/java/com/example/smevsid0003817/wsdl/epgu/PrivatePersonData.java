
package com.example.smevsid0003817.wsdl.epgu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.example.smevsid0003817.wsdl.pfr.FIO;


/**
 * <p>Java class for PrivatePersonData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrivatePersonData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="snils" type="{http://pfr.skmv.rstyle.com}SNILS"/&gt;
 *         &lt;group ref="{http://epgu.skmv.rstyle.com}PersonData"/&gt;
 *         &lt;group ref="{http://epgu.skmv.rstyle.com}BaseEpguData"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrivatePersonData", propOrder = {
    "snils",
    "fio",
    "birthDate",
    "mail",
    "dptcodreg",
    "dptcodter"
})
public class PrivatePersonData {

    @XmlElement(required = true)
    protected String snils;
    @XmlElement(required = true)
    protected FIO fio;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthDate;
    @XmlElement(required = true)
    protected String mail;
    @XmlElement(name = "DPTCOD_REG", required = true)
    protected String dptcodreg;
    @XmlElement(name = "DPTCOD_TER", required = true)
    protected String dptcodter;

    /**
     * Gets the value of the snils property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnils() {
        return snils;
    }

    /**
     * Sets the value of the snils property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnils(String value) {
        this.snils = value;
    }

    /**
     * Gets the value of the fio property.
     * 
     * @return
     *     possible object is
     *     {@link FIO }
     *     
     */
    public FIO getFio() {
        return fio;
    }

    /**
     * Sets the value of the fio property.
     * 
     * @param value
     *     allowed object is
     *     {@link FIO }
     *     
     */
    public void setFio(FIO value) {
        this.fio = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDate(XMLGregorianCalendar value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the mail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMail() {
        return mail;
    }

    /**
     * Sets the value of the mail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMail(String value) {
        this.mail = value;
    }

    /**
     * Gets the value of the dptcodreg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDPTCODREG() {
        return dptcodreg;
    }

    /**
     * Sets the value of the dptcodreg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDPTCODREG(String value) {
        this.dptcodreg = value;
    }

    /**
     * Gets the value of the dptcodter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDPTCODTER() {
        return dptcodter;
    }

    /**
     * Sets the value of the dptcodter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDPTCODTER(String value) {
        this.dptcodter = value;
    }

}
