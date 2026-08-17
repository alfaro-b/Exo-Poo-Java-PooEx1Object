package poo;

public class TestCity {

	public static void main(String[] args) {
		City city1 = new City("Toulouse", "France", 450000);
		City city2 = new City("Bordeaux", "France", 270000);
		City city3 = new City("Lyon", "France", 523000);
		City city4 = new City("Marseille", "France", 892000);
		
		city1.display();
		city2.display();
		city3.display();
		city4.display();
		
		System.out.println();
		
		city1.population += 20000;
		city1.display();
	}

}
