package main;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author lizard-Szilard
 */
public class FXMLController implements Initializable {

	@FXML
	private TextField rightOperandTextField;
	@FXML
	private TextField leftOperandTextField;
	@FXML
	private TextField ResultTextField;
	@FXML
	private Button divisionButton;
	@FXML
	private Button multipleButton;
	@FXML
	private Button plusButton;
	@FXML
	private Button minusButton;
	@FXML
	private Button clearButton;

	/**
	 * Initializes the controller class.
	 */
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO
	}

	@FXML
	private void handlerButtonOperand(ActionEvent event) {

		// Use double more precision
		Double lefOperand = 0.0;
		Double rightOperand = 0.0;
		double computeResult = 0;

		if (leftOperandTextField.getText().equals("") && rightOperandTextField.getText().equals("")) {
			lefOperand = 0.0;
			rightOperand = 0.0;
		}else{
			lefOperand = Double.parseDouble(leftOperandTextField.getText());
			rightOperand = Double.parseDouble(rightOperandTextField.getText());
		}

		if (event.getSource() == plusButton) {
			computeResult = lefOperand + rightOperand;
			ResultTextField.setText(Double.toString(computeResult));
		} else if (event.getSource() == minusButton) {
			computeResult = lefOperand - rightOperand;
			ResultTextField.setText(Double.toString(computeResult));
		} else if (event.getSource() == multipleButton) {
			computeResult = lefOperand * rightOperand;
			ResultTextField.setText(Double.toString(computeResult));
		} else if (event.getSource() == divisionButton) {
			computeResult = lefOperand / rightOperand;
			ResultTextField.setText(Double.toString(computeResult));
		}

	}

	@FXML
	private void handlerButtonClear(ActionEvent event) {
		leftOperandTextField.setText("");
		rightOperandTextField.setText("");
		ResultTextField.setText("");
	}

}
