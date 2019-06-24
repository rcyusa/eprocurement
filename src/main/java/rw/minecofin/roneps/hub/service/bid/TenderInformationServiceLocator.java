/**
 * TenderInformationServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package rw.minecofin.roneps.hub.service.bid;

public class TenderInformationServiceLocator extends org.apache.axis.client.Service implements rw.minecofin.roneps.hub.service.bid.TenderInformationService {

    public TenderInformationServiceLocator() {
    }


    public TenderInformationServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TenderInformationServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for TenderInformationServiceHttpSoap11Endpoint
    private java.lang.String TenderInformationServiceHttpSoap11Endpoint_address = "http://www.umucyo.gov.rw:8084/roneps-hub/services/TenderInformationService.TenderInformationServiceHttpSoap11Endpoint/";

    public java.lang.String getTenderInformationServiceHttpSoap11EndpointAddress() {
        return TenderInformationServiceHttpSoap11Endpoint_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String TenderInformationServiceHttpSoap11EndpointWSDDServiceName = "TenderInformationServiceHttpSoap11Endpoint";

    public java.lang.String getTenderInformationServiceHttpSoap11EndpointWSDDServiceName() {
        return TenderInformationServiceHttpSoap11EndpointWSDDServiceName;
    }

    public void setTenderInformationServiceHttpSoap11EndpointWSDDServiceName(java.lang.String name) {
        TenderInformationServiceHttpSoap11EndpointWSDDServiceName = name;
    }

    public rw.minecofin.roneps.hub.service.bid.TenderInformationServicePortType getTenderInformationServiceHttpSoap11Endpoint() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(TenderInformationServiceHttpSoap11Endpoint_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTenderInformationServiceHttpSoap11Endpoint(endpoint);
    }

    public rw.minecofin.roneps.hub.service.bid.TenderInformationServicePortType getTenderInformationServiceHttpSoap11Endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            rw.minecofin.roneps.hub.service.bid.TenderInformationServiceSoap11BindingStub _stub = new rw.minecofin.roneps.hub.service.bid.TenderInformationServiceSoap11BindingStub(portAddress, this);
            _stub.setPortName(getTenderInformationServiceHttpSoap11EndpointWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTenderInformationServiceHttpSoap11EndpointEndpointAddress(java.lang.String address) {
        TenderInformationServiceHttpSoap11Endpoint_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (rw.minecofin.roneps.hub.service.bid.TenderInformationServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                rw.minecofin.roneps.hub.service.bid.TenderInformationServiceSoap11BindingStub _stub = new rw.minecofin.roneps.hub.service.bid.TenderInformationServiceSoap11BindingStub(new java.net.URL(TenderInformationServiceHttpSoap11Endpoint_address), this);
                _stub.setPortName(getTenderInformationServiceHttpSoap11EndpointWSDDServiceName());
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
        if ("TenderInformationServiceHttpSoap11Endpoint".equals(inputPortName)) {
            return getTenderInformationServiceHttpSoap11Endpoint();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://bid.service.hub.roneps.minecofin.rw", "TenderInformationService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://bid.service.hub.roneps.minecofin.rw", "TenderInformationServiceHttpSoap11Endpoint"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("TenderInformationServiceHttpSoap11Endpoint".equals(portName)) {
            setTenderInformationServiceHttpSoap11EndpointEndpointAddress(address);
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
