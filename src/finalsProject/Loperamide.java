package finalsProject;

public class Loperamide extends Medicine {
	
	/*
	 * constructor of medicine
	 * 
	 * @param {cost} cost of the medicine in php
	 * @param {id} id of the medicine
	 * @param {picture} relative picture path relating to the medicine
	 * @param {name} name of the medicine
	 * @param {symptoms} symptoms of the sickness the medicine is trying to solve
	 */
	
	public Loperamide(int id, String name, String[] symptoms) {
		super(id, name, symptoms);
		this.setPicture("/images/Loperamide.jpg");	
	}
	
	
	/*
	 * overloading the Loperamide constructor
	 */
	
	public Loperamide() {
		super(106, "Loperamide", new String[]{
				"Loose Watery Stool", "Abdominal Cramps", "Frequent Bowel Movements", "indigestion"
		});
		this.setPicture("/images/Loperamide.jpg");

	}

}
