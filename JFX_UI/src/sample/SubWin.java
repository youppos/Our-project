package sample;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SubWin extends Application {
    Stage stage01=new Stage();
    Stage stage02=new Stage();
    Stage stage03=new Stage();
    Stage stage04=new Stage();
    Parent root;
    @Override
    public void start(Stage primaryStage) throws Exception {

        Scene scene = new Scene(root);
        scene.setFill(Color.TRANSPARENT);
        primaryStage.setScene(scene);
        primaryStage.setHeight(400);
        primaryStage.setWidth(350);
        primaryStage.show();

    }

    public static void main(String[] args) { launch(args); }

    public  void showPane() throws Exception{
        root = FXMLLoader.load(getClass().getResource("host.fxml"));
        start(stage01);
    }

    public  void showPane02() throws Exception{
        root = FXMLLoader.load(getClass().getResource("rankRooms.fxml"));
        start(stage02);
    }
    public  void showPane03() throws Exception{
        root = FXMLLoader.load(getClass().getResource("changeRooms.fxml"));
        start(stage03);
    }

    public  void showPane04() throws Exception{
        root = FXMLLoader.load(getClass().getResource("quitRooms.fxml"));
        start(stage04);
    }




}