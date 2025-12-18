package finalsProject;

public class Carbocisteine extends Medicine{

	public Carbocisteine(int id, String name, String[] symptoms) {
		super(id, name, symptoms);
		this.setPicture("./images/Carbocisteine.jpg");
	}
	
	public Carbocisteine() {
		super(103, "Carbocisteine", new String[]{
				"Phlegm", "Chest Congestion", "Difficulty Coughing Up Mucus", "Wet Cough"
		});
		this.setPicture("./images/Carbocisteine.jpg");

	}

}
