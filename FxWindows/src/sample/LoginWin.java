package sample;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class LoginWin {
    public static boolean answer;
    public static boolean display(String title){
        Stage stage=new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle(title);

        Button qd=new Button("确定");
        Button qx=new Button("取消");

        qd.setOnMouseClicked(mouseEvent -> {
            System.out.println("创建成功");
            answer=true;
            stage.close();
        });
        qx.setOnMouseClicked(mouseEvent -> {
            stage.close();
            answer=false;
        });

        Label label=new Label("注册账号");

        TextField zh=new TextField();
        zh.setPromptText("请输入账号");
        zh.setMinWidth(90);
        TextField tf = new TextField();
        tf.setPromptText("请输入用户名");
        tf.setMinWidth(90);
        PasswordField pf = new PasswordField();
        pf.setPromptText("请输入密码");
        pf.setMinWidth(90);

        VBox vBox=new VBox();
        HBox hBox=new HBox();
        hBox.getChildren().addAll(qd,qx);
        vBox.getChildren().addAll(label,zh,tf,pf,hBox);

        Scene scene=new Scene(vBox,500,500);

        stage.setScene(scene);
        stage.show();
        return answer;
    }
}
