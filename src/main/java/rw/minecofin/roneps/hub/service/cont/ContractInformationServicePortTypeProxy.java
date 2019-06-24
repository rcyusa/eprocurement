package rw.minecofin.roneps.hub.service.cont;

public class ContractInformationServicePortTypeProxy implements rw.minecofin.roneps.hub.service.cont.ContractInformationServicePortType {
  private String _endpoint = null;
  private rw.minecofin.roneps.hub.service.cont.ContractInformationServicePortType contractInformationServicePortType = null;
  
  public ContractInformationServicePortTypeProxy() {
    _initContractInformationServicePortTypeProxy();
  }
  
  public ContractInformationServicePortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initContractInformationServicePortTypeProxy();
  }
  
  private void _initContractInformationServicePortTypeProxy() {
    try {
      contractInformationServicePortType = (new rw.minecofin.roneps.hub.service.cont.ContractInformationServiceLocator()).getContractInformationServiceHttpSoap11Endpoint();
      if (contractInformationServicePortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)contractInformationServicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)contractInformationServicePortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (contractInformationServicePortType != null)
      ((javax.xml.rpc.Stub)contractInformationServicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public rw.minecofin.roneps.hub.service.cont.ContractInformationServicePortType getContractInformationServicePortType() {
    if (contractInformationServicePortType == null)
      _initContractInformationServicePortTypeProxy();
    return contractInformationServicePortType;
  }
  
  public rw.minecofin.roneps.hub.vo.bank.xsd.ContractInfoResponse getContractInformation(rw.minecofin.roneps.hub.vo.bank.xsd.ContractInfoRequest contractInfoRequest) throws java.rmi.RemoteException{
    if (contractInformationServicePortType == null)
      _initContractInformationServicePortTypeProxy();
    return contractInformationServicePortType.getContractInformation(contractInfoRequest);
  }
  
  
}