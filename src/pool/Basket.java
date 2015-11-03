package pool;

import resource.Resource;

public class Basket implements Resource{

	String description = "This is a Basket";
	
	public Basket(){}

	public Basket(String description){
		this.description = description;
	}
	
	@Override
	public String description() {
		// TODO Auto-generated method stub
		return description;
	}


	
}
