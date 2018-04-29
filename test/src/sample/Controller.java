package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

import java.awt.*;

public class Controller {

    public javafx.scene.control.TextField user_pass;
    public javafx.scene.control.TextField user_name;
    @FXML private Text actionTarget;

    public void handleSubmitButtonAction(ActionEvent event){
        actionTarget.setText("Signed in");
        String username = user_name.getText();
        String password = user_pass.getText();


        String eve = event.toString();
        System.out.println("username: "+username+", Password: "+ password);
    }
}
