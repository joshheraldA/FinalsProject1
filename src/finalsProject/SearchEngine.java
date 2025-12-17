package finalsProject;

import java.util.ArrayList;

public class SearchEngine {

	/*
	 * filters the medicine based on the symptoms that are being shown
	 * 
	 * @param {symptoms} the symptoms we want to find
	 * 
	 */
	public ArrayList<Medicine> filterMedicines(ArrayList<String> symptoms) {
		ArrayList<Medicine> filteredMedicines = new ArrayList<Medicine>();
	
		for(Medicine medicine : MedicineArchive.getMedicineList()) {
			for(String symptom: medicine.getSymptoms()) {
				if(symptoms.contains(symptom)) {
					filteredMedicines.add(medicine);
				}
			}
		}
		return filteredMedicines;
	}
	
	
}
