package hashSet;

public class Food {
	
	private String name;
	private String place;
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Food) {
			Food f = (Food) obj;
			if(this.name.equals(f.name)
					&&this.place.equals(f.place)) {
				return true;
			}
		}
		return false;
	}
	@Override
	public String toString() {
		return "Food [name=" + name + ", place=" + place + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public Food() {
		super();
	}
	public Food(String name, String place) {
		super();
		this.name = name;
		this.place = place;
	}

}
