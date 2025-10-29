package com.example.app;

public class DataProcessor {
    private String[] data = {"item1", "item2", "item3"};
    
    public String processData(int index) {
        // Bug: ArrayIndexOutOfBoundsException - no bounds checking
        return data[index].toLowerCase();
    }
    
    public void setData(String[] newData) {
        this.data = newData;
    }
    
    public int getDataLength() {
        return data.length;
    }
}
