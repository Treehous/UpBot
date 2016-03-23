package model;

import java.util.ArrayList;
import java.util.List;

import controller.Controller;

public class WebList {

	private Controller controller;

	
	private static List<String> commands = new ArrayList<String>();
	
	public WebList(){
				  
	  }
	
	public static void setCommands(List Commands) { 
		
		commands = Commands;
	}
	
	public static List getCommands() {
		return commands;
	}
	
	public void addCommands() {
		

		controller.doAddCommands();
	
}
	
}