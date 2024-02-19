package car;

public class parkinglot {
	
	private int parkinglot_id;
	private String name;
	private String address;
	private int capacity;
public parkinglot() {}
	public parkinglot(int parkinglot_id, String name, String address, int capacity) {
		super();
		this.parkinglot_id = parkinglot_id;
		this.name = name;
		this.address = address;
		this.capacity = capacity;
	}
	public int getParkinglot_id() {
		return parkinglot_id;
	}
	public void setParkinglot_id(int parkinglot_id) {
		this.parkinglot_id = parkinglot_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	

}
