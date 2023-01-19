package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class gradeController implements Initializable {
	@FXML Label txtSum, txtAvg; 
	@FXML Button btnSum;
	@FXML TextField txtName, txtKor, txtEng;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}
	
	public void btnSumAction(ActionEvent event) {
		int tmp = Integer.parseInt(txtKor.getText());
		int tmp2 = Integer.parseInt(txtEng.getText());
		
		gradeModel model = new gradeModel();
		int total = model.gradeSum(tmp, tmp2);
		
		txtSum.setText(String.valueOf(total));
	}
	public void btnAvgAction(ActionEvent event) {
		int tmp = Integer.parseInt(txtKor.getText());
		int tmp2 = Integer.parseInt(txtEng.getText());
		
		gradeModel model = new gradeModel();
		float avg = model.gradeAvg(tmp, tmp2);
		
		txtAvg.setText(String.valueOf(avg));
	}

}
