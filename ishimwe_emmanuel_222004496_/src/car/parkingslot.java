package car;

public class parkingslot {
	private int parkingslot_id;
	private int parkinglot_id;
	private int slot_number;
	private int size;
	private String status;
public parkingslot() {}
	public parkingslot(int parkingslot_id, int parkinglot_id, int slot_number, int size, String status) {
		super();
		this.parkingslot_id = parkingslot_id;
		this.parkinglot_id = parkinglot_id;
		this.slot_number = slot_number;
		this.size = size;
		this.status = status;
	}
	public int getParkingslot_id() {
		return parkingslot_id;
	}
	public void setParkingslot_id(int parkingslot_id) {
		this.parkingslot_id = parkingslot_id;
	}
	public int getParkinglot_id() {
		return parkinglot_id;
	}
	public void setParkinglot_id(int parkinglot_id) {
		this.parkinglot_id = parkinglot_id;
	}
	public int getSlot_number() {
		return slot_number;
	}
	public void setSlot_number(int slot_number) {
		this.slot_number = slot_number;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

}
