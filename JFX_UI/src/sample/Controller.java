package sample;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

public class Controller {
    public Label lb;
    public Pane Pane01;

    public void test(){
         //  lb.setText("hello!");
        HBox Bx=new HBox();

        Bx.setStyle("-fx-background-color: #3012cb");
        Bx.setPrefWidth(400);
        Bx.setPrefHeight(400);
        // pane02.setOnMouseClicked(event -> System.out.println("wobeila"));
        //Pane01.getChildren().add(btn);
        Pane01.getChildren().add(Bx);

    }
    public void test01(){
           Pane pane02=new Pane();
           Button btn=new Button("llll");
           btn.setLayoutX(10);
           HBox Bx=new HBox();

           Bx.setStyle("-fx-background-color: #88169c");
           Bx.setPrefSize(400,400);

           // pane02.setOnMouseClicked(event -> System.out.println("wobeila"));
           Pane01.getChildren().add(btn);
           Pane01.getChildren().add(Bx);
    }

    public void test02(){
        Pane pane02=new Pane();
        Button btn=new Button("llll");
        btn.setLayoutX(10);


        pane02.setStyle("-fx-background-color: #3a9c16");
       // pane02.setPrefSize(425,400);
        Pane01.getChildren().add(pane02);
    }
}
