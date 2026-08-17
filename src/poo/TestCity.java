package poo;

public class TestCity {

	public static void main(String[] args) {
		City toulouse = new City("Toulouse", "France", 450000);
		City bordeaux = new City("Bordeaux", "France", 270000);
		City lyon = new City("Lyon", "France", 523000);
		City marseille = new City("Marseille", "France", 892000);
		City rabat = new City("Rabat", 577000);
		
		System.out.println("Ex 1.1 ");
		toulouse.displayDetails();
		bordeaux.displayDetails();
		lyon.displayDetails();
		marseille.displayDetails();
		System.out.println();
		
		// city1.population += 20000;
		// Ex1.2 Plus possible car attributs passés en private, il faut passer par accesseurs
		System.out.println("Ex 1.2 ");
		toulouse.setPopulation(toulouse.getPopulation() + 20000);
		toulouse.displayDetails();
		System.out.println();
		
		// Ex1.3 nouveau constructeur avec 2 paramètres
		System.out.println("Ex 1.3 ");
		rabat.displayDetails();
		rabat.setCountry("Maroc");
		rabat.displayDetails();
		System.out.println();
		
		// Ex1.4 Affichage des infos d'une ville sous le format d'une phrase
		System.out.println("Ex 1.4 ");
		toulouse.display();
		System.out.println();
		
		// Ex1.5 
		System.out.println("Ex 1.5 ");
		System.out.println(toulouse);
		System.out.println("Affiche la référence de l'objet");
		System.out.println();
	}

}
