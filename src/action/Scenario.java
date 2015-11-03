package action;


public class Scenario extends Scheduler {

	@Override
	public void doStep() {
		Action action;
		action = this.getActions().get(0);
		System.out.print(""+this.getMessage());
		action.doStep();
		if(action.isFinished()){
			this.getActions().remove(0);
		}
	}

	public void add(Action action){
		this.getActions().add(action);
	}
	
}
