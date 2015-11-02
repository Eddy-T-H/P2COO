package ressource;

import action.Action;


public class TakeResourceAction<E extends Resource> extends Action {

	private ResourcefulUser<E> user;
	private ResourcePool<E> gestionnaire; 
	
	public TakeResourceAction(String message, ResourcePool<E> gestionnaire, ResourcefulUser<E> user){
		super(message);
		this.user = user;
		this.gestionnaire = gestionnaire;
	}
	
	private boolean isOver = false;
	
	@Override
	public void internalStep() {
		E ressource;
		try {
			ressource = gestionnaire.prendreRessource();
		} catch (NoSuchElementException e) {
			System.out.print(" ne peut pas prendre\n");
			return;
		}
		user.setRessource(ressource);
		isOver = true;
		System.out.print(""+this.getMessage());
	}

	@Override
	public boolean stopCondition() {
		return isOver;
	}

}
