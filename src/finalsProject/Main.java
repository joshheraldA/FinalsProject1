package finalsProject;

import java.io.File;

public class Main {
	public static void main(String[] args) {
		MedicineInventory inventory = new MedicineInventory();
		
		inventory.displayMedicine();
		
		
		// finds medicine for you
		// switch to a id that is not below to get the error and the function will return null
		Medicine medicine = inventory.findMedicine(101);
		if(medicine == null) throw new Error("Could not find the medicine");
		System.out.println(medicine.getName());
		
		
		File file = new File(medicine.getPicture());
	
		if(file.exists()) {
			System.out.println("File ecxists");
		}
		else {
			System.out.println("File does not exists");
		}
		
		
		
	} 

}
