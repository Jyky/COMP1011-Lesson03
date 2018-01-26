/**
 * 
 */

/**
 * @author Jovin Yap
 * Program Description: Demo Files for COMP1011 Lesson 03 
 * @version 0.2 - Added vehicle class
 */
public class Project {

	/**
	 * Main Method for project
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SportsUtilityVehicle myHonda = new SportsUtilityVehicle("Black","Honda", "Pilot", "2015");
		Truck myFord = new Truck(6,3,"White","Ford","FX","2008");
		
		
		for(int seconds = 0; seconds <10; seconds++){
			myHonda.accelerate();
			myFord.accelerate();
		}
		System.out.println(myHonda.getSpeed());
		System.out.println(myFord.getSpeed());

	}

}
