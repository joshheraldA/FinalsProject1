package finalsProject;

public class Chlorphenamine extends Medicine{
	
	/*
	 * constructor of medicine
	 * 
	 * @param {cost} cost of the medicine in php
	 * @param {id} id of the medicine
	 * @param {picture} relative picture path relating to the medicine
	 * @param {name} name of the medicine
	 * @param {symptoms} symptoms of the sickness the medicine is trying to solve
	 */

	public Chlorphenamine(int id, String name, String[] symptoms) {
		super(id, name, symptoms);
		this.setPicture("/images/Chlorphenamine.jpg");	
	}
	
	/*
	 * overloading the Chlorphenamine constructor
	 */
	
	public Chlorphenamine() {
		super(107, "Chlorphenamine", new String[]{
				"Runny Nose", "Uncontrollable Sneezing", "Itchy Watery Eyes", "Itchy Throat"
		});
		this.setPicture("/images/Chlorphenamine.jpg");

	}

}
