package car;

public class Registration {
	private int registration_id;
	private int password;
	public Registration() {}
	public Registration(int registration_id, int password) {
		super();
		this.registration_id = registration_id;
		this.password = password;
	}
	public int getRegistration_id() {
		return registration_id;
	}
	public void setRegistration_id(int registration_id) {
		this.registration_id = registration_id;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	
}
	
