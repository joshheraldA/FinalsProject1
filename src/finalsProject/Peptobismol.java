package finalsProject;

public class Peptobismol extends Medicine{
	
	
	/*
	 * constructor of medicine
	 * 
	 * @param {cost} cost of the medicine in php
	 * @param {id} id of the medicine
	 * @param {picture} relative picture path relating to the medicine
	 * @param {name} name of the medicine
	 * @param {symptoms} symptoms of the sickness the medicine is trying to solve
	 */
	
	
	public Peptobismol(int id, String name, String[] symptoms) {
		super(id, name, symptoms);
		this.setPicture("/images/peptobismol.jpeg");
	}
	
	/*
	 * overloading the Oxymetazoline constructor
	 */
	
	public Peptobismol() {
		super(112, "Peptobismol", new String[]{
				"Loose Watery Stool", "Abdominal Cramps", "Frequent Bowel Movements", "indigestion"
		});
		this.setPicture("/images/peptobismol.jpeg");

	}
	
}
