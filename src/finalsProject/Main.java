package finalsProject;

import java.io.File;
import java.util.ArrayList;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.application.Application;

import javafx.geometry.Pos;


public class Main extends Application{
	
	@Override
	public void start(Stage primaryStage)  {
		try {
			// Load the FXML file
			Parent root = FXMLLoader.load(getClass().getResource("homepage.fxml"));
			

			Scene scene = new Scene(root);
			
		
			scene.getStylesheets().add(getClass().getResource("applications.css").toExternalForm());
			primaryStage.setTitle("JavaFX Application");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		launch(args);
		MedicineArchive archive = new MedicineArchive();
		
		archive.displayMedicine();
		
		
		// finds medicine for you
		// switch to a id that is not below to get the error and the function will return null
		Medicine medicine = archive.findMedicine(113);
		if(medicine == null) throw new Error("Could not find the medicine");
		System.out.println(medicine.getName());
		
		
		// just to check file exists
		File file = new File(medicine.getPicture());
	
		if(file.exists()) {
			System.out.println("File exists");
		}
		else {
			System.out.println("File does not exists");
		}

		SearchEngine engine = new SearchEngine();
		
		ArrayList<String> symptomExample = new ArrayList<String>();
		symptomExample.add("Headache");
		ArrayList<Medicine> medicines = engine.filterMedicines(symptomExample);
		
		for(Medicine medicine1: medicines) {
			System.out.println(medicine1.getName());
		}
		
		
		System.out.println(archive.listOfSymptoms());
	}
}