package palindrome;

public class Testpalyndrome {

	public Testpalyndrome() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public boolean test(String str){
		boolean test=true;
		    int x = 0;
	        int y =str.length()-1;
	        while (y>x && str.charAt(x)== str.charAt(y)){
	            x++;
	            y--;
	        }
	        if (y<=x){
	        System.out.println("votre chaine est palindrome");
	        
	        }else{
	        System.out.println("votre chaine n'est pas palindrome");
	        test=false;
	        }
		
		
		return test;
		
	}

}
