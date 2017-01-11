import java.util.ArrayList;

public class CityHall extends Building {
	// This class will display the array of current occupants
	/**
	 * City Hall is where all of the major functions of running the city go down. 
	 * Police reside in city hall.
	 * This also has an array of occupants.
	 * @author Alex Blair
	 */

	
	/**
	 * Create a constructor with the following parameters.
	 * @param n
	 * @param a
	 * @param p
	 */
	
	public CityHall(String n, String a)
	{
		super(n,a);
		
	}

	private ArrayList<String> occupants = new ArrayList();
	
	public void showOccupants() {
		System.out.println("The Police in City Hall are:");
		for (String j: occupants)
{
	System.out.printf("%s\n",j);
}
		
	}

}