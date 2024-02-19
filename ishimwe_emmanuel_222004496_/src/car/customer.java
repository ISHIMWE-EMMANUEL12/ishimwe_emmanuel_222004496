package car;

public class customer{
	

	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	private int customer_id;
	private String name;
	
	private String email;
	private String phone;
	
	public customer() {}
	public customer(int customer_id, String name, String email, String phone) {
		super();
		this.customer_id = customer_id;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

}