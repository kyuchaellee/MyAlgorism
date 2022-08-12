package DB;
import java.sql.Date;
public class PrescriptionDTO {
	private int pre_no;
	private int pha_no;
	private Date pre_date;
	private int pha_day_dosage;
	private int pha_period;
	private int patient_id;
	private String cost_id;
	
	public PrescriptionDTO(int pre_no, int pha_no, Date pre_date, int pha_day_dosage, int pha_period, int patient_id,
			String cost_id) {
		super();
		this.pre_no = pre_no;
		this.pha_no = pha_no;
		this.pre_date = pre_date;
		this.pha_day_dosage = pha_day_dosage;
		this.pha_period = pha_period;
		this.patient_id = patient_id;
		this.cost_id = cost_id;
	}

	public int getPre_no() {
		return pre_no;
	}

	public void setPre_no(int pre_no) {
		this.pre_no = pre_no;
	}

	public int getPha_no() {
		return pha_no;
	}

	public void setPha_no(int pha_no) {
		this.pha_no = pha_no;
	}

	public Date getPre_date() {
		return pre_date;
	}

	public void setPre_date(Date pre_date) {
		this.pre_date = pre_date;
	}

	public int getPha_day_dosage() {
		return pha_day_dosage;
	}

	public void setPha_day_dosage(int pha_day_dosage) {
		this.pha_day_dosage = pha_day_dosage;
	}

	public int getPha_period() {
		return pha_period;
	}

	public void setPha_period(int pha_period) {
		this.pha_period = pha_period;
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
