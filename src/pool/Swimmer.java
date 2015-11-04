package pool;



import action.FreeResourceAction;
import action.PoolAction;
import action.TakeResourceAction;
import action.SeveralStepsAction;
import resource.ResourcePool;
import resource.ResourcefulUser;

public class Swimmer extends PoolAction{
	
	private ResourcefulUser<Basket> userPanier = new ResourcefulUser<Basket>();
	private ResourcefulUser<Cubicle> userCabine = new ResourcefulUser<Cubicle>();
	
	public Swimmer( String nom, ResourcePool<Basket> rpb,ResourcePool<Cubicle> rpc, int undressingTime, int swimmingTime, int dressingTime){
		this.setMessage(nom);
		this.add(new TakeResourceAction<Basket>(" is taking a Basket", rpb, userPanier));
		this.add(new TakeResourceAction<Cubicle>(" is taking a Cubicle", rpc, userCabine));
		this.add(new SeveralStepsAction(" is undressing", undressingTime));
		this.add(new FreeResourceAction<Cubicle>(" freing resource from CubiclePool", rpc, userCabine));
		this.add(new SeveralStepsAction(" is swimming", swimmingTime));
		this.add(new TakeResourceAction<Cubicle>(" is taking a Cubicle", rpc, userCabine));
		this.add(new SeveralStepsAction(" is dressing", dressingTime));
		this.add(new FreeResourceAction<Cubicle>(" freing resource from CubiclePool", rpc, userCabine));
		this.add(new FreeResourceAction<Basket>(" freing resource from BasketPool", rpb, userPanier));
	}



}
