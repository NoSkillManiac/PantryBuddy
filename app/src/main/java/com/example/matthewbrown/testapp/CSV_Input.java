package com.example.matthewbrown.testapp;

/**
 * Created by MatthewBrown on 3/3/2017.
 */

import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

public class CSV_Input {
    public Iterator itemIterator()
    {
    return null;
    }

    public void sendToCSV() throws IOException
    {
        FileWriter toCSV = new FileWriter("data.csv");
        Iterator i = itemIterator();
        while (i.hasNext())
        {
            FoodItem current = (FoodItem) i.next();
            toCSV.append(current.getItemName());
            toCSV.append(",");
            toCSV.append(String.valueOf(current.getAmount()));
            toCSV.append(",");
            toCSV.append(String.valueOf(current.getDaysLeft()));
            toCSV.append(",");
            toCSV.append(String.valueOf(current.getUsagePerDay()));
            toCSV.append("\n");
        }
        toCSV.flush();
        toCSV.close();
    }
}
