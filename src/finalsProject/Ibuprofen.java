package finalsProject;

public class Ibuprofen extends Medicine {
	
	/*
	 * constructor of medicine
	 * 
	 * @param {cost} cost of the medicine in php
	 * @param {id} id of the medicine
	 * @param {picture} relative picture path relating to the medicine
	 * @param {name} name of the medicine
	 * @param {symptoms} symptoms of the sickness the medicine is trying to solve
	 */
	public Ibuprofen(double cost, int id, String name, String[] symptoms) {
		super(cost, id, name, symptoms);
		this.setPicture("./images/ibuprofen.jpeg");
	}
	
	/*
	 * overloading the Ibuprofen constructor
	 */
	public Ibuprofen() {
		super(0.0, 100, "Ibuprofen", new String[3]);
	}
}
