/**
 * GuaranteeDocumentServicePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package rw.minecofin.roneps.hub.service.security;

public interface GuaranteeDocumentServicePortType extends java.rmi.Remote {
    public rw.minecofin.roneps.hub.vo.security.xsd.AdvancePaymentInfoResponse sendAdvancePaymentInformation(rw.minecofin.roneps.hub.vo.security.xsd.AdvancePaymentInfoRequest advancePaymentInfoRequest) throws java.rmi.RemoteException;
    public rw.minecofin.roneps.hub.vo.bank.xsd.TenderInfoResponse getTenderInformation(rw.minecofin.roneps.hub.vo.bank.xsd.TenderInfoRequest tenderInfoRequest) throws java.rmi.RemoteException;
    public rw.minecofin.roneps.hub.vo.security.xsd.BidSecurityInfoResponse sendBidSecurityInformation(rw.minecofin.roneps.hub.vo.security.xsd.BidSecurityInfoRequest bidSecurityInfoRequest) throws java.rmi.RemoteException;
    public rw.minecofin.roneps.hub.vo.bank.xsd.ContractInfoResponse getContractInformation(rw.minecofin.roneps.hub.vo.bank.xsd.ContractInfoRequest contractInfoRequest) throws java.rmi.RemoteException;
    public rw.minecofin.roneps.hub.vo.security.xsd.CreditLineFacilityResponse sendCreditLineFacility(rw.minecofin.roneps.hub.vo.security.xsd.CreditLineFacilityRequest creditLineFacilityRequest) throws java.rmi.RemoteException;
    public rw.minecofin.roneps.hub.vo.security.xsd.PerformanceSecurityInfoResponse sendPerformSecurityInformation(rw.minecofin.roneps.hub.vo.security.xsd.PerformanceSecurityInfoRequest performanceSecurityInfoRequest) throws java.rmi.RemoteException;
}
