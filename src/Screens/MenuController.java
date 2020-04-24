package Screens;


import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Window;
import java.io.IOException;
import java.text.BreakIterator;

public class MenuController {
    public Button btnStarterScreen;
    public TextField TableNumber;

    public void btnStarterScreenClick(ActionEvent actionEvent) {
        try{
            Window mainWindow = btnStarterScreen.getScene().getWindow();

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("Starters.fxml"));
            Parent root = loader.load();
            StartersController startersController = loader.getController();
            startersController.dataReceiver(tfValueToPass.getText());

            mainWindow.getScene().setRoot(root);

        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }


}
