package student_model;

public class Model {
	private String sId;
	private String sName;
	private String sEmail;
	private String sDob;
	public Model() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Model(String sId, String sName, String sEmail, String sDob) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sEmail = sEmail;
		this.sDob = sDob;
	}
	public String getsId() {
		return sId;
	}
	public void setsId(String sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsEmail() {
		return sEmail;
	}
	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}
	public String getsDob() {
		return sDob;
	}
	public void setsDob(String sDob) {
		this.sDob = sDob;
	}
	
	

}
