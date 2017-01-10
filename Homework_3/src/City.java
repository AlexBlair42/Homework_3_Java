import java.util.ArrayList;


public class City {
/** 
 * @author Alex Blair
 * @version 1.00 1/8/17
 * This is the main function of the city model
 * @param args
 */
	
	
	public static void main(String[] args) {
	// This is the main function for the city
		/**
		 * This is creating a new array list of buildings.
		 */
		ArrayList<Building> buildings = new ArrayList();
		
		/**
		 * This is creating the occupants of the School building.
		 */
		ArrayList<Person> schoolOcc = new ArrayList();
		schoolOcc.add(new Teacher("Mrs. Andrews", 35, 5269632, 5, "Bachelor's"));
		schoolOcc.add(new Kid("Bobby", 10, 2521476, "Twix"));
		schoolOcc.add(new Kid("Sally", 11, 2523639, "Jolly Rancher"));
		schoolOcc.add(new Kid("Butch", 12, 5259636, "Sour Patch Kids"));
		
		/**
		 * This creates a new instance of a School.
		 */
		School elem = new School("Simcity Elementary", "12363 N Sim Rd", schoolOcc);
		buildings.add(elem);
		
		
		/**
		 * This creates the new array list for City Hall, as well as the occupants.
		 */
		ArrayList<Person>CityHallOcc = new ArrayList();
		CityHallOcc.add(new Police("Officer Benson", 35, 5236963, Police.Role.Patrol));
		CityHallOcc.add(new Police("Chief O'Neil", 40, 2523685, Police.Role.Chief));
		CityHallOcc.add(new Police("Captain Ruiz", 22, 6354719, Police.Role.Captain));
		CityHallOcc.add(new Police("Sargent Connors", 25, 4154798, Police.Role.Sargent));
		CityHall CH = new CityHall("Simcity City Hall", "446 NE Raspberry Ln", CityHallOcc);
		buildings.add(CH);
		
		
		/**
		 * This will output the occupants of each building.
		 */
		   System.out.println("Occupancy of Simcity Elementary:");
		    for (Person p: schoolOcc){
		      System.out.println(p.getName());
		    }
		    System.out.println("Occupancy of Simcity City Hall:");
		    for (Person p: CityHallOcc){
		      System.out.println(p.getName());
		    }
		    System.out.println("Buildings in this city of Simcity:");
		    for (Building b: buildings){
		      System.out.println(b.getName());
		    }

		    /**
		     * These loops below will pay the employees of each respective institution.
		     */
		    for (int t=0; t<schoolOcc.size(); t++)
		    {
		      if (schoolOcc.get(t) instanceof Employee)
		        ((Teacher) schoolOcc.get(t)).getPaid(30000);
		    }
		    
		    for (int k=0; k<CityHallOcc.size(); k++)
		    {
		      if (CityHallOcc.get(k) instanceof Employee)
		        ((Police) CityHallOcc.get(k)).getPaid(80000);
		      }
		    }
}