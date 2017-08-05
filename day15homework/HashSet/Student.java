package HashSet;

public class Student {

	public String name;
	public String cardId;
	public Student(String name, String cardId) {
		super();
		this.name = name;
		this.cardId = cardId;
	}
	public Student() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCardId() {
		return cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", cardId=" + cardId + "]";
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Student) {
			Student s=(Student)obj;
			if(this.name.equals(s.name)
					&&this.cardId.equals(s.cardId)) {
				return true;
			}
		}
		return false;
		//return super.equals(obj);
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 1;
	}
	
}
