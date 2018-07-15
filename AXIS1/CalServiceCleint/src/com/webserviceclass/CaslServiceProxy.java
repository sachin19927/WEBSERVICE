package com.webserviceclass;

public class CaslServiceProxy implements com.webserviceclass.CaslService {
  private String _endpoint = null;
  private com.webserviceclass.CaslService caslService = null;
  
  public CaslServiceProxy() {
    _initCaslServiceProxy();
  }
  
  public CaslServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initCaslServiceProxy();
  }
  
  private void _initCaslServiceProxy() {
    try {
      caslService = (new com.webserviceclass.CaslServiceServiceLocator()).getCaslService();
      if (caslService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)caslService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)caslService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (caslService != null)
      ((javax.xml.rpc.Stub)caslService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.webserviceclass.CaslService getCaslService() {
    if (caslService == null)
      _initCaslServiceProxy();
    return caslService;
  }
  
  public int add(int i, int j) throws java.rmi.RemoteException{
    if (caslService == null)
      _initCaslServiceProxy();
    return caslService.add(i, j);
  }
  
  public int sub(int i, int j) throws java.rmi.RemoteException{
    if (caslService == null)
      _initCaslServiceProxy();
    return caslService.sub(i, j);
  }
  
  
}