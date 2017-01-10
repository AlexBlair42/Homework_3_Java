import java.util.ArrayList;

public class School extends Building {
	/**
	 * Schools are a sub class of buildings
	 * School occupants are loaded into an array list.
	 * @author Alex Blair
	 */
	ArrayList<Person> Occupancy; 
	// This is an array of the current occupants
	
	
	/**
	 * This is the school constructor for the "School" object. It has the following parameters.
	 * @param n
	 * @param a
	 */
	public School(String n, String a, ArrayList<Person> p) 
	{
		super(n,a);
		Occupancy =p;
	}
	
}