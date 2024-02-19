package car;

public class reservation {
	private int reservation_id;
	private int customer_id;
	private int parkingslot_id;
	private int start_time;
	private int end_time;
public reservation () {}
public reservation(int reservation_id, int customer_id, int parkingslot_id, int start_time, int end_time) {
	super();
	this.reservation_id = reservation_id;
	this.customer_id = customer_id;
	this.parkingslot_id = parkingslot_id;
	this.start_time = start_time;
	this.end_time = end_time;
}
public int getReservation_id() {
	return reservation_id;
}
public void setReservation_id(int reservation_id) {
	this.reservation_id = reservation_id;
}
public int getCustomer_id() {
	return customer_id;
}
public void setCustomer_id(int customer_id) {
	this.customer_id = customer_id;
}
public int getParkingslot_id() {
	return parkingslot_id;
}
public void setParkingslot_id(int parkingslot_id) {
	this.parkingslot_id = parkingslot_id;
}
public int getStart_time() {
	return start_time;
}
public void setStart_time(int start_time) {
	this.start_time = start_time;
}
public int getEnd_time() {
	return end_time;
}
public void setEnd_time(int end_time) {
	this.end_time = end_time;
}

	

}
