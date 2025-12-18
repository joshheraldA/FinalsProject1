package finalsProject;

public class Naproxen extends Medicine {

	public Naproxen(int id, String name, String[] symptoms) {
		super(id, name, symptoms);
		this.setPicture("/images/naproxen.jpeg");
	}
	
	/*
	 * overloading the Naproxen constructor
	 */
	public Naproxen() {
		super(108, "Naproxen", new String[]{
				"Swelling", "Stiffness", "Redness", "Elevated Body Temperature", "Headache", "Body Aches" 
		});
		this.setPicture("/images/naproxen.jpeg");

	}
}
