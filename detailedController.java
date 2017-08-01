package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class detailedController implements Initializable{
    // Define Table
    @FXML private TableView<Record> tableID; // setting up the big table report for detailed report
    @FXML public TableColumn Date;// for date column
    @FXML public TableColumn Open;// for open
    @FXML public TableColumn High;// for high
    @FXML public TableColumn Low;// for low
    @FXML public TableColumn Close;// for close
    @FXML public TableColumn Volume;// for volume
    @FXML public TableColumn AdjClose;// adj close


   @FXML LineChart<String, Number> LineChart; // instanciating lince chart


    public void showTalbe(String csv) throws Exception {
        ObservableList<Record> list = FXCollections.observableArrayList();

        XYChart.Series<String, Number> series = new XYChart.Series<String, Number>();

        // Setting out the Table
        Date.setCellValueFactory(new PropertyValueFactory("f1"));
        Open.setCellValueFactory(new PropertyValueFactory("f2"));
        High.setCellValueFactory(new PropertyValueFactory("f3"));
        Low.setCellValueFactory(new PropertyValueFactory("f4"));
        Close.setCellValueFactory(new PropertyValueFactory("f5"));
        Volume.setCellValueFactory(new PropertyValueFactory("f6"));
        AdjClose.setCellValueFactory(new PropertyValueFactory("f7"));

        csvReader csvReader = new csvReader();
        ArrayList<String[]> data = csvReader.getStockData(csv); //data use

        //Using For loop to parse data into the table
        for(int i = 1; i<data.size();i++){
            String[] a = data.get(i);
            list.add(new Record(a[0],a[1],a[2],a[3],a[4],a[5],a[6]));// index numbers for the different sets of data

        }
        for(int i = data.size()-1; i>1; i--){ //Reversing the line chart structure
            String[] a = data.get(i);
            series.getData().add(new XYChart.Data<String, Number>(a[0], toFloat(a[6])));
        }
        tableID.setItems(list);
        LineChart.getData().add(series);
        series.setName("Stock history Line chart");

    }
    // creating a small method which turn the string into a float
    public Float toFloat(java.lang.String value) throws Exception{
        Float floatNumber = Float.valueOf(value);
        return floatNumber;
    }

    // When company is selected in historyController, it is written onto a text file which is read by the following
    @Override
    public void initialize(URL url, ResourceBundle rb){
        try {
            BufferedReader bb = new BufferedReader(new FileReader("select.txt"));
            String csv = bb.readLine();
            try {
                showTalbe(csv);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }catch (Exception e){
            System.out.print(e);
        }

    }
    @FXML
    private javafx.scene.control.Button closeButton; // close button for navigation purposes

    @FXML
    private void closeButtonAction() {
        // get a handle to the stage
        Stage stage = (Stage) closeButton.getScene().getWindow();
        // do what you have to do
        stage.close();
    }
}
