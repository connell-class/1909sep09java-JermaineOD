package re.model;

public class User {

	private int users_id = 0;
	private String username ="";
	private String user_password ="";
	private String last_name = "";
	private String first_name = "";
	private String user_email ="";
	private int role_id =0;
	public int getUsers_id() {
		return users_id;
	}
	public void setUsers_id(int users_id) {
		this.users_id = users_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((first_name == null) ? 0 : first_name.hashCode());
		result = prime * result + ((last_name == null) ? 0 : last_name.hashCode());
		result = prime * result + role_id;
		result = prime * result + ((user_email == null) ? 0 : user_email.hashCode());
		result = prime * result + ((user_password == null) ? 0 : user_password.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		result = prime * result + users_id;
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
		User other = (User) obj;
		if (first_name == null) {
			if (other.first_name != null)
				return false;
		} else if (!first_name.equals(other.first_name))
			return false;
		if (last_name == null) {
			if (other.last_name != null)
				return false;
		} else if (!last_name.equals(other.last_name))
			return false;
		if (role_id != other.role_id)
			return false;
		if (user_email == null) {
			if (other.user_email != null)
				return false;
		} else if (!user_email.equals(other.user_email))
			return false;
		if (user_password == null) {
			if (other.user_password != null)
				return false;
		} else if (!user_password.equals(other.user_password))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		if (users_id != other.users_id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "User   [   users_id=" + users_id + ", username=" + username + ", user_password=" + user_password
				+ ", last_name=" + last_name + ", first_name=" + first_name + ", user_email=" + user_email
				+ ", role_id=" + role_id + "]\n";
	}
	public User(int users_id, String username, String user_password, String last_name, String first_name,
			String user_email, int role_id) {
		
		this.users_id = users_id;
		this.username = username;
		this.user_password = user_password;
		this.last_name = last_name;
		this.first_name = first_name;
		this.user_email = user_email;
		this.role_id = role_id;
	}
	public User() {
		//super();
	}
	
	
	
	
	
	
	
	
}
