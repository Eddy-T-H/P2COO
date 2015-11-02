package action;


public class FairScheduler extends Ordonnanceur {

	@Override
	public void internalStep() {
		Action action;
		action = this.getActions().get(this.incrementIndex());
		action.doStep();
		if(action.isFinished()){
			this.getActions().remove(action);
			this.decrementIndex();
		}
		System.out.print(""+this.getMessage());
	}
	
	/**
	 */
	public void add(Action action){
		this.getActions().add(this.getCurrentActionIndex(), action);
		this.incrementIndex();
	}
	
}
