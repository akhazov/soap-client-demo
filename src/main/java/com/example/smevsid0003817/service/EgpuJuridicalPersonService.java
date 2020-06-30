package com.example.smevsid0003817.service;

import com.example.smevsid0003817.wsdl.com.rstyle.skmv.epgu.ChangeOrderInfo;
import com.example.smevsid0003817.wsdl.com.rstyle.skmv.epgu.JuridicalPersonData;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

/**
 * Сервис приема заявления с ЕПГУ/МФЦ от юридических лиц.
 */
public class EgpuJuridicalPersonService extends WebServiceGatewaySupport {

    public ChangeOrderInfo epguJuridicalPersonRequest(JuridicalPersonData juridicalPersonData){
        return new ChangeOrderInfo();
    }

    public ChangeOrderInfo epguCancelRequest(String reason){
        return new ChangeOrderInfo();
    }

}
