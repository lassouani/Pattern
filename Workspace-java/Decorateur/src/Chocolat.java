
public class Chocolat extends DecorateurIngredient {

	public Dessert dessert;
	
	public Chocolat(Dessert d) {
		// TODO Auto-generated constructor stub
		dessert = d;
	}
	
	
	@Override
	// On affiche le libell� du dessert et on rajoute le libell� de l'ingr�dient chantilly
	public String getLibelle() {
		// TODO Auto-generated method stub
		return dessert.getLibelle()+", chocolat";
}

	@Override
	// On additionne le prix du dessert et le prix de l'ingr�dient chantilly.
	public double getPrix() {
		// TODO Auto-generated method stub
		return dessert.getPrix()+0.20;
	}

}
