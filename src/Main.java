/**
 * uebung 11
 * @author Brunmayr Sarah
 * @version 12.0.1, 14.01.2021
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("controllerview/sample.fxml"));
            Parent root = fxmlLoader.load();

            primaryStage.setTitle("Car Database");
            primaryStage.setScene(new Scene(root));
            primaryStage.show();
        }
        catch(Exception ex){
            System.err.println("Error!");
        }
    }

    public static void main(String[] args) { launch(args); }
}

