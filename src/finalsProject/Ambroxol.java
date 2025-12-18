package finalsProject;

public class Ambroxol extends Medicine {
	
	/*
	 * constructor of medicine
	 * 
	 * @param {cost} cost of the medicine in php
	 * @param {id} id of the medicine
	 * @param {picture} relative picture path relating to the medicine
	 * @param {name} name of the medicine
	 * @param {symptoms} symptoms of the sickness the medicine is trying to solve
	 */
	public Ambroxol(int id, String name, String[] symptoms) {
		super(id, name, symptoms);
		this.setPicture("./images/ambroxol.jpeg");
	}
	
	
	/*
	 * overloading the Ambroxol constructor
	 */
	
	public Ambroxol() {
		super(109, "Ambroxol", new String[]{
				"Phlegm", "Chest Congestion", "Difficulty Coughing Up Mucus", "Wet Cough"
		});
		this.setPicture("./images/ambroxol.jpeg");

	}
}
