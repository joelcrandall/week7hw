package homework;

public class petClass {

	private String name = "Bogie";
	private int age = 8;
	private String location = "Unknown";
	private String type = "Cat";

	public petClass() {
			
	}
	public petClass(String name, int age, String location, String type) {
		this.name = name;
		this.age = age;
		this.location = location;
		this.type = type;
	}
	
	public String getName() {
		return name; 
	}
	public int getAge() {
		return age; 
	}
	public String getType() {
		return type;
	}
	
	
	public void setName() {
		this.name = name;
	}
	public void setAge() {
		this.age = age;
	}
	public void setLocation() {
		this.location = location;
	}
}
