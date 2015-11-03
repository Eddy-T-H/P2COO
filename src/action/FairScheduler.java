package action;


public class FairScheduler extends Scheduler {

	@Override
	public void doStep() {
		Action action;
		action = this.getActions().get(this.incrementIndexCurrentAction());
		action.doActionStep();
		if(action.isFinished()){
			this.getActions().remove(action);
			this.decrementIndexCurrentAction();
		}
		System.out.print(this.getMessage());
	}
	
	public void add(Action action){
		this.getActions().add(this.getIndexCurrentAction(), action);
		this.incrementIndexCurrentAction();
	}
	

}
