package soapWebServices;

public class SoapProxy implements soapWebServices.Soap {
  private String _endpoint = null;
  private soapWebServices.Soap soap = null;
  
  public SoapProxy() {
    _initSoapProxy();
  }
  
  public SoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initSoapProxy();
  }
  
  private void _initSoapProxy() {
    try {
      soap = (new soapWebServices.SoapServiceLocator()).getsoap();
      if (soap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)soap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)soap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (soap != null)
      ((javax.xml.rpc.Stub)soap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public soapWebServices.Soap getSoap() {
    if (soap == null)
      _initSoapProxy();
    return soap;
  }
  
  public java.lang.String sayHelloWorld(java.lang.String name) throws java.rmi.RemoteException{
    if (soap == null)
      _initSoapProxy();
    return soap.sayHelloWorld(name);
  }
  
  
}