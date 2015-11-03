package pool;

import resource.ResourcePool;

public class BasketPool extends ResourcePool<Basket>{
	

	
	public BasketPool(int nb){
		super(nb);
		this.setContentName("basket");
	}

	@Override
	protected Basket create() {
		// TODO Auto-generated method stub
		return new Basket();
	}


}
