package model;

public class Address {
private String city;
private String state;
private String pin;
public Address() {
	super();
	
}
public Address(String city, String state, String pin) {
	super();
	this.city = city;
	this.state = state;
	this.pin = pin;
}
@Override
public String toString() {
	return "Address [city=" + city + ", state=" + state + ", pin=" + pin + "]";
}

}
