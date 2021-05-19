package Controller;

import javafx.scene.control.ChoiceBox;

public class TestController {

    public ChoiceBox income;
    public ChoiceBox important;
    public ChoiceBox culture;

    public  void income(){
        income.getItems().setAll("500以下", "500-1000" ,"1000-2000","2000-3000","3000-5000","5000以上");
    }
public  void important(){
    important.getItems().setAll("否","未成年人" ,"退役军人" ,"烈士家属" ,"离退休人员", "两劳两教");
    }
public  void culture(){
    culture.getItems().setAll("无","小学","初中","高中","大专","本科",  "硕士"," 博士");
    }

}
