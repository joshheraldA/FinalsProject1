package finalsProject;

import java.util.ArrayList;


import javafx.fxml.FXML;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.cell.CheckBoxListCell;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.image.Image;
import javafx.beans.property.SimpleBooleanProperty;

public class Controller {
    
    // This method is called automatically after FXML is loaded
	
	private SearchEngine engine = new SearchEngine();
	private MedicineArchive archive = new MedicineArchive();
	private ArrayList<String> symptomListData = new ArrayList<String>();
	private ArrayList<Medicine> medicines = archive.getMedicineList();
	
	@FXML
	ComboBox<String> symptomsComboBox;
	
	@FXML
	ListView<String> symptomsList;
	
	@FXML
	Button submitButton;
	
	@FXML
	TilePane medicineTilePane;
	
	
    @FXML
    private void initialize() {
    	
    	
    	
    	symptomsList.setCellFactory(listView -> new CheckBoxAtEndCell());
    	
    	
    	String[] items = {"Headache", "Stiffness", "Redness", "Elevated Body Temperature", "Swelling"};       
    	
    	symptomsComboBox.getItems().addAll(items);
        symptomsComboBox.setValue(items[0]);
        
//        for (int i = 1; i <= 6; i++) {
//            VBox card = createCard("Item " + i, "paracetamol.jpg");
//            medicineTilePane.getChildren().add(card);
//        }
        
        for(Medicine meds : medicines ) {
        	VBox card = createCard(meds.getName(), "paracetamol.jpg");
        	medicineTilePane.getChildren().add(card);
        }
        
    }
    
    
    @FXML
    private void submitAction() {
    	addSymptom();
    }
    
    
    private VBox createCard(String title, String imagePath) {
	    VBox card = new VBox(5);
	    card.setAlignment(Pos.CENTER);
	    card.setStyle("-fx-border-color: black; -fx-padding: 10; -fx-background-color: white;");
	    
	    Image image = new Image(getClass().getResourceAsStream("paracetamol.jpg"));

	    
	    ImageView imageView = new ImageView(image);
	    imageView.setFitWidth(100);
	    imageView.setFitHeight(100);
	    imageView.setPreserveRatio(true);
	    
	    Label label = new Label(title);
	    
	    card.getChildren().addAll(imageView, label);
	    return card;
	}
    
    private void updateMedList() {
    	medicineTilePane.getChildren().clear();
    	for(Medicine meds : medicines ) {
        	VBox card = createCard(meds.getName(), "paracetamol.jpg");
        	medicineTilePane.getChildren().add(card);
        }
    }
    
    private void addSymptom() {
    	
    	if(!symptomListData.contains(symptomsComboBox.getValue())) {
    		symptomListData.add(symptomsComboBox.getValue());
    		symptomsList.getItems().add(symptomsComboBox.getValue());
    	}
    	
    	medicines = engine.filterMedicines(symptomListData);
    	
    	for(Medicine medicine1: medicines) {
			System.out.println(medicine1.getName());
			
		}
    	System.out.println(medicines.size());
    	updateMedList();
    	
    }
    
    
    private class CheckBoxAtEndCell extends ListCell<String> {
        private Label label;
        private CheckBox checkBox;
        private HBox hBox;
        
        public CheckBoxAtEndCell() {
            label = new Label();
            label.setStyle("-fx-font-size: 14px;");
            

            Region spacer = new Region();
            HBox.setHgrow(spacer, Priority.ALWAYS);
            
            checkBox = new CheckBox();
            
            // Order: Label, Spacer, CheckBox (checkbox at end)
            hBox = new HBox(10, label, spacer, checkBox);
            hBox.setAlignment(Pos.CENTER_LEFT);
            hBox.setStyle("-fx-padding: 5;");
        }
        
        @Override
        protected void updateItem(String item, boolean empty) {
            super.updateItem(item, empty);
            
            if (empty || item == null) {
                setGraphic(null);
            } else {
                label.setText(item);
                setGraphic(hBox);
            }
        }
    }
    
    
}