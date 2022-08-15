package main.java.com.example.operation.service;

import java.util.ArrayList;
import java.util.List;

import main.java.com.example.operation.model.DAO.OperationDAO;
import main.java.com.example.operation.model.DTO.OperationDTO;

public class OperationService {
	OperationDAO opDao = new OperationDAO();

	public int writeOp(String day, String uniqueness, String op_name, String doctorName, String patientName) {
		int result = opDao.insertOp(day,uniqueness,op_name,doctorName,patientName);
		return result;
	}

	public void searchOp(String patientName) {
		List<OperationDTO> orr = new ArrayList<>();
		orr = opDao.searchOp(patientName);
		
		for(OperationDTO odto : orr) {
			System.out.println(odto);
		}
		
	}

	public void updateOp(String patientName, String date,String newDate) {
		int result = opDao.updateOp(patientName,date,newDate);
		if(result>0) {
			System.out.println("업데이트 완료");
		}else {
			System.out.println("업데이트 실패");
		}
	}

	public void deleteOp(String patientName, String date) {
		int result = opDao.deleteOp(patientName,date);
		if(result>0) {
			System.out.println("삭제 완료");
		}else {
			System.out.println("삭제 실패");
		}
	}
	
	
}
