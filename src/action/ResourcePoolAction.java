package action;

import resource.Resource;
import resource.ResourcePool;
import resource.ResourcefulUser;

public abstract class ResourcePoolAction<T extends Resource> extends Action{
	
	protected boolean isFinished = false;
	protected ResourcefulUser<T> user;
	protected ResourcePool<T> rp;
	
	public ResourcePoolAction(String m, ResourcePool<T> nrp, ResourcefulUser<T> nrfu){
		super(m);
		this.user = nrfu;
		this.rp = nrp;
	}
	
	public boolean isFinished(){
		return this.isFinished;
	}
	
	public abstract void doStep();
	
	public boolean stopCondition() {
		return isFinished;
	}
	
}
