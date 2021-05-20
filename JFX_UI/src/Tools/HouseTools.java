package Tools;

import BaseData.House;
import BaseData.HouseTableData;
import Data.HouseDao;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.util.List;

public class HouseTools {

    public void setHouseTableViewData(TableView tableView, ObservableList data,
                                      TableColumn<HouseTableData, String> addressColumn,  TableColumn<HouseTableData, String> priceColumn,
                                      TableColumn<HouseTableData, String> areaColumn,     TableColumn<HouseTableData, String> floorColumn,
                                      TableColumn<HouseTableData, String> stateColumn,    TableColumn<HouseTableData, String> clientColumn,
                                      TableColumn<HouseTableData, String> clientIdColumn, TableColumn<HouseTableData, String> decorationColumn,
                                      TableColumn<HouseTableData, String> hostNameColumn, TableColumn<HouseTableData, String> hostSexColumn,
                                      TableColumn<HouseTableData, String> hostIdColumn,   TableColumn<HouseTableData, String> hostPhoneColumn )
    {
        // 设置id列的数据
        addressColumn.setCellValueFactory(cellData -> cellData.getValue().addressProperty());

        priceColumn.setCellValueFactory(cellData -> cellData.getValue().priceProperty());

        areaColumn.setCellValueFactory(cellData -> cellData.getValue().areaProperty());

        floorColumn.setCellValueFactory(cellData -> cellData.getValue().floorProperty());

        stateColumn.setCellValueFactory(cellData -> cellData.getValue().stateProperty());

        clientColumn.setCellValueFactory(cellData -> cellData.getValue(). clientProperty());

        clientIdColumn.setCellValueFactory(cellData -> cellData.getValue().clientIdProperty());
        decorationColumn.setCellValueFactory(cellData -> cellData.getValue().decorationProperty());
        hostNameColumn.setCellValueFactory(cellData -> cellData.getValue().hostNameProperty());
        hostSexColumn.setCellValueFactory(cellData -> cellData.getValue().hostSexProperty());

        hostIdColumn.setCellValueFactory(cellData -> cellData.getValue(). hostIdProperty());

        hostPhoneColumn.setCellValueFactory(cellData -> cellData.getValue().hostPhoneProperty());


        tableView.setItems(data);
    }



    /**
     * 通过SQL从数据库表中查询图书数据并进行封装
     *
     * @param sql SQL语句
     * @return 返回ObservableList<BookBeanTableData>类型的数据
     */
    public ObservableList<HouseTableData> getHouseTableViewData(String sql) {
        HouseDao houseDao = new HouseDao();
        List list =houseDao.getRecordsDataBySql(sql);
        ObservableList<HouseTableData> data = FXCollections.observableArrayList();
        for (int i = 0; i < list.size(); i++) {
            House r = (House) list.get(i);
            HouseTableData td = new HouseTableData( r.getAddress(), r.getPrice(), r.getArea(),r.getFloor() , r.getState(),
                                                    r.getClient(), r.getClientId(),r.getDecoration(),r.getHostName(),
                                                    r.getHostSex(),r.getHostId(),r.getHostPhone()  );

            data.add(td);
        }
        return data;
    }

    public boolean isEmpty(String str) {
        return str == null || "".equals(str.trim());
    }


}
