package piscine;

import ressource.Resource;


public class Cubicle implements Resource {


	String description = "";
	
	@Override
	public String description() {
		return description;
	}

	public Cubicle(String description){
		this.description = description;
	}

		
		/**
		 */
		public Cubicle(){
		}

}
