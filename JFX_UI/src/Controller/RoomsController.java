package Controller;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Dialog;
import javafx.scene.layout.AnchorPane;
import sample.Main;
import sample.SubWin;

import java.io.IOException;

public class RoomsController {

    public AnchorPane rankSearchPane;
    public AnchorPane roomsAnchorPane;
    public AnchorPane host;

       /* public  void search(){

        }*/


    public void search(ActionEvent event) throws IOException {
        AnchorPane  rankSearchPane = new Main().initRankSeachPane();
        System.out.println("sss");
        roomsAnchorPane.getChildren().clear();
        roomsAnchorPane.getChildren().add(rankSearchPane);

    }

    public void host(ActionEvent event) throws Exception {
        SubWin subWin= new SubWin();
        subWin.showPane();

    }

    public void rank(ActionEvent event) throws Exception {
        // DataRankRooms Rooms=
        //if (isYoufang()){}
        //首先要有房可租
        //提示用户确定选中哪行


        //显示租客信息的填写页面

       /*if (isYoufang()){
            SubWin subWin= new SubWin();
            subWin.showPane02();
        }
        else {

        }*/

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("温馨提示");
        alert.setHeaderText(null);
        alert.setContentText("当前无房可租!");
        alert.showAndWait();


        SubWin subWin= new SubWin();
        subWin.showPane02();

    }

    public void change(ActionEvent event) throws Exception {
        SubWin subWin= new SubWin();
        subWin.showPane03();

    }

    public void quit(ActionEvent event) throws Exception {
        SubWin subWin= new SubWin();
        subWin.showPane04();

    }


}
