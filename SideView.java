package sample;


import javafx.beans.property.SimpleStringProperty;

public class SideView { // Setting up table properties for the brief summary on history controller page

        public SideView (String symbol , String companyName, String Latest){
            f1 = new SimpleStringProperty(symbol);
            f2 = new SimpleStringProperty(companyName);
            f3 = new SimpleStringProperty(Latest);
        }

        private SimpleStringProperty f1, f2, f3;

        public String getF1() {
            return f1.get();
        }// first column for symbol

        public String getF2() {
            return f2.get();
        }// Second column for company name

        public String getF3() {
            return f3.get();
        }// Third column for latest price


    }
