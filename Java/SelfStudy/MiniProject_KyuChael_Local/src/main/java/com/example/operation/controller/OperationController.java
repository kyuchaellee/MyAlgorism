package main.java.com.example.operation.controller;

import java.util.ArrayList;
import java.util.List;

import main.java.com.example.operation.model.DTO.OperationDTO;
import main.java.com.example.operation.service.OperationService;

public class OperationController {
	private final OperationService OperationService = new OperationService();
	
//	public void searchRecords(String resNo) {
//		doctorService.checkRecords(resNo);
//	}

	public int writeOp(String day, String uniqueness, String op_name, String doctorName, String patientName) {
		int result = OperationService.writeOp(day,uniqueness,op_name,doctorName,patientName);
		return result;
	}

	public void searchOp(String patientName) {
		
		OperationService.searchOp(patientName);
	}

	public void updateOp(String patientName, String date,String newDate) {
		OperationService.updateOp(patientName,date,newDate);
		
	}

	public void deletOp(String patientName, String date) {
		OperationService.deleteOp(patientName,date);
	}
}
