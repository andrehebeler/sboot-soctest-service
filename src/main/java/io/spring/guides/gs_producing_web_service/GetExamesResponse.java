//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.06.02 às 02:25:20 PM BRT 
//


package io.spring.guides.gs_producing_web_service;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="exame" type="{http://spring.io/guides/gs-producing-web-service}exame"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "exame"
})
@XmlRootElement(name = "getExamesResponse")
public class GetExamesResponse {

    @XmlElement(required = true)
    protected List<Exame> exames;

    /**
     * Obtém o valor da propriedade exame.
     * 
     * @return
     *     possible object is
     *     {@link Exame }
     *     
     */
    public List<Exame> getExames() {
        return exames;
    }

    /**
     * Define o valor da propriedade exame.
     * 
     * @param value
     *     allowed object is
     *     {@link Exame }
     *     
     */
    public void setExames(List<Exame> values) {
        this.exames = values;
    }

}
