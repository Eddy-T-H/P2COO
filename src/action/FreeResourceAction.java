package action;

import resource.Resource;
import resource.ResourcePool;
import resource.ResourcefulUser;

public class FreeResourceAction<E extends Resource> extends ResourcePoolAction<E> {

	
	public FreeResourceAction(String message,ResourcePool<E> rp, ResourcefulUser<E> user){
		super(message, rp, user);
	}

	@Override
	public void doStep() {
		try{
			rp.freeResource(user.getResource());

		}catch(IllegalArgumentException e){
			System.out.println(" can't give back");
			return;
		}
		this.isFinished = true;
		System.out.println(this.getMessage());
	}


	
}
