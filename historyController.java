package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class historyController implements Initializable {
    @FXML
    ListView<String> stockList;

    @FXML
    public TableView<SideView> briefSum;// Setting up table for brief summary
    @FXML
    public TableColumn stockSymbol;// Setting up table column for shareprice
    @FXML
    public TableColumn companyName;// Setting up table column for shareprice
    @FXML
    public TableColumn sharePrice; // Setting up table column for shareprice


    @Override // Hardcoding the company names into a list which is then picked by view company, More details and to generate reports
    public void initialize(URL location, ResourceBundle resource) {
        ObservableList<String> items = stockList.getItems();// Drop Down list containing Company names which are hard coded
        items.addAll("Ashtead Group plc", "Antofagasta plc", "BAE Systems plc", "British American Tobacco plc",
                "Coca-Cola HBC AG", "Carnival plc", "Centrica plc", "Compass Group plc", "Experian plc",
                "EasyJet plc", "GKN Plc", "Mediclinic Internationla plc", "Provident Financial plc",
                "Paddy Power Betfair plc", "Prudential plc", "Persimmon plc", "Reckitt Benckiser Group plc",
                "Royal Dutch Shell plc", "Rolls-Royce Holdings plc", "Schroders plc", "Shire plc",
                "Sky plc", "SSE plc", "St. James's Place plc", "Tesco plc", "TUI AG", "Vodafone Group plc",
                "Worldpay Group plc");

    }


    @FXML
    public void viewData() throws Exception {
        //Created a method to look for the selected company name in observable list
        // Created a For loop that look for the matching name in .getSelectedItems
        // Once For-loop identifies Matching company Name, The symbol is changed a
        ObservableList<String> list = stockList.getSelectionModel().getSelectedItems(); // Selected item in list
            csvReader csvReader = new csvReader(); // Csv reader to read csv file
            String csvFile = new String();
            String symbol = new String();
            String lsp = new String();
            for (String i : list) {
                if (i.equals("Ashtead Group plc")) { // if company name exists
                    symbol = "AHT.L"; //
                    csvFile = symbol.replace(".L", ".csv");// replace symbol .l with .csv to get company report file.

                }
                if (i.equals("Antofagasta plc")) {
                    symbol = "ANTO.L";
                    csvFile = symbol.replace(".L", ".csv");
                }

                if (i.equals("BAE Systems plc")) {
                    symbol = "BA.L";
                    csvFile = symbol.replace(".L", ".csv");
                }

                if (i.equals("British American Tobacco plc")) {
                    symbol = "BATS.L";
                    csvFile = symbol.replace(".L", ".csv");
                }

                if (i.equals("Coca-Cola HBC AG")) {
                    symbol = "CCH.L";
                    csvFile = symbol.replace(".L", ".csv");
                }

                if (i.equals("Carnival plc")) {
                    symbol = "CCL.L";
                    csvFile = symbol.replace(".L", ".csv");
                }

                if (i.equals("Centrica plc")) {
                    symbol = "CNA.L";
                    csvFile = symbol.replace(".L", ".csv");
                }

                if (i.equals("Compass Group plc")) {
                    symbol = "CPG.L";
                    csvFile = symbol.replace(".L", ".csv");
                }

                if (i.equals("Experian plc")) {
                    symbol = "EXPN.L";
                    csvFile = symbol.replace(".L", ".csv");
                }

                if (i.equals("EasyJet plc")) {
                    symbol = "EZJ.L";
                    csvFile = symbol.replace(".L", ".csv");

                }

                if (i.equals("GKN Plc")) {
                    symbol = "GKN.L";
                    csvFile = symbol.replace(".L", ".csv");
                }

                if (i.equals("Mediclinic Internationla plc")) {
                    symbol = "MDC.L";
                    csvFile = symbol.replace(".L", ".csv");
                }

                if (i.equals("Provident Financial plc")) {
                    symbol = "PFG.L";
                    csvFile = symbol.replace(".L", ".csv");
                }

                if (i.equals("Paddy Power Betfair plc")) {
                    symbol = "PPB.L";
                    csvFile = symbol.replace(".L", ".csv");
                }

                if (i.equals("Prudential plc")) {
                    symbol = "PRU.L";
                    csvFile = symbol.replace(".L", ".csv");
                }

                if (i.equals("Persimmon plc")) {
                    symbol = "PSN.L";
                    csvFile = symbol.replace(".L", ".csv");
                }

                if (i.equals("Reckitt Benckiser Group plc")) {
                    symbol = "RB.L";
                    csvFile = symbol.replace(".L", ".csv");
                }

                if (i.equals("Royal Dutch Shell plc")) {
                    symbol = "RDSA.L";
                    csvFile = symbol.replace(".L", ".csv");
                }

                if (i.equals("Rolls-Royce Holdings plc")) {
                    symbol = "RR.L";
                    csvFile = symbol.replace(".L", ".csv");
                }

                if (i.equals("Schroders plc")) {
                    symbol = "SDR.L";
                    csvFile = symbol.replace(".L", ".csv");
                }

                if (i.equals("Shire plc")) {
                    symbol = "SHP.L";
                    csvFile = symbol.replace(".L", ".csv");
                }

                if (i.equals("Sky plc")) {
                    symbol = "SKY.L";
                    csvFile = symbol.replace(".L", ".csv");
                }

                if (i.equals("SSE plc")) {
                    symbol = "SSE.L";
                    csvFile = symbol.replace(".L", ".csv");
                }

                if (i.equals("St. James's Place plc")) {
                    symbol = "STJ.L";
                    csvFile = symbol.replace(".L", ".csv");
                }

                if (i.equals("Tesco plc")) {
                    symbol = "TSCO.L";
                    csvFile = symbol.replace(".L", ".csv");
                }

                if (i.equals("TUI AG")) {
                    symbol = "TUI.L";
                    csvFile = symbol.replace(".L", ".csv");
                }

                if (i.equals("Vodafone Group plc")) {
                    symbol = "VOD.L";
                    csvFile = symbol.replace(".L", ".csv");
                }

                if (i.equals("Worldpay Group plc")) {
                    symbol = "WPG.L";
                    csvFile = symbol.replace(".L", ".csv");
                }


                if (i.equals(null)){ // in an attempt to lay a popup when user doesnt select company name
                    Alert infoPop = new Alert(Alert.AlertType.ERROR);
                    infoPop.setTitle("Please select Company");
                    infoPop.setHeaderText("Error");
                    infoPop.setContentText("Please select Company!!");
                    infoPop.showAndWait();
                }





            ArrayList ls = csvReader.getStockData(csvFile); // store the data from CSV reader into Array list

        }
            // Function to write selected company into a txt file to be opened in detailedController
        System.out.print(csvFile);
        try {
            File file = new File("select.txt");
            BufferedWriter out = new BufferedWriter(new FileWriter(file));
            out.write(csvFile);
            out.close();
        } catch (Exception e) {
            System.out.print(e);
        }
        // when this button is pressed, it also loads the next scene detailedData

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("detailedData.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Historical Stock Data");
            stage.setScene(new Scene(root1));
            stage.show();

        } catch (Exception e) {
            System.out.print("We Got This " + e);
        }
    }

    //View company brief, Company symbol, Company name and latest stock
    @FXML
    private void viewcompany() {
        ObservableList<String> list = stockList.getSelectionModel().getSelectedItems(); // getting the stored company name in list
        csvReader csvReader = new csvReader();
        String csvFile = null;
        String symbol = null;
        String lsp = null;
        for (String i : list) {

            // hardcoded the company names which are stored in the list, hardcoded latest share price too
            //

            if (i.equals("Ashtead Group plc")) { //If statement to find if company name exists then print symbol and share price
                symbol = "AHT.L";
                lsp = "1644";
            }

            if (i.equals("Antofagasta plc")) {
                symbol = "ANTO.L";
                lsp = "866";
            }

            if (i.equals("BAE Systems plc")) {
                symbol = "BA.L";
                lsp = "612";
            }

            if (i.equals("British American Tobacco plc")) {
                symbol = "BATS.L";
                lsp = "5008";
            }

            if (i.equals("Coca-Cola HBC AG")) {
                symbol = "CCH.L";
                lsp = "1826";
            }

            if (i.equals("Carnival plc")) {
                symbol = "CCL.L";
                lsp = "4301";
            }

            if (i.equals("Centrica plc")) {
                symbol = "CNA.L";
                lsp = "234";
            }

            if (i.equals("Compass Group plc")) {
                symbol = "CPG.L";
                lsp = "1445";
            }

            if (i.equals("Experian plc")) {
                symbol = "EXPN.L";
                lsp = "1565";
            }

            if (i.equals("EasyJet plc")) {
                symbol = "EZJ.L";
                lsp = "893.7";

            }

            if (i.equals("GKN Plc")) {
                symbol = "GKN.L";
                lsp = "340.9";
            }

            if (i.equals("Mediclinic Internationla plc")) {
                symbol = "MDC.L";
                lsp = "835.5";
            }

            if (i.equals("Provident Financial plc")) {
                symbol = "PFG.L";
                lsp = "2779";
            }

            if (i.equals("Paddy Power Betfair plc")) {
                symbol = "PPB.L";
                lsp = "8700";
            }

            if (i.equals("Prudential plc")) {
                symbol = "PRU.L";
                lsp = "1620.5";
            }

            if (i.equals("Persimmon plc")) {
                symbol = "PSN.L";
                lsp = "1976";
            }

            if (i.equals("Reckitt Benckiser Group plc")) {
                symbol = "RB.L";
                lsp = "6930";
            }

            if (i.equals("Royal Dutch Shell plc")) {
                symbol = "RDSA.L";
                lsp = "5008";
            }

            if (i.equals("Rolls-Royce Holdings plc")) {
                symbol = "RR.L";
                lsp = "732.5";
            }

            if (i.equals("Schroders plc")) {
                symbol = "SDR.L";
                lsp = "3041";
            }

            if (i.equals("Shire plc")) {
                symbol = "SHP.L";
                lsp = "4595";
            }

            if (i.equals("Sky plc")) {
                symbol = "SKY.L";
                lsp = "1000";
            }

            if (i.equals("SSE plc")) {
                symbol = "SSE.L";
                lsp = "1537";
            }

            if (i.equals("St. James's Place plc")) {
                symbol = "STJ.L";
                lsp = "1083";
            }

            if (i.equals("Tesco plc")) {
                symbol = "TSCO.L";
                lsp = "198";
            }

            if (i.equals("TUI AG")) {
                symbol = "TUI.L";
                lsp = "1095";
            }

            if (i.equals("Vodafone Group plc")) {
                symbol = "VOD.L";
                lsp = "197.7";
            }

            if (i.equals("Worldpay Group plc")) {
                symbol = "WPG.L";
                lsp = "272";
            }
        }

        ObservableList<SideView> sum = FXCollections.observableArrayList(); // Side table

        String companyName1 = stockList.getSelectionModel().getSelectedItems().get(0);// Getting selected item in list


        sum.add(new SideView(symbol, companyName1, lsp));// Printing the symbol company name and latest share price

        //Setting the fields.
        stockSymbol.setCellValueFactory(new PropertyValueFactory<>("f1"));
        companyName.setCellValueFactory(new PropertyValueFactory<>("f2"));
        sharePrice.setCellValueFactory(new PropertyValueFactory<>("f3"));

        briefSum.setItems(sum); // setting the items into the list
    }

    // Close the scene using and going back to main menu
    @FXML
    private void generateReport() throws Exception {

        ObservableList<String> list = stockList.getSelectionModel().getSelectedItems();
        csvReader csvReader = new csvReader();
        String csvFile = null; // this will be used to parse the selected data into the csv reader
        String symbol = null;
        String lsp = null;
        for (String i : list) {

            // hardcoded the company names which are stored in the list, hardcoded latest share price too


            if (i.equals("Ashtead Group plc")) { //If statement to find if company name exists then print symbol and share price
                symbol = "AHT.L";
                lsp = "1644";
            }

            if (i.equals("Antofagasta plc")) {
                symbol = "ANTO.L";
                lsp = "866";
            }

            if (i.equals("BAE Systems plc")) {
                symbol = "BA.L";
                lsp = "612";
            }

            if (i.equals("British American Tobacco plc")) {
                symbol = "BATS.L";
                lsp = "5008";
            }

            if (i.equals("Coca-Cola HBC AG")) {
                symbol = "CCH.L";
                lsp = "1826";
            }

            if (i.equals("Carnival plc")) {
                symbol = "CCL.L";
                lsp = "4301";
            }

            if (i.equals("Centrica plc")) {
                symbol = "CNA.L";
                lsp = "234";
            }

            if (i.equals("Compass Group plc")) {
                symbol = "CPG.L";
                lsp = "1445";
            }

            if (i.equals("Experian plc")) {
                symbol = "EXPN.L";
                lsp = "1565";
            }

            if (i.equals("EasyJet plc")) {
                symbol = "EZJ.L";
                lsp = "893.7";

            }

            if (i.equals("GKN Plc")) {
                symbol = "GKN.L";
                lsp = "340.9";
            }

            if (i.equals("Mediclinic Internationla plc")) {
                symbol = "MDC.L";
                lsp = "835.5";
            }

            if (i.equals("Provident Financial plc")) {
                symbol = "PFG.L";
                lsp = "2779";
            }

            if (i.equals("Paddy Power Betfair plc")) {
                symbol = "PPB.L";
                lsp = "8700";
            }

            if (i.equals("Prudential plc")) {
                symbol = "PRU.L";
                lsp = "1620.5";
            }

            if (i.equals("Persimmon plc")) {
                symbol = "PSN.L";
                lsp = "1976";
            }

            if (i.equals("Reckitt Benckiser Group plc")) {
                symbol = "RB.L";
                lsp = "6930";
            }

            if (i.equals("Royal Dutch Shell plc")) {
                symbol = "RDSA.L";
                lsp = "5008";
            }

            if (i.equals("Rolls-Royce Holdings plc")) {
                symbol = "RR.L";
                lsp = "732.5";
            }

            if (i.equals("Schroders plc")) {
                symbol = "SDR.L";
                lsp = "3041";
            }

            if (i.equals("Shire plc")) {
                symbol = "SHP.L";
                lsp = "4595";
            }

            if (i.equals("Sky plc")) {
                symbol = "SKY.L";
                lsp = "1000";
            }

            if (i.equals("SSE plc")) {
                symbol = "SSE.L";
                lsp = "1537";
            }

            if (i.equals("St. James's Place plc")) {
                symbol = "STJ.L";
                lsp = "1083";
            }

            if (i.equals("Tesco plc")) {
                symbol = "TSCO.L";
                lsp = "198";
            }

            if (i.equals("TUI AG")) {
                symbol = "TUI.L";
                lsp = "1095";
            }

            if (i.equals("Vodafone Group plc")) {
                symbol = "VOD.L";
                lsp = "197.7";
            }

            if (i.equals("Worldpay Group plc")) {
                symbol = "WPG.L";
                lsp = "272";
            }
        }
        // Using the same list selection method to parse the csv file
        csvFile = symbol.replace(".L", ".csv");

        String companyName = stockList.getSelectionModel().getSelectedItem(); // getting item selected in list

        int number = stockList.getSelectionModel().getSelectedIndex();

        ArrayList<String[]> data = csvReader.getStockData(csvFile); // getting the data into an arraylist from csvreader

        Float average, highest, lowest; // Setting the average highest and lowest share value objects

        average=highest=lowest= Float.parseFloat(data.get(1)[4]);

        String highDate, lowDate;// Instantiating high date and low date

        highDate=lowDate=data.get(1)[0];// getting the lowest low date

//
        for(int i = 2; i<data.size();i++){ //

            if (highest<Float.parseFloat(data.get(i)[4])){// parsing any String into a float
                highest = Float.parseFloat(data.get(i)[4]);
                highDate = data.get(i)[0];
            }
            if (lowest>Float.parseFloat(data.get(i)[4])){
                lowest=Float.parseFloat(data.get(i)[4]);
                lowDate = data.get(i)[0];
            }
            average = average+Float.parseFloat(data.get(i)[4]);
        }
        // Calculating the average share price to put into report which is being saved into a text file
        average = average/data.size();
        File file = new File("src/sample/report.txt");
        FileOutputStream out = new FileOutputStream(file,true); // using a fileStream to store the data
        String report = "\nNumber: "+number+"\n"// storing index number
                +"Stock symbol:"+symbol+"\n"// storing symbol
                +"Company Name: "+companyName+"\n"// storing company name
                +"Highest: "+highDate+" "+highest+"\n"// storing highest stock date
                + "Lowest: "+lowDate+" "+lowest+"\n"// storing lowest stock data
                +"Average Close: "+ average+"Close: "+ lsp+"\n"; // storing average close date
        out.write(report.getBytes());
        out.close();// close once done

        // If report successfully generated a popup will appear
        Alert infoPop = new Alert(Alert.AlertType.INFORMATION);
        infoPop.setTitle("Success");
        infoPop.setHeaderText("Your report has been generated succesfully");
        infoPop.setContentText("your report is saved into a txt File");
        infoPop.showAndWait();
    }
    // instantiating a button for the main menu button to close the screen once done
    @FXML
    private javafx.scene.control.Button closeButton;

    @FXML
    private void closeButtonAction() {
        // get a handle to the stage
        Stage stage = (Stage) closeButton.getScene().getWindow();
        // do what you have to do
        stage.close();
    }
}




