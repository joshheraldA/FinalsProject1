package finalsProject;

public class MedicineArchive {
	private static Medicine[] medicineList;
	
	public MedicineArchive() {
		
		// create a list of the medicine that is available in inventory
		medicineList = new Medicine[]{
			new Ibuprofen(200.99, 101, "Ibuprofen", new String[]{
				"Swelling", "Stiffness", "Redness", "Elevated Body Temperature"
			}),
			new Paracetamol(100.99, 102, "Paracetamol", new String[] {
				"Headache", "Elevated Body Temperature", "Body Aches"
			})
			
		};
	}
	
	public static Medicine[] getMedicineList() { return medicineList; }
	
	
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
		System.out.println("==============================================================");
		for(Medicine medicine: medicineList) {
			System.out.println(medicine.getName() + "\t\t" + medicine.getId() + "\t\t" + medicine.getCost());
		}
	}
	
}
