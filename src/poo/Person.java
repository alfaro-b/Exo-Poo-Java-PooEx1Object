package poo;

public class Person {
	// Attributs
		private String name;
		private String firstName;
		private int age;
		private String address;
		private City birthCity;
		
	// Constructeur
	public Person(String name, String firstName, int age, String address, City birthCity) {
		this.name = name;
		this.firstName = firstName; 
		this.age = age;
		this.address = address;
		this.birthCity = birthCity;
	}
	public Person(String name, String firstName, int age) {
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
		return firstName;
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
	public City getBirthCity() {
	    return birthCity;
	}
	public void setBirthCity(City city) {
	    this.birthCity = city;
	}
	
	// Méthodes
	public String toString() {
	    String result = "Person [lastName = " + this.name + ", " +
	            "firstName = " + this.firstName + ", " +
	            "age = " + this.age + ", " +
	            "address = " + this.address + "]";

	    if (this.birthCity != null) {
	        result += " BornCity " + this.birthCity.getDetails();
	    } else {
	    	result += " Bornnull ";
	    }

	    return result;
	}
	
	public void displayPersonalities() {
		System.out.println(
				this.name + ", " + 
				this.firstName + ", " + 
				this.age + "ans, " +
				"habitant " + this.address + ", " +
				this.birthCity.getBirthCityPersonality()
				);
	}
	public void displayFilterPersonalities() {
		if(this.birthCity.getCountry() == "France" || 
				this.address == "Paris") {
			System.out.println(
					this.name + ", " + 
					this.firstName + ", " + 
					this.age + "ans, " +
					"habitant " + this.address + ", " +
					this.birthCity.getBirthCityPersonality()
					);
		}
		
	}
}
