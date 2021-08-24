package com.myfirstmavenproject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App 
{
	private static final Logger LOG = LogManager.getLogger(App.class); 
    public static void main( String[] args )
    {
    	LOG.info("Hello java");
       // System.out.println( "Hello World!" );
    }
}

