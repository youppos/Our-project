package Tools;

import BaseData.Person;
import BaseData.PersonTableData;
import Data.PersonDao;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.util.List;


public class PersonTools {



    public void setPersonTableViewData(TableView tableView, ObservableList data, TableColumn<PersonTableData, String> idColumn, TableColumn<PersonTableData, String> nameColumn, TableColumn<PersonTableData, String> sexColumn, TableColumn<PersonTableData, String> ageColumn, TableColumn<PersonTableData, String> adressColumn, TableColumn<PersonTableData, String> wenhuaColumn, TableColumn<PersonTableData, String> incomeColumn, TableColumn<PersonTableData, String> importantColumn) {
        // 设置id列的数据
        idColumn.setCellValueFactory(cellData -> cellData.getValue().idProperty());
        // 设置图书名称列的数据
        nameColumn.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
        // 设置图书作者列的数据
        sexColumn.setCellValueFactory(cellData -> cellData.getValue().sexProperty());
        // 设置图书作者性别列的数据
        sexColumn.setCellValueFactory(cellData -> cellData.getValue().ageProperty());
        // 设置图书价格列的数据
        adressColumn.setCellValueFactory(cellData -> cellData.getValue().wenhuaProperty());
        // 设置图书描述列的数据
        wenhuaColumn.setCellValueFactory(cellData -> cellData.getValue().incomeProperty());
        // 设置图书类别列的数据
        incomeColumn.setCellValueFactory(cellData -> cellData.getValue().importantProperty());
        importantColumn.setCellValueFactory(cellData -> cellData.getValue().importantProperty());
        // 将数据设置到表格视图
        tableView.setItems(data);
    }



    /**
     * 通过SQL从数据库表中查询图书数据并进行封装
     *
     * @param sql SQL语句
     * @return 返回ObservableList<BookBeanTableData>类型的数据
     */
    public ObservableList<PersonTableData> getPersonTableViewData(String sql) {
        PersonDao personDao = new  PersonDao();
        List list = personDao.getRecordsDataBySql(sql);
        ObservableList<PersonTableData> data = FXCollections.observableArrayList();
        for (int i = 0; i < list.size(); i++) {
            Person r = (Person) list.get(i);
           PersonTableData td = new PersonTableData(r.getId(), r.getName(), r.getSex(),String.valueOf(r.getAge()) , r.getAdress(),String.valueOf(r.getWenhua()), r.getIncome(), String.valueOf(r.getImportant()));
            data.add(td);
        }
        return data;
    }

    public boolean isEmpty(String str) {
        return str == null || "".equals(str.trim());
    }

    //##################

}
