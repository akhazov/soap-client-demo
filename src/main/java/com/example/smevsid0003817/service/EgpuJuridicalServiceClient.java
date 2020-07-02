package com.example.smevsid0003817.service;

import com.example.smevsid0003817.wsdl.epgu.EpguPortType;
import com.example.smevsid0003817.wsdl.epgu.EpguService;
import com.example.smevsid0003817.wsdl.rev120315.EpguJuridicalPersonRequestType;
import com.example.smevsid0003817.wsdl.rev120315.EpguResponseType;
import com.example.smevsid0003817.wsdl.rev120315.HeaderType;

/**
 * Сервис приема заявлений с ЕПГУ/МФЦ.
 */
public class EgpuJuridicalServiceClient {

    /**
     * Операция "Прием заявления с ЕПГУ/МФЦ от юридических лиц.
     * @param header Заголовок документа СМЕВ.
     * @param parameters Входные параметры с данными.
     * @return Результат выполнения операции.
     */
    public EpguResponseType epguJuridicalPersonDataRequest(HeaderType header, EpguJuridicalPersonRequestType parameters){
        final EpguService epguService = new EpguService();
        final EpguPortType epguPort = epguService.getEpguPort();

        return epguPort.epguJuridicalPersonRequest(header, parameters);
    }

}
