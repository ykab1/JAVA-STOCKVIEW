package sample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;


public class csvReader { // This is to read the CSV files and to store them into an array

    public ArrayList<String[]> getStockData(String entry) throws Exception { // Returns the data into array

        ArrayList<String[]> data = new ArrayList<>();// creating arraylist
        BufferedReader br = new BufferedReader(new FileReader("./src/sample/StockData/" + entry));// entry is the string being parsed
        String line;
        while ((line = br.readLine()) != null) { // While loop if theres a line read it
            String[] b = line.split(",");// splliting by any commas in the CSV
//            System.out.println(b[6]);
            data.add(b);// Add the the split info to the data array
        }

        br.close(); return data; // The data when called into array
    }
}






