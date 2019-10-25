package ProjectOneModel;

public class Reimbursement {
	private double amount;

	private int userId,Status_id, rid, resolver, type; // pull from user login of creator
	

	private String firstname, lastname, Adate, Rdate, discription, status;

	public Reimbursement() {
		
	}
	
	
public Reimbursement(double amount, int userId, String discription, int type) {
		
		this.amount = amount;
		this.userId = userId;
		this.discription = discription;
		this.Status_id = 1;
		this.type = type;
	}
	

	public Reimbursement(String firstname, String lastname, int rid, double amount, String Adate, String Rdate,
			int resolver, String discription, String status, int type) {
		// TODO Auto-generated constructor stub
		this.amount = amount;
		this.rid = rid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.Adate = Adate;
		this.Rdate = Rdate;
		this.discription = discription;
		this.status = status;
		this.resolver = resolver;
		this.type = type;
	}

	
	
	

	public int getStatus_id() {
		return Status_id;
	}

	public void setStatus_id(int status_id) {
		Status_id = status_id;
	}
	
	@Override
	public String toString() {
		return "Reimbursement [amount=" + amount + ", userId=" + userId + ", rid=" + rid + ", firstname=" + firstname
				+ ", lastname=" + lastname + ", Adate=" + Adate + ", Rdate=" + Rdate + ", discription=" + discription
				+ ", status=" + status + ", resolver=" + resolver + ", type=" + type + "]";
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAdate() {
		return Adate;
	}

	public void setAdate(String adate) {
		Adate = adate;
	}

	public String getRdate() {
		return Rdate;
	}

	public void setRdate(String rdate) {
		Rdate = rdate;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getResolver() {
		return resolver;
	}

	public void setResolver(int resolver) {
		this.resolver = resolver;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

//constructors

//getters and setters

}
