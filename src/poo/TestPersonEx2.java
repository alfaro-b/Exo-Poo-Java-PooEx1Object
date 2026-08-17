package poo;

public class TestPersonEx2 {

	public static void main(String[] args) {
		Person manu = new Person("Macron", "Emmanuel", 43, "L'Elysée à Paris", new City("Amiens", "France"));
		Person sarkozy = new Person("Sarkozy", "Nicolas", 66, "Paris", new City("Paris", "France", 2000000));
		Person johnson = new Person("Johnson", "Boris", 56, "Downing streetà London", new City("New York", "Etats-Unis"));
		Person depardieu = new Person("Depardieu", "Gérard", 72, "Moscou", new City("Châteauroux", "France"));
		Person kravitz = new Person("Kravitz", "Lenny", 56, "Hotel particulier à Paris", new City("New York", "USA"));
		Person lawrence = new Person("Lawrence", "Jennifer", 30, "Louisville aux USA", new City("Indians Hills", "USA"));
		
		System.out.println("Ex 2.0 Affichage personnalités nées en France ou habitants Paris");
		System.out.println("Liste des personnalités");
		manu.displayPersonalities();
		sarkozy.displayPersonalities();
		johnson.displayPersonalities();
		depardieu.displayPersonalities();
		kravitz.displayPersonalities();
		lawrence.displayPersonalities();
		System.out.println();
		
		System.out.println("Liste après filtre");
		manu.displayFilterPersonalities();
		sarkozy.displayFilterPersonalities();
		johnson.displayFilterPersonalities();
		depardieu.displayFilterPersonalities();
		kravitz.displayFilterPersonalities();
		lawrence.displayFilterPersonalities();
	}

}
