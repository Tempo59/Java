package test1;

import java.io.Serializable;

public class User implements Serializable {
	
	private String name;
	private String pwd;
	
	public User(String name) {
		super();
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof User) {
			User u = (User) obj;
			if(u.name.equals(this.name)) {
				return true;
			}
		}
		return false;
	}
	@Override
	public int hashCode() {
		return name.length();
	}
	public User(String name, String pwd) {
		super();
		this.name = name;
		this.pwd = pwd;
	}
	public User() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	

}
