/**
 * CaslServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.webserviceclass;

public interface CaslServiceService extends javax.xml.rpc.Service {
    public java.lang.String getCaslServiceAddress();

    public com.webserviceclass.CaslService getCaslService() throws javax.xml.rpc.ServiceException;

    public com.webserviceclass.CaslService getCaslService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
