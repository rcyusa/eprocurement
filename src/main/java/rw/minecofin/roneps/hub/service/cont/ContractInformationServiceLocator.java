/**
 * ContractInformationServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package rw.minecofin.roneps.hub.service.cont;

public class ContractInformationServiceLocator extends org.apache.axis.client.Service implements rw.minecofin.roneps.hub.service.cont.ContractInformationService {

    public ContractInformationServiceLocator() {
    }


    public ContractInformationServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ContractInformationServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ContractInformationServiceHttpSoap11Endpoint
    private java.lang.String ContractInformationServiceHttpSoap11Endpoint_address = "http://www.umucyo.gov.rw:8084/roneps-hub/services/ContractInformationService.ContractInformationServiceHttpSoap11Endpoint/";

    public java.lang.String getContractInformationServiceHttpSoap11EndpointAddress() {
        return ContractInformationServiceHttpSoap11Endpoint_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ContractInformationServiceHttpSoap11EndpointWSDDServiceName = "ContractInformationServiceHttpSoap11Endpoint";

    public java.lang.String getContractInformationServiceHttpSoap11EndpointWSDDServiceName() {
        return ContractInformationServiceHttpSoap11EndpointWSDDServiceName;
    }

    public void setContractInformationServiceHttpSoap11EndpointWSDDServiceName(java.lang.String name) {
        ContractInformationServiceHttpSoap11EndpointWSDDServiceName = name;
    }

    public rw.minecofin.roneps.hub.service.cont.ContractInformationServicePortType getContractInformationServiceHttpSoap11Endpoint() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ContractInformationServiceHttpSoap11Endpoint_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getContractInformationServiceHttpSoap11Endpoint(endpoint);
    }

    public rw.minecofin.roneps.hub.service.cont.ContractInformationServicePortType getContractInformationServiceHttpSoap11Endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            rw.minecofin.roneps.hub.service.cont.ContractInformationServiceSoap11BindingStub _stub = new rw.minecofin.roneps.hub.service.cont.ContractInformationServiceSoap11BindingStub(portAddress, this);
            _stub.setPortName(getContractInformationServiceHttpSoap11EndpointWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setContractInformationServiceHttpSoap11EndpointEndpointAddress(java.lang.String address) {
        ContractInformationServiceHttpSoap11Endpoint_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (rw.minecofin.roneps.hub.service.cont.ContractInformationServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                rw.minecofin.roneps.hub.service.cont.ContractInformationServiceSoap11BindingStub _stub = new rw.minecofin.roneps.hub.service.cont.ContractInformationServiceSoap11BindingStub(new java.net.URL(ContractInformationServiceHttpSoap11Endpoint_address), this);
                _stub.setPortName(getContractInformationServiceHttpSoap11EndpointWSDDServiceName());
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
        if ("ContractInformationServiceHttpSoap11Endpoint".equals(inputPortName)) {
            return getContractInformationServiceHttpSoap11Endpoint();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://cont.service.hub.roneps.minecofin.rw", "ContractInformationService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://cont.service.hub.roneps.minecofin.rw", "ContractInformationServiceHttpSoap11Endpoint"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ContractInformationServiceHttpSoap11Endpoint".equals(portName)) {
            setContractInformationServiceHttpSoap11EndpointEndpointAddress(address);
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
