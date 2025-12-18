package finalsProject;

import java.util.ArrayList;
import java.util.Arrays;

public class MedicineArchive {
	private static ArrayList<Medicine> medicineList;
	
	public MedicineArchive() {
		// create a list of medicine and store it in the list of medicines 
		medicineList = new ArrayList<Medicine>();
		initMedicine();
	
	}
		
	public static ArrayList<Medicine> getMedicineList() { return medicineList; }
	
	/*
	 * adds medicine
	 */
	public void initMedicine() {
		medicineList.add(new Ibuprofen());
		medicineList.add(new Paracetamol());
		medicineList.add(new Carbocisteine());
		medicineList.add(new Phenylephrine());
		medicineList.add(new Cetirizine());
		medicineList.add(new Loperamide());
	}
	
	/* 
	 * find the medicine based on the id
	 * 
	 * @param {id} the id of the medicine
	 * @returns {medicine} the medicine the user is trying to find
	 * @throws {Error} if cannot find medicine
	 */
	public Medicine findMedicine(int id) {
		for(Medicine medicine: medicineList) {
			if(medicine.getId() == id) {
				return medicine;
			}
		}
		return null;
	}

	/*
	 * displays all medicine
	 * 
	 * @return {void} no return
	 */
	public void displayMedicine() {
		System.out.println("NAME\t\t\tID\t\tCOST");
		System.out.println("============================================================================================================================");
		medicineList.forEach(medicine -> {
			System.out.println(medicine.getName() + "\t\t" + medicine.getId() + "\t\t" + Arrays.toString(medicine.getSymptoms()));

		});
	}
	
}
