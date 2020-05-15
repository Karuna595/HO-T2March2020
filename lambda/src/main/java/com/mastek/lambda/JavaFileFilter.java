package com.mastek.lambda;

import java.io.File;
import java.io.FileFilter;

public class JavaFileFilter implements FileFilter {
	
	public boolean accept(File pathname) {
		
		 return pathname.getName().endsWith(".java");
	}
}
