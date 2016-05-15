package com.orange.summer.ioc.spring.reader;

import com.orange.summer.ioc.spring.writer.Writer;
import com.orange.summer.ioc.spring.writer.impl.CsvWriter;

import java.util.ArrayList;
import java.util.List;

public class Reader {

    private Writer writer = new CsvWriter();


    public void readData() {
        /************************
         *
         *
         *  Some logic to read files
         *
         *
         * ***/
        List<String[]> data = new ArrayList<String[]>();

        data.add(new String[] {
                "name",
                "age",
                "company",
                "track"
        });

        data.add(new String[] {
                "shereif",
                "27",
                "orange",
                "sw"
        });


        writer.write(data);
    }

}
