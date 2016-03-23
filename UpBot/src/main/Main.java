package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import model.WebList;
import controller.Controller;
public class Main {

private static WebList model;
private static Controller controller;
	public static void main(String args[]) throws IOException
	  {
		
	    // create the ping command as a list of strings
	    Main ping = new Main();

	    Controller.addCommands();

	    ping.doCommand(WebList.getCommands() );
	  }

	  public void doCommand(List<String> command) 
	  throws IOException
	  {
	    String s = null;

	    ProcessBuilder pb = new ProcessBuilder(command);
	    Process process = pb.start();

	    BufferedReader stdInput = new BufferedReader(new InputStreamReader(process.getInputStream()));
	    BufferedReader stdError = new BufferedReader(new InputStreamReader(process.getErrorStream()));

	    //print output
	    while ((s = stdInput.readLine()) != null)
	    {
	      System.out.println(s);
	    }

	    //print errors
	    
	    while ((s = stdError.readLine()) != null)
	    {
	      System.out.println("Error: " + s);
	    }
	  }
}