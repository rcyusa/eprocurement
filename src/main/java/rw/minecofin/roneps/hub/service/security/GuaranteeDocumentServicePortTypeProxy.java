package rw.minecofin.roneps.hub.service.security;

public class GuaranteeDocumentServicePortTypeProxy implements rw.minecofin.roneps.hub.service.security.GuaranteeDocumentServicePortType {
  private String _endpoint = null;
  private rw.minecofin.roneps.hub.service.security.GuaranteeDocumentServicePortType guaranteeDocumentServicePortType = null;
  
  public GuaranteeDocumentServicePortTypeProxy() {
    _initGuaranteeDocumentServicePortTypeProxy();
  }
  
  public GuaranteeDocumentServicePortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initGuaranteeDocumentServicePortTypeProxy();
  }
  
  private void _initGuaranteeDocumentServicePortTypeProxy() {
    try {
      guaranteeDocumentServicePortType = (new rw.minecofin.roneps.hub.service.security.GuaranteeDocumentServiceLocator()).getGuaranteeDocumentServiceHttpSoap11Endpoint();
      if (guaranteeDocumentServicePortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)guaranteeDocumentServicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)guaranteeDocumentServicePortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (guaranteeDocumentServicePortType != null)
      ((javax.xml.rpc.Stub)guaranteeDocumentServicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public rw.minecofin.roneps.hub.service.security.GuaranteeDocumentServicePortType getGuaranteeDocumentServicePortType() {
    if (guaranteeDocumentServicePortType == null)
      _initGuaranteeDocumentServicePortTypeProxy();
    return guaranteeDocumentServicePortType;
  }
  
  public rw.minecofin.roneps.hub.vo.security.xsd.AdvancePaymentInfoResponse sendAdvancePaymentInformation(rw.minecofin.roneps.hub.vo.security.xsd.AdvancePaymentInfoRequest advancePaymentInfoRequest) throws java.rmi.RemoteException{
    if (guaranteeDocumentServicePortType == null)
      _initGuaranteeDocumentServicePortTypeProxy();
    return guaranteeDocumentServicePortType.sendAdvancePaymentInformation(advancePaymentInfoRequest);
  }
  
  public rw.minecofin.roneps.hub.vo.bank.xsd.TenderInfoResponse getTenderInformation(rw.minecofin.roneps.hub.vo.bank.xsd.TenderInfoRequest tenderInfoRequest) throws java.rmi.RemoteException{
    if (guaranteeDocumentServicePortType == null)
      _initGuaranteeDocumentServicePortTypeProxy();
    return guaranteeDocumentServicePortType.getTenderInformation(tenderInfoRequest);
  }
  
  public rw.minecofin.roneps.hub.vo.security.xsd.BidSecurityInfoResponse sendBidSecurityInformation(rw.minecofin.roneps.hub.vo.security.xsd.BidSecurityInfoRequest bidSecurityInfoRequest) throws java.rmi.RemoteException{
    if (guaranteeDocumentServicePortType == null)
      _initGuaranteeDocumentServicePortTypeProxy();
    return guaranteeDocumentServicePortType.sendBidSecurityInformation(bidSecurityInfoRequest);
  }
  
  public rw.minecofin.roneps.hub.vo.bank.xsd.ContractInfoResponse getContractInformation(rw.minecofin.roneps.hub.vo.bank.xsd.ContractInfoRequest contractInfoRequest) throws java.rmi.RemoteException{
    if (guaranteeDocumentServicePortType == null)
      _initGuaranteeDocumentServicePortTypeProxy();
    return guaranteeDocumentServicePortType.getContractInformation(contractInfoRequest);
  }
  
  public rw.minecofin.roneps.hub.vo.security.xsd.CreditLineFacilityResponse sendCreditLineFacility(rw.minecofin.roneps.hub.vo.security.xsd.CreditLineFacilityRequest creditLineFacilityRequest) throws java.rmi.RemoteException{
    if (guaranteeDocumentServicePortType == null)
      _initGuaranteeDocumentServicePortTypeProxy();
    return guaranteeDocumentServicePortType.sendCreditLineFacility(creditLineFacilityRequest);
  }
  
  public rw.minecofin.roneps.hub.vo.security.xsd.PerformanceSecurityInfoResponse sendPerformSecurityInformation(rw.minecofin.roneps.hub.vo.security.xsd.PerformanceSecurityInfoRequest performanceSecurityInfoRequest) throws java.rmi.RemoteException{
    if (guaranteeDocumentServicePortType == null)
      _initGuaranteeDocumentServicePortTypeProxy();
    return guaranteeDocumentServicePortType.sendPerformSecurityInformation(performanceSecurityInfoRequest);
  }
  
  
}