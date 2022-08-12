package DB;

import java.sql.Date;

public class MedicalRecordsDTO {
	private int mr_no;
	private Date mr_date;
	private int patient_id;
	private String cost_id;
	
	public MedicalRecordsDTO(int mr_no, Date mr_date, int patient_id,String cost_id) {
		super();
		this.mr_no = mr_no;
		this.mr_date = mr_date;
		this.patient_id = patient_id;
		this.cost_id = cost_id;
	}
	public int getMr_no() {
		return mr_no;
	}
	public void setMr_no(int mr_no) {
		this.mr_no = mr_no;
	}
	public Date getMr_date() {
		return mr_date;
	}
	public void setMr_date(Date mr_date) {
		this.mr_date = mr_date;
	}
	public int getPatient_id() {
		return patient_id;
	}
	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}
	public String getCost_id() {
		return cost_id;
	}
	public void setCost_id(String cost_id) {
		this.cost_id = cost_id;
	}
	
	
	
}
