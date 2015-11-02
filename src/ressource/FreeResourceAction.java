package ressource;

import action.Action;


public class FreeResourceAction<E extends Resource> extends Action {

	private ResourcefulUser<E> user;
	private ResourcePool<E> gestionnaire; 
	
	public FreeResourceAction(String message, ResourcePool<E> gestionnaire, ResourcefulUser<E> user){
		super(message);
		this.user = user;
		this.gestionnaire = gestionnaire;
	}
	
	private boolean isFinished = false;
	
	@Override
	public void internalStep() {
		try {
			gestionnaire.libererRessource(user.getRessource());
		} catch (IllegalArgumentException e) {
			System.out.print(" ne peut pas rendre\n");
			return;
		}
		isFinished = true;
		System.out.print(""+this.getMessage());
	}

	@Override
	public boolean stopCondition() {
		return isFinished;
	}

}
