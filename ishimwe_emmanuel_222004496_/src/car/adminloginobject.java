package car;

public class adminloginobject {
	private int email;
	private int password;
	public adminloginobject() {}
	public adminloginobject(int email, int password) {
		super();
		this.email = email;
		this.password = password;
	}
	public int getemail() {
		return email;
	}
	public void setemail(int email) {
		this.email= email;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	
}
	



