package finalsProject;

public class Cetirizine extends Medicine {
	
	
	/*
	 * constructor of medicine
	 * 
	 * @param {cost} cost of the medicine in php
	 * @param {id} id of the medicine
	 * @param {picture} relative picture path relating to the medicine
	 * @param {name} name of the medicine
	 * @param {symptoms} symptoms of the sickness the medicine is trying to solve
	 */
	
	
	public Cetirizine(int id, String name, String[] symptoms) {
		super(id, name, symptoms);
		this.setPicture("/images/Cetirizine.jpg");
	}
	
	/*
	 * overloading the Cetirizine constructor
	 */
	
	public Cetirizine() {
		super(105, "Cetirizine", new String[]{
				"Runny Nose", "Uncontrollable Sneezing", "Itchy Watery Eyes", "Skin Itching"
		});
		this.setPicture("/images/Cetirizine.jpg");

	}
	
	

}
