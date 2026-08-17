package poo;

public class City {
	
	// Attributs
	private String name;
	private String country;
	private Integer population;
	
	// Constructeur
	public City(String name, String country, Integer population) {
		this.name = name;
		this.country = country; 
		this.population = population;
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
	
	// Méthodes
	public void display() {
		System.out.println(
				"Nom : " + this.name + "\t" + 
				"Pays : " + this.country + "\t" + 
				"Nombre d'habitants : " + this.population);
	}
}
