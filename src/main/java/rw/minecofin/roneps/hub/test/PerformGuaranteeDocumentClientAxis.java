package rw.minecofin.roneps.hub.test;

import java.rmi.RemoteException;

import rw.minecofin.roneps.hub.service.security.GuaranteeDocumentServicePortType;
import rw.minecofin.roneps.hub.service.security.GuaranteeDocumentServicePortTypeProxy;
import rw.minecofin.roneps.hub.vo.security.xsd.ContractInfo;
import rw.minecofin.roneps.hub.vo.security.xsd.IssueBankInfo;
import rw.minecofin.roneps.hub.vo.security.xsd.LOTInfo;
import rw.minecofin.roneps.hub.vo.security.xsd.PerformanceSecurityInfo;
import rw.minecofin.roneps.hub.vo.security.xsd.PerformanceSecurityInfoRequest;
import rw.minecofin.roneps.hub.vo.security.xsd.PerformanceSecurityInfoResponse;

public class PerformGuaranteeDocumentClientAxis {
	public static String epr = "http://www.umucyo.gov.rw:8084/roneps-hub/services/GuaranteeDocumentService";
	
	public static void main(String[] args) throws RemoteException {
		
		GuaranteeDocumentServicePortTypeProxy prox = new GuaranteeDocumentServicePortTypeProxy(epr);
		GuaranteeDocumentServicePortType portType = prox.getGuaranteeDocumentServicePortType();
		
		PerformanceSecurityInfoRequest request = new PerformanceSecurityInfoRequest(); 
		request.setId("SONARWA");
		request.setPassword("SONARWA!03");

		ContractInfo contractInfoVO = getContractInfo();
		request.setContractInfo(contractInfoVO);
		
		IssueBankInfo issueBankInfoVO = getIssueBankInfo();
		request.setIssueBankInfo(issueBankInfoVO);
		
		PerformanceSecurityInfo performanceSecurityInfoVO = getPerformanceSecurityInfo();
		request.setPerformanceSecurityInfo(performanceSecurityInfoVO);
		
		PerformanceSecurityInfoResponse response = portType.sendPerformSecurityInformation(request);
		System.out.println(response.getResultCode());
		System.out.println(response.getResultMessage());
		
		
	}

	private static ContractInfo getContractInfo(){
		
		ContractInfo contractInfoVO = new ContractInfo();
		contractInfoVO.setContractName("Location Salle de Reunions, Formation et l'Accueil des Visiteurs de la Province du Nord");
		contractInfoVO.setContractNumber("000003/NC/NCB/2018/2019/2310000000");
		contractInfoVO.setContractSerialNumber("0");
		contractInfoVO.setContractDate("04102018");
		contractInfoVO.setPEName("NORTHERN PROVINCE");
		contractInfoVO.setPETINNumber("101822442");
		contractInfoVO.setSupplierName("DIAN FOSSEY HOTEL NYIRAMACIBIRI LTD");
		contractInfoVO.setSupplierTINNumber("103051958");
		contractInfoVO.setAddress("RUBAVU");
		contractInfoVO.setEMailAddress("dianfosseyhotel@yahoo.com");
		contractInfoVO.setTenderRefName("Location Salle de Reunions, Formation et l'Accueil des Visiteurs de la Province du Nord");
		contractInfoVO.setTenderRefNumber("000003/NC/NCB/2018/2019/2310000000");
		contractInfoVO.setCellPhoneNumber("0788305511");
		
		LOTInfo[] lotInfo = new LOTInfo[3];
		for (int i = 0; i < lotInfo.length; i++) {
			LOTInfo lotInfoVo = new LOTInfo();
			lotInfoVo.setLotName("Location Salle de reunion et Accueil des visiteurs de la Province du Nord");
			lotInfoVo.setLotNumber(""+1);
			lotInfo[i] = lotInfoVo;
			
		}
		
		contractInfoVO.setLotInfo(lotInfo);	
		
		return contractInfoVO;
	}
	
	
	private static IssueBankInfo getIssueBankInfo(){

		IssueBankInfo issueBankInfoVO = new IssueBankInfo();
		issueBankInfoVO.setBankName("SONARWA GI");
		issueBankInfoVO.setBankTINNumber("102294535");
		issueBankInfoVO.setBankBranchName("HEAD OFFICE");
		issueBankInfoVO.setBranchManagerName("RUGAMBA PATRICK");
		issueBankInfoVO.setBranchAddress("NYARUGENGE");
		issueBankInfoVO.setSecurityRepresentiveName("NIYIGENA JEAN PAUL");
		issueBankInfoVO.setComment("DONE BY SONARWA GI");
		issueBankInfoVO.setTelNumber("0788511728");
		issueBankInfoVO.setFaxNumber("25072052");
		issueBankInfoVO.setEmail("infos@sonarwa.co.rw");
		
		return issueBankInfoVO;
	}
	
	private static PerformanceSecurityInfo getPerformanceSecurityInfo(){
		
		PerformanceSecurityInfo performanceSecurityInfoVO = new PerformanceSecurityInfo();
		performanceSecurityInfoVO.setSecurityNumber("N016038");
		performanceSecurityInfoVO.setSecurityName("Performance Security");
		performanceSecurityInfoVO.setAmountCharacter("two million five hundred eighty-two thousand nine hundred");
		performanceSecurityInfoVO.setAmount("2582900");
		performanceSecurityInfoVO.setUnit("RWF");
		performanceSecurityInfoVO.setStartDate("01102018");
		performanceSecurityInfoVO.setExpireDate("30092019");
		
		return performanceSecurityInfoVO;
		
	}
}
