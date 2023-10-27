package model;

public class User {
	
	private int uid;
	private String uname;
	private String uemail;
	private String upass;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
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
	
	public User( String uname, String uemail, String upass) {
		super();
		this.uname = uname;
		this.uemail = uemail;
		this.upass = upass;
	}
	
	
	public User(int uid, String uname, String uemail, String upass) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.uemail = uemail;
		this.upass = upass;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", uemail=" + uemail + ", upass=" + upass + "]";
	}
	
	
	
	
}
