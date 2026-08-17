package poo;

public class Person {
	// Attributs
		private String name;
		private String firstName;
		private Integer age;
		private String address;
		
	// Constructeur
	public Person(String name, String firstName, Integer age, String address) {
		this.name = name;
		this.firstName = firstName; 
		this.age = age;
		this.address = address;
	}
	public Person(String name, String firstName, Integer age) {
		this.name = name;
		this.firstName = firstName; 
		this.age = age;
		this.address = "unknown";
	}
	public Person(String name, String firstName) {
		this.name = name;
		this.firstName = firstName; 
		this.age = 0;
		this.address = "unknown";
	}
		
	// Accesseurs
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFirstName() {
		return name;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	// Méthodes
	public String toString() {
		return "Person [lastname = " + this.name + ", " + 
				"firstName = " + this.firstName + ", " + 
				"age = " + this.age + ", " +
				"address : " + this.address + "] " ;
	
	}
	
}
