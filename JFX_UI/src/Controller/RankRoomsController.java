package Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class RankRoomsController {
    public TextField rankerName;
    public TextField rankerId;

    //public Button rankRoomsOK;
    public void do_rankRoomsOK_event(ActionEvent event)throws Exception{
        //获取选中行表格里的信息

        System.out.println("do_rankRoomsOK_event");
        String name = rankerName.getText();
        String id = rankerId.getText();

        //##把name，id插入数据库

    }

}
