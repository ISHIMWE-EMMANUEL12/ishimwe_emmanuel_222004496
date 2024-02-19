package car;

public class car1 {
private String name;
private int age;
private String model;
private String manufacturer;
private String colour;
public car1() {}
public car1(String name, int age, String model, String manufacturer, String colour) {
	super();
	this.name = name;
	this.age = age;
	this.model = model;
	this.manufacturer = manufacturer;
	this.colour = colour;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public String getManufacturer() {
	return manufacturer;
}
public void setManufacturer(String manufacturer) {
	this.manufacturer = manufacturer;
}
public String getColour() {
	return colour;
}
public void setColour(String colour) {
	this.colour = colour;
}

}
