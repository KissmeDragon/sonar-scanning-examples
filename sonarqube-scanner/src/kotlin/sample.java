
package com.mkyong;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

	Properties prop = new Properties();

	// set key and value
	prop.setProperty("db.url", "localhost");
	prop.setProperty("db.user", "mkyong");
	prop.setProperty("db.password", "password");

	// save a properties file
	prop.store(outputStream, "");

	// load a properties file
	prop.load(inputStream)

	// get value by key
	prop.getProperty("db.url");
    prop.getProperty("db.user");
    prop.getProperty("db.password");

	// get all keys
	prop.keySet();

	// print everything
	prop.forEach((k, v) -> System.out.println("Key : " + k + ", Value : " + v));
/*  fun vulnerableFunction() {
    val password = "password" // Vulnerability - hardcoded password
    if (!password.isNull()) println("null password!")
  }

  // Code Smell - Empty function
  fun emptyFunction() {
  }

  fun buggyFunction(str: String){
    if (str == "hello"){
      println("Hello!")
    } else if (str == "goodbye"){
      println("Goodbye!")
    } else if (str == "hello"){ // Bug - Duplicate condition
      println("Hello again!")
    }
  }*/
