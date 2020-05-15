package com.mastek.lambda;

import java.io.File;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {

		File dir = new File("d:/temp");
		JavaFileFilter javaFileFilter = new JavaFileFilter();
		File[] javaFiles = dir.listFiles(javaFileFilter);
		for (File file : javaFiles) {
			System.out.println(file.getName());
		}
		
		TextFileFilter textFileFilter = new TextFileFilter();
		File[] textFiles = dir.listFiles(textFileFilter);
		for (File file : textFiles) {
			System.out.println(file.getName());
		}

	}
}
