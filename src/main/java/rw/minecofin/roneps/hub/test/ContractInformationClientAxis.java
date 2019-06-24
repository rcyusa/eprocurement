package rw.minecofin.roneps.hub.test;


import rw.minecofin.roneps.hub.service.cont.ContractInformationServicePortType;
import rw.minecofin.roneps.hub.service.cont.ContractInformationServicePortTypeProxy;
import rw.minecofin.roneps.hub.vo.bank.xsd.ContractInfo;
import rw.minecofin.roneps.hub.vo.bank.xsd.ContractInfoRequest;
import rw.minecofin.roneps.hub.vo.bank.xsd.ContractInfoResponse;
import rw.minecofin.roneps.hub.vo.bank.xsd.LOTInfo;

public class ContractInformationClientAxis {

	public static String epr = "http://www.umucyo.gov.rw:8084/roneps-hub/services/ContractInformationService";
	
	public static void main(String[] args) throws Exception {
		ContractInformationServicePortTypeProxy prox = new ContractInformationServicePortTypeProxy(epr);
		ContractInformationServicePortType portType = prox.getContractInformationServicePortType();
		
		ContractInfoRequest contractRequest = new ContractInfoRequest();
		contractRequest.setId("SONARWA");
		contractRequest.setPassword("SONARWA!03");
		contractRequest.setContractNumber("M00002/W/ICB/2018/KRH");
		contractRequest.setContractName("");
		contractRequest.setContractSerialNumber("6");
		
		ContractInfoResponse response = portType.getContractInformation(contractRequest);
		System.out.println(response.getResultCode());
		System.out.println(response.getResultMessage());
		if(response.getResultCode().equals("0") ){
			ContractInfo[] contractInfo = response.getContractInfo();
			int size = contractInfo.length;
			for (int i = 0; i < size; i++) {
				System.out.println("============= Contract Information =============");
				System.out.println(contractInfo[i].getContractName());
				System.out.println(contractInfo[i].getContractNumber());
				System.out.println(contractInfo[i].getContractSerialNumber());
				System.out.println(contractInfo[i].getContractAmount());
				System.out.println(contractInfo[i].getContractAmountCharacter());
				System.out.println(contractInfo[i].getCurrency());
				System.out.println(contractInfo[i].getTotalTaxeAmount());
				System.out.println(contractInfo[i].getTotalTaxeAmountCharacter());
				System.out.println(contractInfo[i].getVatAmount());
				System.out.println(contractInfo[i].getVatRate());
				System.out.println("------ Warrant Amount -------");
				System.out.println(contractInfo[i].getWhtAmount());
				System.out.println("------ Warrant Rate -------");
				System.out.println(contractInfo[i].getWhtRate());
				System.out.println(contractInfo[i].getContractDurationYear());
				System.out.println(contractInfo[i].getContractDurationMonth());
				System.out.println(contractInfo[i].getContractDurationDay());
				System.out.println(contractInfo[i].getContractDate());
				System.out.println(contractInfo[i].getEffectiveDate());
				System.out.println(contractInfo[i].getWarantyYear());
				System.out.println(contractInfo[i].getWarantyMonth());
				System.out.println(contractInfo[i].getPenaltyDelayRate());
				System.out.println(contractInfo[i].getPenaltyLimitRate());
				System.out.println(contractInfo[i].getContractManagerName());
				System.out.println(contractInfo[i].getContractManagerPosition());
				System.out.println(contractInfo[i].getSupervisingFirm());
				System.out.println("------ PE Info -------");
				System.out.println(contractInfo[i].getPETINNumber());
				System.out.println(contractInfo[i].getPEName());
				System.out.println(contractInfo[i].getPERepresentativeName());
				System.out.println(contractInfo[i].getPETELNumber());
				System.out.println(contractInfo[i].getPEAddress());
				System.out.println(contractInfo[i].getTenderRefNumber());
				System.out.println("------ supplier Info -------");
				System.out.println(contractInfo[i].getSupplierName());
				System.out.println(contractInfo[i].getSupplierTINNumber());
				System.out.println(contractInfo[i].getAddress());
				System.out.println(contractInfo[i].getPoBox());
				System.out.println(contractInfo[i].getCellPhoneNumber());
				System.out.println(contractInfo[i].getTelNumber());
				System.out.println(contractInfo[i].getEMailAddress());
				
				System.out.println("------- LOT Info -----");
				LOTInfo[] lotInfo = contractInfo[i].getLotInfo();
				for (int j = 0; j < lotInfo.length; j++) {
					System.out.println("LOT Name ["+j+"]"+lotInfo[j].getLotName());
					System.out.println("LOT Number["+j+"]"+lotInfo[j].getLotNumber());
					System.out.println("LOT Amt["+j+"]"+lotInfo[j].getLotAmount());
				}
			}
		}
	}
}
