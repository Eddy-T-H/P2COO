package piscine;

import java.util.ArrayList;
import java.util.Collection;

import ressource.ResourcePool;


public class CubiclePool extends ResourcePool<Basket> {
	
	public CubiclePool(Collection<Basket> ressources) {
		super(ressources);
	}
	
	public CubiclePool(int size){
		Collection<Basket> list = new ArrayList<Basket>();
		for (int i = 0; i < size ; i++){
			list.add(new Basket());
		}
		this.setRessources(list);
	}

}
