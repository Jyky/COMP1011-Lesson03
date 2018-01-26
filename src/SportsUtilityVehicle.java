/**
 * 
 */

/**
 * @author Jovin
 *
 */
public class SportsUtilityVehicle extends Vehicle {

	/**
	 * @param wheels
	 * @param doors
	 * @param colour
	 * @param make
	 * @param model
	 * @param year
	 */
	public SportsUtilityVehicle(String colour,
			String make, String model, String year) {
		super(colour, make, model, year);
		// TODO Auto-generated constructor stub
		this.numDoors = 5;
		
	}

	

	/* (non-Javadoc)
	 * @see Vehicle#accelerate()
	 */
	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		this.speed += 4;
		if(this.speed >= this.MAX_SPEED) {
			this.speed = this.MAX_SPEED;
		}

	}

	/* (non-Javadoc)
	 * @see Vehicle#decelerate()
	 */
	@Override
	public void decelerate() {
		// TODO Auto-generated method stub
		this.speed-=6;
		if(this.speed <0){
			this.speed = 0;

	}

}
}