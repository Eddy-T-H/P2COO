package piscine;

import java.util.ArrayList;
import java.util.Collection;

import ressource.ResourcePool;


public class BasketPool extends ResourcePool<Cubicle> {
	
	public BasketPool(Collection<Cubicle> ressources) {
		super(ressources);
	}
	
	public BasketPool(int size){
		Collection<Cubicle> list = new ArrayList<Cubicle>();
		for (int i = 0; i < size ; i++){
			list.add(new Cubicle());
		}
		this.setRessources(list);
	}

}
