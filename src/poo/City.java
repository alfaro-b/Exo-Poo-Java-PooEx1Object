package poo;

public class City {
	
	// Attributs
	private String name;
	private String country;
	private int population;
	private static int counter = 0;
	
	// Constructeur
	public City(String name, String country, int population) {
		this.name = name;
		this.country = country; 
		this.population = population;
		counter++;
	}
	public City(String name, int population) {
		this.name = name;
		this.country = "unknown"; 
		this.population = population;
		counter++;
	}
	public City(String name, String country) {
		this.name = name;
		this.country = country; 
		this.population = 0;
		counter++;
	}
	
	// Accesseurs
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	public static int getCounter() {
		return counter;
	}

	
	// Méthodes
	public void displayDetails() {
		System.out.println(
				"[Ville : " + this.name + "] " + 
				"[Pays : " + this.country + "] " + 
				"[Nombre d'habitants : " + this.population + "] " );
	}
	public void display() {
		System.out.println(
				"Ville de " + this.name + 
				" en " + this.country + 
				" ayant " + this.population + " habitants " );
	}
	public String toString() {
		return "Ville de " + this.name + 
				" en " + this.country + 
				" ayant " + this.population + " habitants ";
	}
	public String getDetails() {
	    return "[name = " + this.name + ", " +
	           "state = " + this.country + ", " +
	           "NbInhabitants = " + this.population + "]";
	}
	
}
