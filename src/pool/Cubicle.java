package pool;

import resource.Resource;

public class Cubicle implements Resource{

	String description = "This is a Cubicle";
	
	public Cubicle(){
		
	}
	
	public Cubicle(String desci){
		this.description = desci;
	}
	
	public String description(){
		return this.description;
	}
}
