package test;

import java.io.Serializable;

public class Apple implements Serializable{
	private String name;
	public Apple(){
		
	}
	public Apple(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
