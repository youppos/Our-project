package Controller;

import BaseData.Person;
import BaseData.PersonTableData;
import Data.PersonDao;
import Tools.Tools;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class TestController {


    public TextField idTextField;
    public TextField nameTextField;
    public RadioButton maleRadioButton;
    public RadioButton femaleRadioButton;
    private Tools tools = new Tools();
    private PersonDao personDao = new PersonDao();

    public ChoiceBox income;
    public ChoiceBox important;
    public ChoiceBox culture;
    public TableView Tv;
    public TableColumn Id;
    public TableColumn Name;
    public TableColumn Sex;
    public TableColumn Age;
    public TableColumn Adress;
    public TableColumn Wenhua;
    public TableColumn Income;
    public TableColumn Important;


    public  void income(){ income.getItems().setAll("500以下", "500-1000" ,"1000-2000","2000-3000","3000-5000","5000以上"); }
    public  void important(){
    important.getItems().setAll("否","未成年人" ,"退役军人" ,"烈士家属" ,"离退休人员", "两劳两教");
    }
    public  void culture(){
    culture.getItems().setAll("无","小学","初中","高中","大专","本科",  "硕士"," 博士");
    }

    public void initialize(){
        // 查询个人信息的SQL语句
        String sql="";
        // 填充表格数据，初始化表格视图
       tools.setPersonTableViewData(
                  Tv
                , tools.getPersonTableViewData(sql)
                , Id
                , Name
                , Sex
                , Age
                , Adress
                , Wenhua
                , Income
                , Important
        );

        Tv.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue,  newValue) -> showPersonDetails((PersonTableData) newValue));

    }

   public void  do_searchButton_event(ActionEvent event){
       /*// 查询SQL语句String sql = "select bId,bBookName,bAuthor,bSex,bPrice,bBookDescription,btName from tb_book,tb_booktype where" +
       //                " tb_book.btId=tb_booktype.btId ";*/
       String sql ="";

       // 判断用户是否输入身份证，模糊查询
       if (!tools.isEmpty(idTextField.getText())) {
           sql += " and id like '%" + idTextField.getText() + "%'";
       }
       // 判断用户是否输入姓名，模糊查询
       if (!tools.isEmpty(nameTextField.getText())) {
           sql += " and name like '%" + nameTextField.getText() + "%'";
       }

       // 通过SQL语句查询到的数据重新填充表格，刷新表格显示的数据
       tools.setPersonTableViewData(
               Tv
               , tools.getPersonTableViewData(sql)
               , Id
               , Name
               , Sex
               , Age
               , Adress
               , Wenhua
               , Income
               , Important
       );

   }











    public void showPersonDetails(PersonTableData personTableData) {
        if (Tv.getSelectionModel().getSelectedIndex() < 0) {
            return;
        } else {
            idTextField.setText(personTableData.getId());
            nameTextField.setText(personTableData.getName());
            if (personTableData.getSex().equals("男")) {
                maleRadioButton.setSelected(true);
            } else if (personTableData.getSex().equals("女")) {
                femaleRadioButton.setSelected(true);
            }
            //RadioButton怎么设置值


        }

    }

}
