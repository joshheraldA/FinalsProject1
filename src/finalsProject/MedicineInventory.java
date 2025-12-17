package finalsProject;

import java.util.ArrayList;

public class MedicineInventory {
	private ArrayList<Medicine> medicines;
	private static Medicine[] medicineList;
	private int totalStocks;
	
	public MedicineInventory() {
		this.medicines = new ArrayList<Medicine>();
		this.setTotalStocks(0);
		
		// create a list of the medicine that is available in inventory
		medicineList = new Medicine[]{
			new Ibuprofen(200.99, 101, "Ibuprofen", new String[]{
				"Swelling", "Stiffness", "Redness", "Elevated Body Temeprature"
			}),
			new Paracetamol(100.99, 102, "Paracetamol", new String[] {
				"Headache", "Elevated Body Temeprature", "Body Aches"
			})
			
		};
	}
	
	/*
	 * returns the total stocks
	 * 
	 * @returns {totalStocks} the total stock of medicines
	 */
	public int getTotalStocks() { return this.totalStocks; }
	
	
	/*
	 * set the total stocks
	 * 
	 * @param {amount} the amount of stocks to add
	 * @param {void} no return
	 */
	public void setTotalStocks(int amount) { 
		this.totalStocks = this.getTotalStocks() + amount;
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
		System.out.println("==============================================================");
		for(Medicine medicine: medicineList) {
			System.out.println(medicine.getName() + "\t\t" + medicine.getId() + "\t\t" + medicine.getCost());
		}
	}
	
}
