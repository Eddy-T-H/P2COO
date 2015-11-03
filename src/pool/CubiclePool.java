package pool;

import resource.ResourcePool;

public class CubiclePool extends ResourcePool<Cubicle>{


	public CubiclePool(int nb) {
		super(nb);
		this.setContentName("cublicle");
	}

	@Override
	protected Cubicle create() {
		// TODO Auto-generated method stub
		return new Cubicle();
	}


}
