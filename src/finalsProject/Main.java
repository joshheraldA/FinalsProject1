package finalsProject;

import java.io.File;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		MedicineArchive archive = new MedicineArchive();
		
		archive.displayMedicine();
		
		
		// finds medicine for you
		// switch to a id that is not below to get the error and the function will return null
		Medicine medicine = archive.findMedicine(103);
		if(medicine == null) throw new Error("Could not find the medicine");
		System.out.println(medicine.getName());
		
		
		// just to check file exists
//		File file = new File(medicine.getPicture());
//	
//		if(file.exists()) {
//			System.out.println("File exists");
//		}
//		else {
//			System.out.println("File does not exists");
//		}

		SearchEngine engine = new SearchEngine();
		
		ArrayList<String> symptomExample = new ArrayList<String>();
		symptomExample.add("Headache");
		ArrayList<Medicine> medicines = engine.filterMedicines(symptomExample);
		
		for(Medicine medicine1: medicines) {
			System.out.println(medicine1.getName());
		}
		
		
	} 

}
