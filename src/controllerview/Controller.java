/**
 * uebung 11
 * @author Brunmayr Sarah
 * @version 12.0.1, 14.01.2021
 */

package controllerview;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import model.CarDatabase;
import model.Vehicle;
import java.util.ArrayList;

public class Controller {
    @FXML
    private TextArea textArea;
    @FXML
    private TextField textField;

    private CarDatabase carDatabase = new CarDatabase();

    @FXML
    public void searchFor(){
        double starttime = System.currentTimeMillis();
        ArrayList<Vehicle> result = carDatabase.search(textField.getText(), false);
        textArea.setText("");
        for (int i = 0; i < result.size(); i++) {
            if (result.get(i) != null)
                textArea.appendText(result.get(i).toString() + "\n");
        }
        double endtime = System.currentTimeMillis();
        double time = endtime - starttime;
        System.out.println("Run Time: " +time+ "ms.");
    }

    @FXML
    public void searchExact(){
        double starttime = System.currentTimeMillis();
        ArrayList<Vehicle> result = carDatabase.search(textField.getText(), true);
        textArea.setText("");
        for (int i = 0; i < result.size(); i++) {
            if (result.get(i) != null)
                textArea.setText(result.get(i).toString() + "\n");
        }
        double endtime = System.currentTimeMillis();
        double time = endtime - starttime;
        System.out.println("Run Time: " +time+ "ms.");
    }
}
