package rw.minecofin.roneps.hub.test;

import java.rmi.RemoteException;

import rw.minecofin.roneps.hub.service.security.GuaranteeDocumentServicePortType;
import rw.minecofin.roneps.hub.service.security.GuaranteeDocumentServicePortTypeProxy;
import rw.minecofin.roneps.hub.vo.security.xsd.AdvancePaymentInfo;
import rw.minecofin.roneps.hub.vo.security.xsd.AdvancePaymentInfoRequest;
import rw.minecofin.roneps.hub.vo.security.xsd.AdvancePaymentInfoResponse;
import rw.minecofin.roneps.hub.vo.security.xsd.IssueBankInfo;
import rw.minecofin.roneps.hub.vo.security.xsd.ProcuringEntityInfo;
import rw.minecofin.roneps.hub.vo.security.xsd.SupplierInfo;

public class AdvancePayInformationClientAxis {
	//public static String epr = "http://119.204.69.224:8084/roneps-hub/services/GuaranteeDocumentService";
	//public static String epr = "http://127.0.0.1:8084/roneps-hub/services/GuaranteeDocumentService";
	public static String epr = "http://www.umucyo.gov.rw:8084/roneps-hub/services/GuaranteeDocumentService";
	
	public static void main(String[] args) throws RemoteException {
		
		GuaranteeDocumentServicePortTypeProxy prox = new GuaranteeDocumentServicePortTypeProxy(epr);
		GuaranteeDocumentServicePortType portType = prox.getGuaranteeDocumentServicePortType();
		
		AdvancePaymentInfoRequest request = new AdvancePaymentInfoRequest(); 
		request.setId("SONARWA");
		request.setPassword("SONARWA!03");
        request.setContractNumber("000001/C/CB/2014/2015/1200000000");
        request.setContractName("STUDY OF MAINTENANCE OF ROADS IN THE CITY OF KIGALI");
        request.setContractSerialNumber("00");
        request.setContractDate("11/12/2015");
		
		SupplierInfo supplierInfoVO = getSupplierInfo();
		request.setSupplierInfo(supplierInfoVO);
		
		ProcuringEntityInfo peInfoVO = getPEInfo();
		request.setProcuringEnityInfo(peInfoVO);
		
		IssueBankInfo issueBankInfoVO = getIssueBankInfo();
		request.setIssueBankInfo(issueBankInfoVO);
		
		AdvancePaymentInfo advancePaymentInfo = getAdvancePaymentInfo();
		request.setAdvancePaymentInfo(advancePaymentInfo);
		
		AdvancePaymentInfoResponse response = portType.sendAdvancePaymentInformation(request);
		System.out.println(response.getResultCode());
		System.out.println(response.getResultMessage());
		
	}

	private static SupplierInfo getSupplierInfo(){
		
		SupplierInfo supplierInfoVO = new SupplierInfo();
		supplierInfoVO.setSupplierName("Phoenix of Rwanda Assurance Company s.a");
		supplierInfoVO.setSupplierTINNumber("898822110");
		supplierInfoVO.setSupplierRepresentiveName("Jhon Smith");
		supplierInfoVO.setAddressSupplier("P.O Box 82 Kigali");
		
		return supplierInfoVO;
	}

	private static ProcuringEntityInfo getPEInfo(){
		
		ProcuringEntityInfo PEInfoVO = new ProcuringEntityInfo();
		PEInfoVO.setPEName("Phoenix of Rwanda Assurance Company s.a");
		PEInfoVO.setPETINNumber("334567890");
		PEInfoVO.setChargerNameInPE("Jhon Smith");
		PEInfoVO.setAddressPE("P.O Box 82 Kigali");
		
		return PEInfoVO;
	}
	
	private static IssueBankInfo getIssueBankInfo(){

		IssueBankInfo issueBankInfoVO = new IssueBankInfo();
		issueBankInfoVO.setBankName("Kookmin Bank");
		issueBankInfoVO.setBankTINNumber("342122345");
		issueBankInfoVO.setBankBranchName("Dunsan");
		issueBankInfoVO.setBranchManagerName("Sean Connery");
		issueBankInfoVO.setSecurityRepresentiveName("Jim Parsons");
		issueBankInfoVO.setBranchAddress("Kigali");
		issueBankInfoVO.setComment("This guarantee signed by the Bidder and the performance security issued to you upon the instruction of the Bidder; or (b) if the Bidder isnot the successful bidder, upon the earlier of (i) ourreceipt of a copy of your notification to the Bidder of the name of the successful bidder; of (ii) thrty (30) days after the expiration ofthe Bid validity Period.");
		issueBankInfoVO.setTelNumber("570332");
		issueBankInfoVO.setFaxNumber("570330");
		issueBankInfoVO.setEmail("jparsons@kb.com");
		
		return issueBankInfoVO;
	}
	
	private static AdvancePaymentInfo getAdvancePaymentInfo(){
		
		AdvancePaymentInfo advancePaymentInfoVO = new AdvancePaymentInfo();
		advancePaymentInfoVO.setGuaranteeNumber("PSNO9991920005334212");

		advancePaymentInfoVO.setAccountNumber("");
		advancePaymentInfoVO.setAmountCharacter("Three four character!");
		advancePaymentInfoVO.setAmount("34000000");
		advancePaymentInfoVO.setUnit("RWF");
		advancePaymentInfoVO.setIssueDate("25/12/2015");
		advancePaymentInfoVO.setName("Richard");
		advancePaymentInfoVO.setAddress("Rwanda Kigali");
		advancePaymentInfoVO.setPosition("Director");
		advancePaymentInfoVO.setStartDate("10/01/2016");
		advancePaymentInfoVO.setExpireDate("10/03/2016");
		advancePaymentInfoVO.setStatus("VALID"); //VALID,EXPIRED,TO BE SEIZED,SEIZED
		return advancePaymentInfoVO;
		
	}
}
