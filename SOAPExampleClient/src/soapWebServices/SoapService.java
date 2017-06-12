/**
 * SoapService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soapWebServices;

public interface SoapService extends javax.xml.rpc.Service {
    public java.lang.String getsoapAddress();

    public soapWebServices.Soap getsoap() throws javax.xml.rpc.ServiceException;

    public soapWebServices.Soap getsoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
