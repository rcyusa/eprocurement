package rw.minecofin.roneps.hub.test;

import java.rmi.RemoteException;

import rw.minecofin.roneps.hub.service.security.GuaranteeDocumentServicePortType;
import rw.minecofin.roneps.hub.service.security.GuaranteeDocumentServicePortTypeProxy;
import rw.minecofin.roneps.hub.vo.security.xsd.BidSecurityInfo;
import rw.minecofin.roneps.hub.vo.security.xsd.BidSecurityInfoRequest;
import rw.minecofin.roneps.hub.vo.security.xsd.BidSecurityInfoResponse;
import rw.minecofin.roneps.hub.vo.security.xsd.IssueBankInfo;
import rw.minecofin.roneps.hub.vo.security.xsd.SupplierInfo;
import rw.minecofin.roneps.hub.vo.security.xsd.TenderNotificationInfo;

public class BidGuaranteeDocumentClientAxis {
	public static String epr = "http://www.umucyo.gov.rw:8084/roneps-hub/services/GuaranteeDocumentService";
	
	public static void main(String[] args) throws RemoteException {
		
		GuaranteeDocumentServicePortTypeProxy prox = new GuaranteeDocumentServicePortTypeProxy(epr);
		GuaranteeDocumentServicePortType portType = prox.getGuaranteeDocumentServicePortType();
		
		BidSecurityInfoRequest request = new BidSecurityInfoRequest(); 
		request.setId("SONARWA");
		request.setPassword("SONARWA!03");

		TenderNotificationInfo tenderNotificationInfoVO = getTenderNotificationInfo();
		request.setTenderNotificationInfo(tenderNotificationInfoVO);
		
		SupplierInfo supplierInfoVO = getSupplierInfo();
		request.setSupplierInfo(supplierInfoVO);
		
		IssueBankInfo issueBankInfoVO = getIssueBankInfo();
		request.setIssueBankInfo(issueBankInfoVO);
		
		BidSecurityInfo bidSecurityInfoVO = getBidSecurityInfo();
		request.setBidSecurityInfo(bidSecurityInfoVO);
		
		BidSecurityInfoResponse response = portType.sendBidSecurityInformation(request);
		System.out.println(response.getResultCode());
		System.out.println(response.getResultMessage());
	}

	private static TenderNotificationInfo getTenderNotificationInfo(){
		
		TenderNotificationInfo tenderNotificationInfoVO = new TenderNotificationInfo();
		tenderNotificationInfoVO.setTenderRefName("SUPERVISION OF THE CONSTRUCTION OF GAHIMA GATONDER WATER PIPELINE");
		tenderNotificationInfoVO.setTenderRefNumber("000009/C/NCB/2017/2018/NGOMA DISTRICT");
		tenderNotificationInfoVO.setTenderLotNumber("1");
		tenderNotificationInfoVO.setTenderLotName("SUPERVISION OF THE CONSTRUCTION OF GAHIMA GATONDER WATER PIPELINE");
		
		
		
		return tenderNotificationInfoVO;
	}
	
	private static SupplierInfo getSupplierInfo(){
		
		SupplierInfo supplierInfoVO = new SupplierInfo();
		supplierInfoVO.setSupplierName("QARECAS LTD");
		supplierInfoVO.setSupplierTINNumber("102943976");
		supplierInfoVO.setSupplierRepresentiveName("BILINDA EMMANUEL");
		supplierInfoVO.setAddressSupplier("HUYE");
		
		return supplierInfoVO;
	}
	
	private static IssueBankInfo getIssueBankInfo(){
		
		IssueBankInfo issueBankInfoVO = new IssueBankInfo();
		issueBankInfoVO.setBankName("SONARWA GI");
		issueBankInfoVO.setBankTINNumber("102294535");
		issueBankInfoVO.setBankBranchName("HEAD OFFICE");
		issueBankInfoVO.setBranchManagerName("PROVIDENCE GAHIMA RUDASIGWA");
		issueBankInfoVO.setSecurityRepresentiveName("TWAHIRWA Tony");
		issueBankInfoVO.setComment("This guarantee will expire: (a) if the Bidder is the successful bidder.");
		issueBankInfoVO.setTelNumber("0788511728");
		issueBankInfoVO.setFaxNumber("25072052");
		issueBankInfoVO.setEmail("infos@sonarwa.co.rw");
		issueBankInfoVO.setBranchAddress("NYARUGENGE");
		return issueBankInfoVO;
		
	}
	
	private static BidSecurityInfo getBidSecurityInfo(){
		
		BidSecurityInfo bidSecurityInfoVO = new BidSecurityInfo();
		bidSecurityInfoVO.setSecurityNumber("N016001");
		bidSecurityInfoVO.setSecurityName("Bid Security");
		bidSecurityInfoVO.setAmountCharacter("FOUR HUNDRED THOUSAND");
		bidSecurityInfoVO.setAmount("400000");
		bidSecurityInfoVO.setUnit("RWF");
		bidSecurityInfoVO.setStatus("VALID");
		bidSecurityInfoVO.setStartDate("13082018");
		bidSecurityInfoVO.setExpireDate("12122018");
		
		return bidSecurityInfoVO;
		
	}
}
