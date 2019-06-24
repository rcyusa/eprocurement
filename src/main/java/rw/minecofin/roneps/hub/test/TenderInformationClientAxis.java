package rw.minecofin.roneps.hub.test;

import java.rmi.RemoteException;
import rw.minecofin.roneps.hub.service.bid.TenderInformationServicePortType;
import rw.minecofin.roneps.hub.service.bid.TenderInformationServicePortTypeProxy;
import rw.minecofin.roneps.hub.vo.bank.xsd.TenderInfoRequest;
import rw.minecofin.roneps.hub.vo.bank.xsd.TenderInfoResponse;
import rw.minecofin.roneps.hub.vo.bank.xsd.TenderLOTInfo;
import rw.minecofin.roneps.hub.vo.bank.xsd.TenderNotificationInfo;

public class TenderInformationClientAxis {
	public static String epr = "http://www.umucyo.gov.rw:8084/roneps-hub/services/TenderInformationService";
	
	public static void main(String[] args) throws RemoteException {
		TenderInformationServicePortTypeProxy prox = new TenderInformationServicePortTypeProxy(epr);
		TenderInformationServicePortType portType = prox.getTenderInformationServicePortType();
		TenderInfoRequest tenderVo = new TenderInfoRequest();
		tenderVo.setId("SONARWA");
		tenderVo.setPassword("SONARWA!03");
		tenderVo.setTenderRefNumber("000001/G/NCB/2018/2019/RMF");
		tenderVo.setTenderRefName("");
		
		TenderInfoResponse returnVo = portType.getTenderInformation(tenderVo);
		System.out.println(returnVo.getResultCode());
		System.out.println(returnVo.getResultMessage());
		TenderNotificationInfo[] noticeInfo = returnVo.getTenderNotificationInfo();
		int len = noticeInfo.length;
		if(returnVo.getResultCode().equals("0") ){
			for (int i = 0; i < len; i++) {
				System.out.println("================= Tender Information =================");
				System.out.println("Number: "+noticeInfo[i].getTenderRefNumber());
				System.out.println("TenderRefName: "+noticeInfo[i].getTenderRefName());
				System.out.println("OnOff: "+noticeInfo[i].getOnOff());
				System.out.println("PEName: "+noticeInfo[i].getPEName());
				System.out.println("PECode: "+noticeInfo[i].getPECode());
				System.out.println("TenderType: "+noticeInfo[i].getTenderType());
				System.out.println("TenderMethod: "+noticeInfo[i].getTenderMethod());
				System.out.println("PublicDate: "+noticeInfo[i].getPublicDate());
				System.out.println("OpenDate: "+noticeInfo[i].getOpenDate());
				System.out.println("DeadLineDate: "+noticeInfo[i].getDeadLineDate());
				
				TenderLOTInfo[] lotInfo = noticeInfo[i].getTenderLOTInfo();
				System.out.println(lotInfo);
				int size = lotInfo.length;
				System.out.println("LOT size: "+size);
				if(size != 0){
					for (int j = 0; j < size; j++) {
						System.out.println("--------- LOT Information  -------");
						System.out.println("LOT TenderLotNumber: "+lotInfo[j].getTenderLotNumber());
						System.out.println("LOT TenderLotName: "+lotInfo[j].getTenderLotName());
						System.out.println("LOT TenderLotDesc: "+lotInfo[j].getTenderLotDesc());
						System.out.println("LOT Amount: "+lotInfo[j].getAmount());
					}
				}
				System.out.println("==============================================");
			}
		}
	}
}
