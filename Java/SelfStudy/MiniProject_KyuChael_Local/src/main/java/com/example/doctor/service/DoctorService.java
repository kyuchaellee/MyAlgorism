package main.java.com.example.doctor.service;

import java.util.List;

import main.java.com.example.doctor.model.DAO.MedicalRecordsDao;
import main.java.com.example.doctor.model.DAO.OperationDAO;
import main.java.com.example.doctor.model.DTO.MedicalRecordsDTO;

public class DoctorService {
	MedicalRecordsDao mrDao = new MedicalRecordsDao();
	OperationDAO opDao = new OperationDAO();
	
	public void checkRecords(String resName) {
		List<MedicalRecordsDTO> mrDTO = mrDao.checkRecords(resName);
		for(int i = 0; i<mrDTO.size();i++) {
			System.out.print(mrDTO.get(i).toString());
		}
	}
	public void writeRecords(String str,String diseaseName) {
		int result = mrDao.writeRecords(str,diseaseName);
		if(result>0) {
			System.out.println("작성 완료");	
		}else {
			System.out.println("에러 ㅈㅈ");
		}
	}
//	public int writePha(Pha p) {
//		
//	}
//	public int writeOperation(Operation op) {
//		
//	}
	public void writePrescribtion(String str, String pha, int period, int day,String doctorName) {
		int result = mrDao.writePrescribtion(str,pha,period,day,doctorName);
		if(result>0) {
			System.out.println("작성 완료");
		}else {
			System.out.println("에러 ㅈㅈ");
		}
		
	}
	
}
