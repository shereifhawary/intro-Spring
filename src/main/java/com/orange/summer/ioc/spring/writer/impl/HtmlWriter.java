package com.orange.summer.ioc.spring.writer.impl;

import java.util.List;

import com.orange.summer.ioc.spring.writer.Writer;

public class HtmlWriter implements Writer {

    public boolean write(List<String[]> data) {
        System.out.println("I am HTML writer");
        for (String[] line : data) {
            for (String item : line) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
        System.out.println("Done HTML writer");
        return true;
    }

}
