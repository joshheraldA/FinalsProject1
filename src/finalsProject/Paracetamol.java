package finalsProject;

public class Paracetamol extends Medicine {
	
	/*
	 * constructor of medicine
	 * 
	 * @param {cost} cost of the medicine in php
	 * @param {id} id of the medicine
	 * @param {picture} relative picture path relating to the medicine
	 * @param {name} name of the medicine
	 * @param {symptoms} symptoms of the sickness the medicine is trying to solve
	 */
	public Paracetamol(int id, String name, String[] symptoms) {
		super(id, name, symptoms);
		this.setPicture("./images/paracetamol.jpg");
	}
	
	/*
	 * overloading the Ibuprofen constructor
	 */
	public Paracetamol() {
		super(102, "Paracetamol", new String[]{
			"Headache", "Elevated Body Temperature", "Body Aches"
		});
		this.setPicture("./images/paracetamol.jpg");

	}
}