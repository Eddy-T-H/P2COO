package action;

import java.util.ArrayList;

public abstract class Scheduler extends Action {
	protected ArrayList<Action> actions = new ArrayList<Action>();
	protected int indexCurrentAction = 0;
	
	public int incrementIndexCurrentAction(){
		int currentindex= this.getIndexCurrentAction();
		this.setIndexCurrentAction(this.indexAfter());
		return currentindex;
	}
	
	public int decrementIndexCurrentAction(){
		int currentindex= this.getIndexCurrentAction();
		this.setIndexCurrentAction(this.indexBefore());
		return currentindex;
	}
	
	public ArrayList<Action> getActions() {
		return actions;
	}

	public void setActions(ArrayList<Action> actions) {
		this.actions = actions;
	}

	public int getIndexCurrentAction() {
		return indexCurrentAction;
	}

	public void setIndexCurrentAction(int indexCurrentAction) {
		this.indexCurrentAction = indexCurrentAction;
	}

	
	protected int indexBefore(){
		int res;
		if(this.indexCurrentAction == 0){
			res = this.actions.size()-1;
		}else {
			res = this.indexCurrentAction - 1;
		}
		return res;
	}
	
	protected int indexAfter(){
		int res;
		if(this.indexCurrentAction == this.actions.size()-1){
			res = 0;
		}else {
			res = this.indexCurrentAction + 1;
		}
		return res;
	}
	
	public boolean stopCondition() {
		System.out.println("stopCondition scheduler" + actions.isEmpty());
		return actions.isEmpty();
		
	}
	
	public abstract void add(Action action);
	@Override
	public abstract void doStep();
}
