
public class Kid extends Person {
	/** 
	 * Kids are a type of person
	 * Kids go to school and eat candy
	 * @author Alex Blair
	 */
	public String FavCandy;
	
	/**
	 * This is a constructor for kid. It creates a "Kid" object with the appropriate paramaters.
	 * @param n
	 * @param a
	 * @param e
	 * @param c
	 */
	public Kid(String n, int a, long e, String c)
	{
		super(n,a,e);
		FavCandy = c;	
	}
	
}