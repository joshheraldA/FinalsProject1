package finalsProject;

public class Benadryl extends Medicine {
	/*
	 * constructor of medicine
	 * 
	 * @param {cost} cost of the medicine in php
	 * @param {id} id of the medicine
	 * @param {picture} relative picture path relating to the medicine
	 * @param {name} name of the medicine
	 * @param {symptoms} symptoms of the sickness the medicine is trying to solve
	 */
	public Benadryl(int id, String name, String[] symptoms) {
		super(id, name, symptoms);
		this.setPicture("/images/benadryl.jpeg");
	}
	
	
	/*
	 * overloading the Benadryl constructor
	 */
	
	public Benadryl() {
		super(113, "Benadryl", new String[]{
				"Uncontrollable Sneezing", "Itchy Watery Eyes", "Skin Itching", "Itchy Throat"
		});
		this.setPicture("/images/benadryl.jpeg");

	}
}
