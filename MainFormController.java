import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainFormController  {
    

    public CheckBox cbxJava;
    public CheckBox cbxRuby;
    public CheckBox cbxKotlin;
    public TextField txtData;


    public void printDataOnAction(ActionEvent actionEvent) {
        ArrayList <String> list = new ArrayList<>();
        if (cbxJava.isSelected()) list.add("Java");
        if (cbxRuby.isSelected()) list.add("Ruby");
        if (cbxKotlin.isSelected()) list.add("Kotlin");
        System.out.println(list);

    }

    public void typeOnAction(KeyEvent keyEvent) {
        if (keyEvent.getCode().equals(KeyCode.ENTER)){
            System.out.println(this.txtData.getText());
        }
        }
}
