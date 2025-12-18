package finalsProject;

public class Phenylephrine extends Medicine {
	
	/*
	 * constructor of medicine
	 * 
	 * @param {cost} cost of the medicine in php
	 * @param {id} id of the medicine
	 * @param {picture} relative picture path relating to the medicine
	 * @param {name} name of the medicine
	 * @param {symptoms} symptoms of the sickness the medicine is trying to solve
	 */
	
	public Phenylephrine(int id, String name, String[] symptoms) {
		super(id, name, symptoms);
		this.setPicture("/images/Phenylephrine.jpg");
	}
	
	/*
	 * overloading the Phenylephrine constructor
	 */
	
	public Phenylephrine() {
		super(104, "Phenylephrine", new String[]{
				"Nasal Congestion", "Sinus Pressure", "Swollen Nasal Passages", "Ear Congestion"
		});
		this.setPicture("/images/Phenylephrine.jpg");

	}

}
