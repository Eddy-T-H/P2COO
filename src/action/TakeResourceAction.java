package action;

import java.util.NoSuchElementException;

import resource.Resource;
import resource.ResourcePool;
import resource.ResourcefulUser;

public class TakeResourceAction<E extends Resource> extends ResourcePoolAction<E> {

	
	public TakeResourceAction(String message,ResourcePool<E> rp, ResourcefulUser<E> user){
		super(message, rp, user);
	}

	@Override
	public void doStep() {
		E ressource = null;
		try{
			ressource = (E) this.rp.provideResource();

		} catch(NoSuchElementException e){
			System.out.println(" can't take\n");
		}
		user.setResource(ressource);
		this.isFinished = true;
		System.out.println(""+this.getMessage());
	}



	
}
