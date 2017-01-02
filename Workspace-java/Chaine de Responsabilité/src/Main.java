
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		final Pizza cheese=new Cheese();

		final Pizza salt=new Salt();
        cheese.setNext(salt);
        final Pizza tuna=new Tuna();
        salt.setNext(tuna);
        final Pizza olive=new Olive();
        tuna.setNext(olive);
        
        System.out.println("ici"+cheese);
        
        cheese.addIngredient();
        

	}

}
