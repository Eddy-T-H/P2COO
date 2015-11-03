package action;


public abstract class Action {
	
	private String message ="";
	private ActionState currentState;
	
	private enum ActionState { 
		NOTSTARTED,FINISHED, NOTOVER; 
	}
	

	public Action(){
		
	}
	
	public Action(String m) {
		this.message = m;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	
	public ActionState getState() {
		// TODO Auto-generated method stub
		return this.currentState;
	}
	public void setState(ActionState newstate) {
		this.currentState = newstate;		
	}
	
	public boolean isFinished(){
		return this.getState() == ActionState.FINISHED;
	}
	
	protected boolean hasBegun(){
		if(this.getState() == ActionState.NOTSTARTED){
			return false;
		}else{
			return true;
		}
	}
	
	protected void setStateFinished(){
		this.setState(ActionState.FINISHED);
	}
	
	protected void setStatePending(){
		this.setState(ActionState.NOTOVER);
	}

	public void doActionStep(){
		if (this.isFinished()){
			throw new IllegalStateException("Action finished");
		}
		if(!this.hasBegun()){
			this.setStatePending();
		}
		this.doStep();
		System.out.println("étape");
		System.out.println(this.stopCondition());
		
		if(this.stopCondition()){
			System.out.println("fini");
			this.setStateFinished();
		}
	}

	
	public abstract void doStep();
	public abstract boolean stopCondition();
}
