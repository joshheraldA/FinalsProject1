package finalsProject;

public class Ibuprofen extends Medicine {
	
	/*
	 * constructor of medicine
	 * 
	 * @param {cost} cost of the medicine
	 * @param {id} id of the medicine
	 * @param {picture} relative picture path relating to the medicine
	 * @param {name} name of the medicine
	 * @param {symptoms} symptoms of the sickness the medicine is trying to solve
	 */
	public Ibuprofen(double cost, int id, String picture, String name, String[] symptoms) {
		super(cost, id, picture, name, symptoms);
	}
	
	/*
	 * overloading the Ibuprofen constructor
	 */
	public Ibuprofen() {
		super(0.0, 100, "Null", "Ibuprofen", new String[3]);
	}
}
