package Controller;
import Data.HouseDao;
import Tools.HouseTools;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Dialog;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import sample.Main;
import sample.SubWin;

import java.io.IOException;

public class RoomsController {

    public AnchorPane rankSearchPane;
    public AnchorPane roomsAnchorPane;
    public AnchorPane host;

    public TableView Tv;
    public TableColumn Address;
    public TableColumn Price;
    public TableColumn Area;
    public TableColumn Floor;
    public TableColumn State;
    public TableColumn Client;
    public TableColumn ClientId;
    public TableColumn Decoration;
    public TableColumn hostName;
    public TableColumn hostSex;
    public TableColumn hostId;
    public TableColumn hostPhone;


    private HouseTools tools=new HouseTools();
    private HouseDao houseDao= new HouseDao();

    public void initialize() {
        // 查询个人信息的SQL语句
        String sql=" ";
        // 填充表格数据，初始化表格视图
        tools.setHouseTableViewData(Tv,tools.getHouseTableViewData(sql),Address,Price,Area,Floor,State,Client,ClientId,Decoration,hostName,hostSex,hostId,hostPhone);

    }


    public void  do_searchButton_event(ActionEvent event){
         /*// 查询SQL语句String sql = "select bId,bBookName,bAuthor,bSex,bPrice,bBookDescription,btName from tb_book,tb_booktype where" +
       //                " tb_book.btId=tb_booktype.btId ";*/
        String sql ="";

        /*// 判断用户是否输入身份证，模糊查询
        if (!tools.isEmpty(idTextField.getText())) {
            sql += " and id like '%" + idTextField.getText() + "%'";
        }
        // 判断用户是否输入姓名，模糊查询
        if (!tools.isEmpty(nameTextField.getText())) {
            sql += " and name like '%" + nameTextField.getText() + "%'";*/
        // 通过SQL语句查询到的数据重新填充表格，刷新表格显示的数据
        tools.setHouseTableViewData(Tv,tools.getHouseTableViewData(sql),Address,Price,Area,Floor,State,Client,ClientId,Decoration,hostName,hostSex,hostId,hostPhone);


        }












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

