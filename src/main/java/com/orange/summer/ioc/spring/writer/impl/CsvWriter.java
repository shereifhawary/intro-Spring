package com.orange.summer.ioc.spring.writer.impl;

import java.util.List;

import com.orange.summer.ioc.spring.writer.Writer;

public class CsvWriter implements Writer {

    private String separator = ",";

    public boolean write(List<String[]> data) {
        System.out.println("I am CSV writer with separator = '" + this.separator + "'");

        int i;
        for (String[] line : data) {
            i = 0 ;
            for (String item : line) {
                System.out.print(item);
                if(i++ != line.length-1) {
                    System.out.print(separator);
                }
            }
            System.out.println();
        }

        System.out.println("Done CSV writer");

        return true;
    }

    public void setSeparator(String separator) {
        this.separator = separator;
    }

}
