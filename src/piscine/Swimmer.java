package piscine;

import ressource.FreeResourceAction;
import ressource.TakeResourceAction;
import ressource.ResourcefulUser;
import action.Scenario;
import action.Waiting;

public class Swimmer extends Scenario{
	
	private ResourcefulUser<Basket> userPanier = new ResourcefulUser<Basket>();
	private ResourcefulUser<Cubicle> userCabine = new ResourcefulUser<Cubicle>();
	
	public Swimmer( String nom, CubiclePool gestionnaireDePaniers,BasketPool gestionnaireDeCabines, int undressingTime, int swimmingTime, int dressingTime){
		this.setMessage(nom);
		this.add(new TakeResourceAction<Basket>(" is taking a Basket\n", gestionnaireDePaniers, userPanier));
		this.add(new TakeResourceAction<Cubicle>(" is taking a Cubicle\n", gestionnaireDeCabines, userCabine));
		this.add(new Waiting(" is undressing", undressingTime));
		this.add(new FreeResourceAction<Cubicle>(" freing resource from CubiclePool\n", gestionnaireDeCabines, userCabine));
		this.add(new Waiting(" is swimming", swimmingTime));
		this.add(new TakeResourceAction<Cubicle>(" is taking a Cubicle\n", gestionnaireDeCabines, userCabine));
		this.add(new Waiting(" is dressing", dressingTime));
		this.add(new FreeResourceAction<Cubicle>(" freing resource from CubiclePool\n", gestionnaireDeCabines, userCabine));
		this.add(new FreeResourceAction<Basket>(" freing resource from BasketPool\n", gestionnaireDePaniers, userPanier));
	}

}
