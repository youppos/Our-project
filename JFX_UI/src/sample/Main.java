package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    //define your offsets here
    private double xOffset = 0;
    private double yOffset = 0;
    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("MainUI.fxml"));
        //primaryStage.initStyle(StageStyle.TRANSPARENT)

        //根节点
        root.setOnMousePressed(event -> {
            xOffset = event.getSceneX();
            yOffset = event.getSceneY();
        });

        //move around here
        root.setOnMouseDragged(event -> {
            primaryStage.setX(event.getScreenX() - xOffset);
            primaryStage.setY(event.getScreenY() - yOffset);
        });
        Scene scene = new Scene(root);

        //set transparent
        scene.setFill(Color.TRANSPARENT);
        primaryStage.setScene(scene);
        primaryStage.setHeight(800);
        primaryStage.setWidth(1200);
        primaryStage.show();


    }


    public static void main(String[] args) { launch(args); }

    public AnchorPane initTestPane() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("test.fxml"));
            AnchorPane root = loader.load();
            return root;

        }catch (IOException e){
            e.printStackTrace();
            return  null;
        }
    }

    public AnchorPane initConstructorPane() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("Constructor.fxml"));
            AnchorPane root = loader.load();
            return root;

        }catch (IOException e){
            e.printStackTrace();

            return  null;
        }

    }

    public AnchorPane initRoomsPane() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("Rooms.fxml"));
            AnchorPane root = loader.load();
            return root;

        }catch (IOException e){
            e.printStackTrace();

            return  null;
        }

    }


    public AnchorPane initRankSeachPane() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("rankSearch.fxml"));
            AnchorPane root = loader.load();
            return root;

        }catch (IOException e){
            e.printStackTrace();
            return  null;
        }
    }


}
