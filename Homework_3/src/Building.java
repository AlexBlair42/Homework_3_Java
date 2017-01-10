public class Building {
	// This is the base class for buildings
	/**
	 * This is the base class for all buildings
	 * Also the appropriate get and set functions are included
	 * @author Alex Blair
	 */
	public String Name;
	public String Address;
	
	/**
	 * Below are the get and set functions.
	 * @return Name
	 * @return Address
	 */
	public String getName(){return Name;}
	public void setName(String Name){this.Name = Name;}
	
	public String getAddress(){return Address;}
	public void setAddress(String Address){this.Address = Address;}


	/**
	 * This is a constructor for buildings
	 * @param n
	 * @param a
	 * n = Name
	 * a = Address
	 */
	public Building(String n, String a)
	{
		Name = n;
		Address = a;
	}
}