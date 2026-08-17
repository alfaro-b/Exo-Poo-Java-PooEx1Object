package poo;

public class City {
	
	// Attributs
	private String name;
	private String country;
	private Integer population;
	private static int counter = 0;
	
	// Constructeur
	public City(String name, String country, Integer population) {
		this.name = name;
		this.country = country; 
		this.population = population;
		counter++;
	}
	public City(String name, Integer population) {
		this.name = name;
		this.country = "unknown"; 
		this.population = population;
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
	public Integer getPopulation() {
		return population;
	}
	public void setPopulation(Integer population) {
		this.population = population;
	}
	public static Integer getCounter() {
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
	
	
}
