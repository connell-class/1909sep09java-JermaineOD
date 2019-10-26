package re.model;

public class Reimbursement {
	
	private int re_id;
	private int re_amount;
	private String re_submit;
	private String re_resolve;
	private int re_receipt;
	private String re_info;
	private int re_creator;
	private int re_resolver;
	private int status_id;
	private int type_id;
	public int getRe_id() {
		return re_id;
	}
	public void setRe_id(int re_id) {
		this.re_id = re_id;
	}
	public int getRe_amount() {
		return re_amount;
	}
	public void setRe_amount(int re_amount) {
		this.re_amount = re_amount;
	}
	public String getRe_submit() {
		return re_submit;
	}
	public void setRe_submit(String re_submit) {
		this.re_submit = re_submit;
	}
	public String getRe_resolve() {
		return re_resolve;
	}
	public void setRe_resolve(String re_resolve) {
		this.re_resolve = re_resolve;
	}
	public int getRe_receipt() {
		return re_receipt;
	}
	public void setRe_receipt(int re_receipt) {
		this.re_receipt = re_receipt;
	}
	public String getRe_info() {
		return re_info;
	}
	public void setRe_info(String re_info) {
		this.re_info = re_info;
	}
	public int getRe_creator() {
		return re_creator;
	}
	public void setRe_creator(int re_creator) {
		this.re_creator = re_creator;
	}
	public int getRe_resolver() {
		return re_resolver;
	}
	public void setRe_resolver(int re_resolver) {
		this.re_resolver = re_resolver;
	}
	public int getStatus_id() {
		return status_id;
	}
	public void setStatus_id(int status_id) {
		this.status_id = status_id;
	}
	public int getType_id() {
		return type_id;
	}
	public void setType_id(int type_id) {
		this.type_id = type_id;
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + re_amount;
		result = prime * result + re_creator;
		result = prime * result + re_id;
		result = prime * result + ((re_info == null) ? 0 : re_info.hashCode());
		result = prime * result + re_receipt;
		result = prime * result + ((re_resolve == null) ? 0 : re_resolve.hashCode());
		result = prime * result + re_resolver;
		result = prime * result + ((re_submit == null) ? 0 : re_submit.hashCode());
		result = prime * result + status_id;
		result = prime * result + type_id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reimbursement other = (Reimbursement) obj;
		if (re_amount != other.re_amount)
			return false;
		if (re_creator != other.re_creator)
			return false;
		if (re_id != other.re_id)
			return false;
		if (re_info == null) {
			if (other.re_info != null)
				return false;
		} else if (!re_info.equals(other.re_info))
			return false;
		if (re_receipt != other.re_receipt)
			return false;
		if (re_resolve == null) {
			if (other.re_resolve != null)
				return false;
		} else if (!re_resolve.equals(other.re_resolve))
			return false;
		if (re_resolver != other.re_resolver)
			return false;
		if (re_submit == null) {
			if (other.re_submit != null)
				return false;
		} else if (!re_submit.equals(other.re_submit))
			return false;
		if (status_id != other.status_id)
			return false;
		if (type_id != other.type_id)
			return false;
		return true;
	}



	
	@Override
	public String toString() {
		return "Reimbursement [re_id=" + re_id + ", re_amount=" + re_amount + ", re_submit=" + re_submit
				+ ", re_resolve=" + re_resolve + ", re_receipt=" + re_receipt + ", re_info=" + re_info + ", re_creator="
				+ re_creator + ", re_resolver=" + re_resolver + ", status_id=" + status_id + ", type_id=" + type_id
				+ "]\n";
	}
	public Reimbursement(int re_id, int re_amount, String re_submit, String re_resolve, int re_receipt,
			String re_info, int re_creator, int re_resolver, int status_id, int type_id) {
		super();
		this.re_id = re_id;
		this.re_amount = re_amount;
		this.re_submit = re_submit;
		this.re_resolve = re_resolve;
		this.re_receipt = re_receipt;
		this.re_info = re_info;
		this.re_creator = re_creator;
		this.re_resolver = re_resolver;
		this.status_id = status_id;
		this.type_id = type_id;
	}
	public Reimbursement(int re_amount, String re_submit, String re_resolve, int re_receipt, String re_info,
			int re_creator, int re_resolver, int status_id, int type_id) {
		super();
		this.re_amount = re_amount;
		this.re_submit = re_submit;
		this.re_resolve = re_resolve;
		this.re_receipt = re_receipt;
		this.re_info = re_info;
		this.re_creator = re_creator;
		this.re_resolver = re_resolver;
		this.status_id = status_id;
		this.type_id = type_id;
	}
	public Reimbursement() {
		super();
	}
	public Reimbursement(int re_amount, String re_submit, int re_receipt, String re_info, int re_creator, int status_id,
			int type_id) {
		super();
		this.re_amount = re_amount;
		this.re_submit = re_submit;
		this.re_receipt = re_receipt;
		this.re_info = re_info;
		this.re_creator = re_creator;
		this.status_id = status_id;
		this.type_id = type_id;
	}
	
	

	
	

}
