package com.orange.summer.ioc.spring.app;

import com.orange.summer.ioc.spring.reader.Reader;

public class Main {

	public static void main(String... args) {
		
		Reader reader = new Reader();
		reader.readData();
	}
}
