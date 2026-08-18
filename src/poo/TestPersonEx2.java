package poo;

/**
 * Classe de test permettant d'afficher et de filtrer des personnalités.
 */
public class TestPersonEx2 {

    /**
     * Programme principal qui répond aux différentes questions de l'exercice.
     * Crée six personnalités, affiche leurs informations,
     * puis affiche les personnalités nées en France ou habitant à Paris.
     *
     * @param args arguments de la ligne de commande
     */
	public static void main(String[] args) {
		Person manu = new Person("Macron", "Emmanuel", 43, "L'Elysée à Paris", new City("Amiens", "France"));
		Person sarkozy = new Person("Sarkozy", "Nicolas", 66, "Paris", new City("Paris", "France", 2000000));
		Person johnson = new Person("Johnson", "Boris", 56, "Downing streetà London", new City("New York", "Etats-Unis"));
		Person depardieu = new Person("Depardieu", "Gérard", 72, "Moscou", new City("Châteauroux", "France"));
		Person kravitz = new Person("Kravitz", "Lenny", 56, "Hotel particulier à Paris", new City("New York", "USA"));
		Person lawrence = new Person("Lawrence", "Jennifer", 30, "Louisville aux USA", new City("Indians Hills", "USA"));
		
		System.out.println("Ex 2.0 Affichage personnalités nées en France ou habitant Paris");
		System.out.println();
		
		
		// Affichage de toutes les personnalités
		System.out.println("Liste des personnalités");
		manu.displayPersonalities();
		sarkozy.displayPersonalities();
		johnson.displayPersonalities();
		depardieu.displayPersonalities();
		kravitz.displayPersonalities();
		lawrence.displayPersonalities();
		System.out.println("-------------------------");
		
		// Affichage des personnalités nées en France ou habitant à Paris
		System.out.println("Liste après filtre");
		manu.displayFilterPersonalities();
		sarkozy.displayFilterPersonalities();
		johnson.displayFilterPersonalities();
		depardieu.displayFilterPersonalities();
		kravitz.displayFilterPersonalities();
		lawrence.displayFilterPersonalities();
	}

}
