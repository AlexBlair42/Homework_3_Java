import java.util.ArrayList;

public class School extends Building {
	/**
	 * Schools are a sub class of buildings
	 * School occupants are loaded into an array list.
	 * @author Alex Blair
	 */ 
	// This is an array of the current occupants
	
	
	/**
	 * This is the school constructor for the "School" object. It has the following parameters.
	 * @param n
	 * @param a
	 */
	public School(String n, String a) 
	{
		super(n,a);
		
	}
	
	private ArrayList<String> occupants = new ArrayList();
	
	public void showOccupants() {
		System.out.println("The people at the school are:");
		for (String j: occupants)
{
	System.out.printf("%s\n",j);
}
		
	}
	
	public void addEmployee(String Teacher1) {
		if(occupants.contains(Name)){}
		else 
			occupants.add(Name);
		
	}
	
	public void removeEmployee(String Name){
		occupants.remove(Name);
	}
	
}