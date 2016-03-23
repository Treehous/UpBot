package controller;

import java.util.ArrayList;
import java.util.List;

import model.WebList;


public class Controller {
	private static WebList model;
	

	public void setModel(WebList model) {
		this.model = model;
	}
		
	public static void addCommands() {
		
			doAddCommands();
		
	}
	public static void doAddCommands() {
		
		List<String> next = new ArrayList<String>();
		
		next.add("ping");
	    next.add("-n");
	    next.add("5");
	    next.add("8.8.8.8");
		model.setCommands(next);
	}
}
