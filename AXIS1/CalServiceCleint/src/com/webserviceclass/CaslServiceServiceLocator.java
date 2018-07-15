/**
 * CaslServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.webserviceclass;

public class CaslServiceServiceLocator extends org.apache.axis.client.Service implements com.webserviceclass.CaslServiceService {

    public CaslServiceServiceLocator() {
    }


    public CaslServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CaslServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CaslService
    private java.lang.String CaslService_address = "http://localhost:8081/CalCalutionService/services/CaslService";

    public java.lang.String getCaslServiceAddress() {
        return CaslService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CaslServiceWSDDServiceName = "CaslService";

    public java.lang.String getCaslServiceWSDDServiceName() {
        return CaslServiceWSDDServiceName;
    }

    public void setCaslServiceWSDDServiceName(java.lang.String name) {
        CaslServiceWSDDServiceName = name;
    }

    public com.webserviceclass.CaslService getCaslService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CaslService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCaslService(endpoint);
    }

    public com.webserviceclass.CaslService getCaslService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.webserviceclass.CaslServiceSoapBindingStub _stub = new com.webserviceclass.CaslServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getCaslServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCaslServiceEndpointAddress(java.lang.String address) {
        CaslService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.webserviceclass.CaslService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.webserviceclass.CaslServiceSoapBindingStub _stub = new com.webserviceclass.CaslServiceSoapBindingStub(new java.net.URL(CaslService_address), this);
                _stub.setPortName(getCaslServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CaslService".equals(inputPortName)) {
            return getCaslService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webserviceclass.com", "CaslServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webserviceclass.com", "CaslService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CaslService".equals(portName)) {
            setCaslServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
