package finalsProject;

public class Oxymetazoline extends Medicine {
	
	
	/*
	 * constructor of medicine
	 * 
	 * @param {cost} cost of the medicine in php
	 * @param {id} id of the medicine
	 * @param {picture} relative picture path relating to the medicine
	 * @param {name} name of the medicine
	 * @param {symptoms} symptoms of the sickness the medicine is trying to solve
	 */
	
	
	public Oxymetazoline(int id, String name, String[] symptoms) {
		super(id, name, symptoms);
		this.setPicture("/images/oxymetazoline.png");
	}
	
	/*
	 * overloading the Oxymetazoline constructor
	 */
	
	public Oxymetazoline() {
		super(110, "Oxymetazoline", new String[]{
				"Nasal Congestion", "Sinus Pressure", "Swollen Nasal Passage", "Ear Congestion"
		});
		this.setPicture("/images/oxymetazoline.png");

	}
	
	

}
