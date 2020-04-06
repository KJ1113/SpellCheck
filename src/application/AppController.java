package application; 
import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import Liners.LineList;
import Liners.Liner;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML; 
import javafx.fxml.Initializable; 
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
public class AppController implements Initializable {
	@FXML private Button btn0;
	@FXML private Label label0;
	@FXML private Button btn1;
	@FXML private Button btn2;
	@FXML private Button btn3;
	@FXML private Button btn4;
	@FXML private Button btn5;

	@FXML private Button btn1_1;
	@FXML private Button btn2_1;
	@FXML private Button btn3_1;
	@FXML private Button btn4_1;
	@FXML private Button btn5_1;
    
    @FXML private ComboBox com1;
    @FXML private ComboBox com2;
    @FXML private ComboBox com3;
    @FXML private ComboBox com4;
    @FXML private ComboBox com5;

    @FXML private ComboBox com1_1;
    @FXML private ComboBox com2_1;
    @FXML private ComboBox com3_1;
    @FXML private ComboBox com4_1;
    @FXML private ComboBox com5_1;
    
    @FXML private Label label1;
    @FXML private Label label2;
    @FXML private Label label3;
    @FXML private Label label4;
    @FXML private Label label5;
    
    @FXML private Label label1_1;
    @FXML private Label label2_1;
    @FXML private Label label3_1;
    @FXML private Label label4_1;
    @FXML private Label label5_1;
    
    @FXML private Label label11;
    @FXML private Label label22;
    @FXML private Label label33;
    @FXML private Label label44;
    @FXML private Label label55;
    
    @FXML private Label label11_1;
    @FXML private Label label22_1;
    @FXML private Label label33_1;
    @FXML private Label label44_1;
    @FXML private Label label55_1;
    
    
    @FXML private ImageView img1;
    @FXML private ImageView img2;
    @FXML private ImageView img3;
    @FXML private ImageView img4;
    @FXML private ImageView img5;
    
    @FXML private ImageView img1_1;
    @FXML private ImageView img2_1;
    @FXML private ImageView img3_1;
    @FXML private ImageView img4_1;
    @FXML private ImageView img5_1;
    
    
    
    private LineList linelist;
    private BtnAction btnAction;
    private ComboBoxAction comboAction;
    private ObservableList<String> list = FXCollections.observableArrayList("¡°∏Í", "¡°»≠", "ΩØµÂ", "»˙","Ω∫∏∂","¿Ø√º»≠","≈⁄","¡§»≠","≈ª¡¯");
    
    @Override 
	public void initialize(URL location, ResourceBundle resources) {
    	
    	btnAction = new BtnAction();
    	comboAction =new ComboBoxAction();
    	linelist= new LineList(); // ∂Û¿Ã≥  Ω∫∆Á√ ±‚»≠
    	ArrayList<Liner>liners =linelist.getlinelist();
    	
    	com1.setItems(list);
    	com2.setItems(list);
    	com3.setItems(list);
    	com4.setItems(list);
    	com5.setItems(list);
    	com1_1.setItems(list);
    	com2_1.setItems(list);
    	com3_1.setItems(list);
    	com4_1.setItems(list);
    	com5_1.setItems(list);
  	
		btn1.setOnAction(event -> btnAction.handleSpellBtnAction(event ,liners.get(0),"D", label1,label1_1 ));
		btn2.setOnAction(event -> btnAction.handleSpellBtnAction(event ,liners.get(1),"D", label2,label2_1));
		btn3.setOnAction(event -> btnAction.handleSpellBtnAction(event ,liners.get(2),"D", label3,label3_1 ));
		btn4.setOnAction(event -> btnAction.handleSpellBtnAction(event ,liners.get(3),"D", label4,label4_1 ));
		btn5.setOnAction(event -> btnAction.handleSpellBtnAction(event ,liners.get(4),"D", label5,label5_1 ));
		
		btn1_1.setOnAction(event -> btnAction.handleSpellBtnAction(event ,liners.get(0),"F", label11,label11_1));
		btn2_1.setOnAction(event -> btnAction.handleSpellBtnAction(event ,liners.get(1),"F", label22,label22_1));
		btn3_1.setOnAction(event -> btnAction.handleSpellBtnAction(event ,liners.get(2),"F", label33,label33_1));
		btn4_1.setOnAction(event -> btnAction.handleSpellBtnAction(event ,liners.get(3),"F", label44,label44_1));
		btn5_1.setOnAction(event -> btnAction.handleSpellBtnAction(event ,liners.get(4),"F", label55,label55_1));
		
        btn0.setOnAction(event -> btnAction.gameStartAction(event, label0));
        
        com1.setOnAction(event -> comboAction.ComboAction(event , com1.getValue().toString(), liners.get(0), "D",img1));
        com2.setOnAction(event -> comboAction.ComboAction(event , com2.getValue().toString(), liners.get(1), "D",img2));
        com3.setOnAction(event -> comboAction.ComboAction(event , com3.getValue().toString(), liners.get(2), "D",img3));
        com4.setOnAction(event -> comboAction.ComboAction(event , com4.getValue().toString(), liners.get(3), "D",img4));
        com5.setOnAction(event -> comboAction.ComboAction(event , com5.getValue().toString(), liners.get(4), "D",img5));        
        
        com1_1.setOnAction(event -> comboAction.ComboAction(event , com1_1.getValue().toString(), liners.get(0), "F",img1_1));
        com2_1.setOnAction(event -> comboAction.ComboAction(event , com2_1.getValue().toString(), liners.get(1), "F",img2_1));
        com3_1.setOnAction(event -> comboAction.ComboAction(event , com3_1.getValue().toString(), liners.get(2), "F",img3_1));
        com4_1.setOnAction(event -> comboAction.ComboAction(event , com4_1.getValue().toString(), liners.get(3), "F",img4_1));
        com5_1.setOnAction(event -> comboAction.ComboAction(event , com5_1.getValue().toString(), liners.get(4), "F",img5_1));
	}   
}
