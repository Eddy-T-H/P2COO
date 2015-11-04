package pool;

import resource.ResourcePool;

public class CubiclePool extends ResourcePool<Cubicle>{


	public CubiclePool(int nb) {
		super(nb);
		this.setContentName("cubicle");
	}

	@Override
	protected Cubicle create() {
		// TODO Auto-generated method stub
		return new Cubicle();
	}


}
