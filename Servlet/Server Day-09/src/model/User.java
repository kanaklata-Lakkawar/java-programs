package model;

public class User {
private String uname;
private String uemail;
private String upass;
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getUemail() {
	return uemail;
}
public void setUemail(String uemail) {
	this.uemail = uemail;
}
public String getUpass() {
	return upass;
}
public void setUpass(String upass) {
	this.upass = upass;
}
public User() {
	super();
	
}
@Override
public String toString() {
	return "User [uname=" + uname + ", uemail=" + uemail + ", upass=" + upass + "]";
}

}
