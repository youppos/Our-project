package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;

public class Main extends Application {

    Stage windows;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        windows = primaryStage;
        windows.setTitle("欢迎使用城市管理系统");


        VBox layout = new VBox();
        layout.setPadding(new Insets(50, 50, 50, 50));
        layout.setSpacing(20);
        layout.setAlignment(Pos.CENTER);

        HBox layout1 = new HBox();
        layout1.setPadding(new Insets(50, 50, 50, 50));
        layout1.setSpacing(20);
        layout1.setAlignment(Pos.CENTER);


        Label lb = new Label("城市管理系统");
        lb.setId("bold-label");

        TextField zh=new TextField();
        zh.setPromptText("请输入账号");
        zh.setMinWidth(90);
        TextField tf = new TextField();
        tf.setPromptText("请输入用户d名");
        tf.setMinWidth(90);
        PasswordField pf = new PasswordField();
        pf.setPromptText("请输入密码");
        pf.setMinWidth(90);

        //除去css中默认的button风格，设置自己的风格
        Button bt = new Button("Sign up");
        Button bt1 = new Button("Login");
        bt1.getStyleClass().add("button-blue");

        bt.setOnMouseClicked(mouseEvent -> login());

        layout1.getChildren().addAll(bt1, bt);
        bt.setMinWidth(120);
        layout.getChildren().addAll(lb,zh, tf, pf, layout1);
        Scene sne = new Scene(layout, 500, 500);
        windows.setScene(sne);
        //  sne.getStylesheets().add("Viper.css") ;
        windows.show();
    }
    public void login(){
        boolean ret= sample.LoginWin.display("注册账号");
        if(ret){
            System.out.println("注册成功");
        }else {
            System.out.println("注册失败");
        }
    }
}
