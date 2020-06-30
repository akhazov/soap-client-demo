
package com.example.smevsid0003817.wsdl.com.rstyle.skmv.epgu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.rstyle.skmv.pfr.FIO;


/**
 * <p>Java class for JuridicalPersonData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JuridicalPersonData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="organizationName" type="{http://pfr.skmv.rstyle.com}ORGANIZATION_NAME"/&gt;
 *         &lt;element name="ogrn" type="{http://pfr.skmv.rstyle.com}OGRN"/&gt;
 *         &lt;element name="inn" type="{http://pfr.skmv.rstyle.com}INN"/&gt;
 *         &lt;element name="managerName" type="{http://pfr.skmv.rstyle.com}FIO"/&gt;
 *         &lt;element name="mail" type="{http://pfr.skmv.rstyle.com}EMAIL"/&gt;
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
@XmlType(name = "JuridicalPersonData", propOrder = {
    "organizationName",
    "ogrn",
    "inn",
    "managerName",
    "mail",
    "dptcodreg",
    "dptcodter"
})
public class JuridicalPersonData {

    @XmlElement(required = true)
    protected String organizationName;
    @XmlElement(required = true)
    protected String ogrn;
    @XmlElement(required = true)
    protected String inn;
    @XmlElement(required = true)
    protected FIO managerName;
    @XmlElement(required = true)
    protected String mail;
    @XmlElement(name = "DPTCOD_REG", required = true)
    protected String dptcodreg;
    @XmlElement(name = "DPTCOD_TER", required = true)
    protected String dptcodter;

    /**
     * Gets the value of the organizationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /**
     * Sets the value of the organizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationName(String value) {
        this.organizationName = value;
    }

    /**
     * Gets the value of the ogrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOgrn() {
        return ogrn;
    }

    /**
     * Sets the value of the ogrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOgrn(String value) {
        this.ogrn = value;
    }

    /**
     * Gets the value of the inn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInn() {
        return inn;
    }

    /**
     * Sets the value of the inn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInn(String value) {
        this.inn = value;
    }

    /**
     * Gets the value of the managerName property.
     * 
     * @return
     *     possible object is
     *     {@link FIO }
     *     
     */
    public FIO getManagerName() {
        return managerName;
    }

    /**
     * Sets the value of the managerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link FIO }
     *     
     */
    public void setManagerName(FIO value) {
        this.managerName = value;
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
