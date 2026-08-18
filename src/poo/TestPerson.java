package poo;

/**
 * Classe de test de la classe Person.
 */
public class TestPerson {

    /**
     * Programme principal permettant de tester la création et l'affichage de plusieurs personnes.
     * Crée trois personnes avec différentes informations et affiche leurs données personnelles.
     *
     * @param args arguments de la ligne de commande
     */
	public static void main(String[] args) {
		Person manu = new Person("Macron", "Emmanuel", 43, "Elysee à Paris", new City("Amiens", "France"));
		Person poutine = new Person("Poutine", "Vladimir", 68);
		Person biden = new Person("Biden", "Joe");
		
		// Ex 1.8 et 1.9 : création et affichage des personnes
		System.out.println("Ex 1.8 et 1.9 Création et affichage de Person");
		System.out.println(manu);
		System.out.println(poutine);
		System.out.println(biden);
		System.out.println();
	}

}
