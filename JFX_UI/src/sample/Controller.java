package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class Controller {
    @FXML
    public Label lb;
    @FXML
    public Pane Pane01;

    public AnchorPane testPane;


    public void initTestPane(ActionEvent event) throws IOException {
        AnchorPane pane = new Main().initTestPane();
        System.out.println("fff");
        testPane.getChildren().clear();
        testPane.getChildren().add(pane);

    }

}
