package Controller;


//
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.chart.*;
//
public class ConstructorController {
    @FXML
    public PieChart pieChart;
    public PieChart culture;
    public BarChart income;
    //
    public void init(){
        ObservableList<PieChart.Data> pieChartData =
                FXCollections.observableArrayList(
                        new PieChart.Data("新生婴儿", 10),
                        new PieChart.Data("青少年", 25),
                        new PieChart.Data("成年", 30),
                        new PieChart.Data("中年", 25),
                        new PieChart.Data("老年", 10));
        pieChart.setData(pieChartData);
        pieChart.setTitle("年龄结构");
    }
    //
    public void wenhua(Event event) {
        ObservableList<PieChart.Data> cultureData =
                FXCollections.observableArrayList(
                        new PieChart.Data("小学",10),
                        new PieChart.Data("初中",10),
                        new PieChart.Data("高中",10),
                        new PieChart.Data("大专",10),
                        new PieChart.Data("本科", 10),
                        new PieChart.Data("硕士",10),
                        new PieChart.Data("博士",10));
        culture.setData(cultureData);
        culture.setTitle("文化结构");
    }
    //
    public void shouru(Event event) {
        final CategoryAxis xAxis = (CategoryAxis) income.getXAxis();
        final NumberAxis yAxis = (NumberAxis) income.getYAxis();
        xAxis.setLabel("收入范围");
        yAxis.setLabel("人数");
        final String austria = "1000一下";
        final String brazil = "1000-2000";
        final String france = "2000-3000";
        final String italy = "3000-4000";
        final String usa = "4000-6000";
        final String hd = "6000以上";
        XYChart.Series<String, Double> series1 = new XYChart.Series<>();
        series1.getData().add(new XYChart.Data<>(austria,4000.45));
        series1.getData().add(new XYChart.Data<>(brazil,4000.45));
        series1.getData().add(new XYChart.Data<>(france,4000.45));
        series1.getData().add(new XYChart.Data<>(italy,4000.45));
        series1.getData().add(new XYChart.Data<>( usa ,4000.45));
        series1.getData().add(new XYChart.Data<>( hd ,4000.45));
        income.getData().add(series1);
        income.setTitle("收入结构");
        //
    }
}
