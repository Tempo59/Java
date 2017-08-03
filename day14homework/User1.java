package day14homework;

public class User1 {
  
	public String name;
	public String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User1(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	public User1() {
		super();
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + "]";
	}
	
}
