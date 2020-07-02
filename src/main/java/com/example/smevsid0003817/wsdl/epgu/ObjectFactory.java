
package com.example.smevsid0003817.wsdl.epgu;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.example.smevsid0003817.wsdl.rev120315.EpguCancelRequestType;
import com.example.smevsid0003817.wsdl.rev120315.EpguForeignCitizenRequestType;
import com.example.smevsid0003817.wsdl.rev120315.EpguJuridicalPersonRequestType;
import com.example.smevsid0003817.wsdl.rev120315.EpguPrivateEntrepreneurRequestType;
import com.example.smevsid0003817.wsdl.rev120315.EpguPrivatePersonRequestType;
import com.example.smevsid0003817.wsdl.rev120315.EpguResponseType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.rstyle.skmv.epgu package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PrivatePersonData_QNAME = new QName("http://epgu.skmv.rstyle.com", "PrivatePersonData");
    private final static QName _PrivateEntrepreneurData_QNAME = new QName("http://epgu.skmv.rstyle.com", "PrivateEntrepreneurData");
    private final static QName _JuridicalPersonData_QNAME = new QName("http://epgu.skmv.rstyle.com", "JuridicalPersonData");
    private final static QName _ForeignCitizenData_QNAME = new QName("http://epgu.skmv.rstyle.com", "ForeignCitizenData");
    private final static QName _ChangeOrderInfo_QNAME = new QName("http://epgu.skmv.rstyle.com", "ChangeOrderInfo");
    private final static QName _Reason_QNAME = new QName("http://epgu.skmv.rstyle.com", "reason");
    private final static QName _EpguPrivatePersonRequest_QNAME = new QName("http://epgu.skmv.rstyle.com", "EpguPrivatePersonRequest");
    private final static QName _EpguPrivateEntrepreneurRequest_QNAME = new QName("http://epgu.skmv.rstyle.com", "EpguPrivateEntrepreneurRequest");
    private final static QName _EpguJuridicalPersonRequest_QNAME = new QName("http://epgu.skmv.rstyle.com", "EpguJuridicalPersonRequest");
    private final static QName _EpguForeignCitizenRequest_QNAME = new QName("http://epgu.skmv.rstyle.com", "EpguForeignCitizenRequest");
    private final static QName _EpguCancelRequest_QNAME = new QName("http://epgu.skmv.rstyle.com", "EpguCancelRequest");
    private final static QName _EpguResponse_QNAME = new QName("http://epgu.skmv.rstyle.com", "EpguResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.rstyle.skmv.epgu
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ChangeOrderInfo }
     * 
     */
    public ChangeOrderInfo createChangeOrderInfo() {
        return new ChangeOrderInfo();
    }

    /**
     * Create an instance of {@link PrivatePersonData }
     * 
     */
    public PrivatePersonData createPrivatePersonData() {
        return new PrivatePersonData();
    }

    /**
     * Create an instance of {@link PrivateEntrepreneurData }
     * 
     */
    public PrivateEntrepreneurData createPrivateEntrepreneurData() {
        return new PrivateEntrepreneurData();
    }

    /**
     * Create an instance of {@link JuridicalPersonData }
     * 
     */
    public JuridicalPersonData createJuridicalPersonData() {
        return new JuridicalPersonData();
    }

    /**
     * Create an instance of {@link ForeignCitizenData }
     * 
     */
    public ForeignCitizenData createForeignCitizenData() {
        return new ForeignCitizenData();
    }

    /**
     * Create an instance of {@link ChangeOrderInfo.OrderId }
     * 
     */
    public ChangeOrderInfo.OrderId createChangeOrderInfoOrderId() {
        return new ChangeOrderInfo.OrderId();
    }

    /**
     * Create an instance of {@link ChangeOrderInfo.StatusCode }
     * 
     */
    public ChangeOrderInfo.StatusCode createChangeOrderInfoStatusCode() {
        return new ChangeOrderInfo.StatusCode();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrivatePersonData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PrivatePersonData }{@code >}
     */
    @XmlElementDecl(namespace = "http://epgu.skmv.rstyle.com", name = "PrivatePersonData")
    public JAXBElement<PrivatePersonData> createPrivatePersonData(PrivatePersonData value) {
        return new JAXBElement<PrivatePersonData>(_PrivatePersonData_QNAME, PrivatePersonData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrivateEntrepreneurData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PrivateEntrepreneurData }{@code >}
     */
    @XmlElementDecl(namespace = "http://epgu.skmv.rstyle.com", name = "PrivateEntrepreneurData")
    public JAXBElement<PrivateEntrepreneurData> createPrivateEntrepreneurData(PrivateEntrepreneurData value) {
        return new JAXBElement<PrivateEntrepreneurData>(_PrivateEntrepreneurData_QNAME, PrivateEntrepreneurData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JuridicalPersonData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link JuridicalPersonData }{@code >}
     */
    @XmlElementDecl(namespace = "http://epgu.skmv.rstyle.com", name = "JuridicalPersonData")
    public JAXBElement<JuridicalPersonData> createJuridicalPersonData(JuridicalPersonData value) {
        return new JAXBElement<JuridicalPersonData>(_JuridicalPersonData_QNAME, JuridicalPersonData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForeignCitizenData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ForeignCitizenData }{@code >}
     */
    @XmlElementDecl(namespace = "http://epgu.skmv.rstyle.com", name = "ForeignCitizenData")
    public JAXBElement<ForeignCitizenData> createForeignCitizenData(ForeignCitizenData value) {
        return new JAXBElement<ForeignCitizenData>(_ForeignCitizenData_QNAME, ForeignCitizenData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeOrderInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ChangeOrderInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://epgu.skmv.rstyle.com", name = "ChangeOrderInfo")
    public JAXBElement<ChangeOrderInfo> createChangeOrderInfo(ChangeOrderInfo value) {
        return new JAXBElement<ChangeOrderInfo>(_ChangeOrderInfo_QNAME, ChangeOrderInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://epgu.skmv.rstyle.com", name = "reason")
    public JAXBElement<String> createReason(String value) {
        return new JAXBElement<String>(_Reason_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EpguPrivatePersonRequestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EpguPrivatePersonRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "http://epgu.skmv.rstyle.com", name = "EpguPrivatePersonRequest")
    public JAXBElement<EpguPrivatePersonRequestType> createEpguPrivatePersonRequest(EpguPrivatePersonRequestType value) {
        return new JAXBElement<EpguPrivatePersonRequestType>(_EpguPrivatePersonRequest_QNAME, EpguPrivatePersonRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EpguPrivateEntrepreneurRequestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EpguPrivateEntrepreneurRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "http://epgu.skmv.rstyle.com", name = "EpguPrivateEntrepreneurRequest")
    public JAXBElement<EpguPrivateEntrepreneurRequestType> createEpguPrivateEntrepreneurRequest(EpguPrivateEntrepreneurRequestType value) {
        return new JAXBElement<EpguPrivateEntrepreneurRequestType>(_EpguPrivateEntrepreneurRequest_QNAME, EpguPrivateEntrepreneurRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EpguJuridicalPersonRequestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EpguJuridicalPersonRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "http://epgu.skmv.rstyle.com", name = "EpguJuridicalPersonRequest")
    public JAXBElement<EpguJuridicalPersonRequestType> createEpguJuridicalPersonRequest(EpguJuridicalPersonRequestType value) {
        return new JAXBElement<EpguJuridicalPersonRequestType>(_EpguJuridicalPersonRequest_QNAME, EpguJuridicalPersonRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EpguForeignCitizenRequestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EpguForeignCitizenRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "http://epgu.skmv.rstyle.com", name = "EpguForeignCitizenRequest")
    public JAXBElement<EpguForeignCitizenRequestType> createEpguForeignCitizenRequest(EpguForeignCitizenRequestType value) {
        return new JAXBElement<EpguForeignCitizenRequestType>(_EpguForeignCitizenRequest_QNAME, EpguForeignCitizenRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EpguCancelRequestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EpguCancelRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "http://epgu.skmv.rstyle.com", name = "EpguCancelRequest")
    public JAXBElement<EpguCancelRequestType> createEpguCancelRequest(EpguCancelRequestType value) {
        return new JAXBElement<EpguCancelRequestType>(_EpguCancelRequest_QNAME, EpguCancelRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EpguResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EpguResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://epgu.skmv.rstyle.com", name = "EpguResponse")
    public JAXBElement<EpguResponseType> createEpguResponse(EpguResponseType value) {
        return new JAXBElement<EpguResponseType>(_EpguResponse_QNAME, EpguResponseType.class, null, value);
    }

}
