//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.06.02 às 02:25:20 PM BRT 
//


package io.spring.guides.gs_producing_web_service;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.spring.guides.gs_producing_web_service package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.spring.guides.gs_producing_web_service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetExamesResponse }
     * 
     */
    public GetExamesResponse createGetExamesResponse() {
        return new GetExamesResponse();
    }

    /**
     * Create an instance of {@link Exame }
     * 
     */
    public List<Exame> createExames() {
        return new ArrayList<Exame>();
    }

    /**
     * Create an instance of {@link GetExamesRequest }
     * 
     */
    public GetExamesRequest createGetExamesRequest() {
        return new GetExamesRequest();
    }

}
