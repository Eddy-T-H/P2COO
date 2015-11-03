package resource;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public abstract class ResourcePool<T extends Resource> {
	int numberResources;
	protected ArrayList<T> resources = new ArrayList<T>();
	protected ArrayList<T> usedResources = new ArrayList<T>();
	
	public ResourcePool(int nb){
		this.numberResources = nb;
		this.resources = new ArrayList<T>(this.numberResources);
		for(int i = 0; i<numberResources;i++){
			resources.add(this.create());
		}
	}

	protected abstract T create();
	
	public T provideResource() throws NoSuchElementException{
		if(resources.isEmpty()){
			throw new NoSuchElementException();
		}
		T resource = resources.get(0);
		usedResources.add(resource);
		resources.remove(0);
		return resource;
	}
	
	public void freeResource(T resource) throws IllegalArgumentException{
		if(!usedResources.contains(resource)){
			throw new IllegalArgumentException("Not part of this pool");
		}
		usedResources.remove(resource);
		resources.add(resource);
	}
	
}
