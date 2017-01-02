
public class Chantilly extends DecorateurIngredient {

	public Dessert dessert;
	
	public Chantilly(Dessert d) {
		// TODO Auto-generated constructor stub
		dessert = d;
	}
	
	
	@Override
	// On affiche le libellé du dessert et on rajoute le libellé de l'ingrédient chantilly
	public String getLibelle() {
		// TODO Auto-generated method stub
		return dessert.getLibelle()+", chantilly";
}

	@Override
	// On additionne le prix du dessert et le prix de l'ingrédient chantilly.
	public double getPrix() {
		// TODO Auto-generated method stub
		return dessert.getPrix()+0.50;
	}

}
