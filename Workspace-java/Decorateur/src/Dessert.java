import java.text.NumberFormat;

public class Dessert {
	
	public String libelle;
	public double prix;
	
	
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libele) {
		this.libelle = libele;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	@Override
	public String toString() {
		NumberFormat format=NumberFormat.getInstance();
		format.setMinimumFractionDigits(2);// 2 chiffres après la virgule suffisent pour l'affichage.
		return getLibelle()+" : "+format.format(getPrix())+"€";
	}

}
