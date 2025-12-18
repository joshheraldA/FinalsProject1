package finalsProject;

public class Loratadine extends Medicine {
	
	
	/*
	 * constructor of medicine
	 * 
	 * @param {cost} cost of the medicine in php
	 * @param {id} id of the medicine
	 * @param {picture} relative picture path relating to the medicine
	 * @param {name} name of the medicine
	 * @param {symptoms} symptoms of the sickness the medicine is trying to solve
	 */
	
	
	public Loratadine(int id, String name, String[] symptoms) {
		super(id, name, symptoms);
		this.setPicture("/images/loratadine.png");
	}
	
	/*
	 * overloading the Loratadine constructor
	 */
	
	public Loratadine() {
		super(111, "Loratadine", new String[]{
				"Runny Nose", "Uncontrollable Sneezing", "Itchy Watery Eyes", "Skin Itching", "Itchy Throat"
		});
		this.setPicture("/images/loratadine.png");

	}	
}
