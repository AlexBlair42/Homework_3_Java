public class Person {
	/**
	 * This is the base class for people in the city.
	 * They all have a name, age, and phone number. It is the super class for Teacher, Kid, and Police.
	 * The appropriate get and set functions are included.
	 * @author Alex Blair
	 * @see
	 */
	protected String name;
	protected int age;
	protected long Phone_num;
	static long prevID = 11111;
	protected long ID;
	
	/**
	 * This is the constructor for a "Person" object. This is the base class for all types of people.
	 * @param n
	 * @param a
	 * @param p
	 */
	public Person(String n, int a, long p)
	{
		name = n;
		age = a;
		Phone_num = p;
		ID = prevID;
		prevID++;
	}
	
	/**
	 * This is the get function for Name.
	 * @return name
	 */
	public String getName(){return name;}
}