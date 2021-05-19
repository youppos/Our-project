package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;

public class Tools {




    public void addComboBoxItems(ComboBox comboBox, Object[] items) {
        // 清除下列列表框中的所有选项
        comboBox.getItems().clear();
        ObservableList options = FXCollections.observableArrayList(items);
        // 添加下拉列表项
        comboBox.setItems(options);
    }
}
