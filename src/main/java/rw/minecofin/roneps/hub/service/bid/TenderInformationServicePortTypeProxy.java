package rw.minecofin.roneps.hub.service.bid;

public class TenderInformationServicePortTypeProxy implements rw.minecofin.roneps.hub.service.bid.TenderInformationServicePortType {
  private String _endpoint = null;
  private rw.minecofin.roneps.hub.service.bid.TenderInformationServicePortType tenderInformationServicePortType = null;
  
  public TenderInformationServicePortTypeProxy() {
    _initTenderInformationServicePortTypeProxy();
  }
  
  public TenderInformationServicePortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initTenderInformationServicePortTypeProxy();
  }
  
  private void _initTenderInformationServicePortTypeProxy() {
    try {
      tenderInformationServicePortType = (new rw.minecofin.roneps.hub.service.bid.TenderInformationServiceLocator()).getTenderInformationServiceHttpSoap11Endpoint();
      if (tenderInformationServicePortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)tenderInformationServicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)tenderInformationServicePortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (tenderInformationServicePortType != null)
      ((javax.xml.rpc.Stub)tenderInformationServicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public rw.minecofin.roneps.hub.service.bid.TenderInformationServicePortType getTenderInformationServicePortType() {
    if (tenderInformationServicePortType == null)
      _initTenderInformationServicePortTypeProxy();
    return tenderInformationServicePortType;
  }
  
  public rw.minecofin.roneps.hub.vo.bank.xsd.TenderInfoResponse getTenderInformation(rw.minecofin.roneps.hub.vo.bank.xsd.TenderInfoRequest tenderInfoRequest) throws java.rmi.RemoteException{
    if (tenderInformationServicePortType == null)
      _initTenderInformationServicePortTypeProxy();
    return tenderInformationServicePortType.getTenderInformation(tenderInfoRequest);
  }
  
  
}