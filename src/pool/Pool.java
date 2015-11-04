package pool;

import action.FairScheduler;

public class Pool {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws ActionFinishedException{
		CubiclePool cubicles = new CubiclePool(6) ;
	    BasketPool baskets = new BasketPool(3) ;
	    FairScheduler s = new FairScheduler() ;  
	    s.add(new Swimmer("Camille",baskets,cubicles,6,4,8)) ;
	    s.add(new Swimmer("Lo�s",baskets,cubicles,2,10,4)) ;
	    s.add(new Swimmer("Ma�",baskets,cubicles,10,18,10)) ;
	    s.add(new Swimmer("Ange",baskets,cubicles,3,7,5)) ;
	    s.add(new Swimmer("Louison",baskets,cubicles,18,3,3)) ;
	    s.add(new Swimmer("Charlie",baskets,cubicles,3,6,10)) ;
	    s.add(new Swimmer("Alexis",baskets,cubicles,6,5,7)) ;
	    
	    int nbSteps = 0;
	    while(!s.isFinished()){
	    	nbSteps++;
	    	s.doActionStep();
	    }
	    System.out.println("Finished in " + nbSteps + " steps");
	}

}
