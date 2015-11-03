package resource;

public class ResourcefulUser<E extends Resource> {

	protected E resource;
	
	public E getResource(){
		return this.resource;
	}
	
	public void setResource(E res){
		this.resource = res;
	}
	
	public void resetResource(){
		this.resource = null;
	}
	
}
