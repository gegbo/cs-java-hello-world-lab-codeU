package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
      // I won't work!
      String version = System.getProperty("java.specification.version");
      return Double.parseDouble(version); 
    }

    public static void main(String[] args) {
	 // you can test the output of getVersion() here
    	System.out.println(getVersion());
    }
}
