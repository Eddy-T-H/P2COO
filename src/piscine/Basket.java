package piscine;

import ressource.Resource;



public class Basket implements Resource {

	
	String description = "";
	
	@Override
	public String description() {
		return description;
	}

	public Basket(String description){
		this.description = description;
	}

		
		/**
		 */
		public Basket(){
		}

}
