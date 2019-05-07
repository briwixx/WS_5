package org.helloworldmvc.model;


public class DAOHelloWorld {
  

	
	private String FileName = "C://Users//etibr//git//WS_5//helloworldmaven/HelloWorld.txt";
	private DAOHelloWorld instance;
	private String HelloWorldMessage;
	
	
	public String getHelloWorldMessage() {
		return HelloWorldMessage;
	}
	public void setHelloWorldMessage(String helloWorldMessage) {
		HelloWorldMessage = helloWorldMessage;
	}
	public DAOHelloWorld getInstance() {
		return instance;
	}
	public void setInstance(DAOHelloWorld instance) {
		this.instance = instance;
	}
	
	public void readfile() {

	}
	
	
	
	}
		


    

