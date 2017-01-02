

public abstract class Pizza{
	
	 protected Pizza ingredient;
	    
	    public abstract boolean isForThonPizza();

	    public void addIngredient(){
	          
	    	if(this.isForThonPizza()){
	    		System.out.println("Adding : "+this);
	}
	    	if(this.ingredient != null){
	    	this.ingredient.addIngredient();
	    	System.out.println(ingredient);
	    	}
	    }
	


    public void setNext(final Pizza ingredient){

    	this.ingredient=ingredient;
    	System.out.println(ingredient);
    	}


}