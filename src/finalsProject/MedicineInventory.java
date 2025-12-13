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
			new Ibuprofen()
			
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
		Medicine medicine = new Ibuprofen();
		
		return medicine;
	}

	/*
	 * displays all medicine
	 */
	public void displayMedicine() {
		for(Medicine medicine: medicineList) {
			System.out.println(medicine.getName());
		}
	}
	
}
