package poo;

public class City {
	
	// Attributs
	public String name;
	public String country;
	public Integer population;
	
	// Constructeur
	public City(String name, String country, Integer population) {
		this.name = name;
		this.country = country; 
		this.population = population;
	}
	
	// Méthodes
	public void display() {
		System.out.println(
				"Nom : " + this.name + "\t" + 
				"Pays : " + this.country + "\t" + 
				"Nombre d'habitants : " + this.population);
	}
}
