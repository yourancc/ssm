package cn.yourancc.entity;

public class User {
	private Long uid;
	private String uname;
	private String upassword;
	
	public User() {};
	
	public User(Long uid, String uname, String upassword) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.upassword = upassword;
	}
	public Long getUid() {
		return uid;
	}
	public void setUid(Long uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpassword() {
		return upassword;
	}
	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}
	
}
