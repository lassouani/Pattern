
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Barre maBarre = new Barre();
		maBarre.setPrix(25f);
		maBarre.setDescriptif("Barre d'haltérophilie");
		maBarre.setCodeBarre("BA0001");
		maBarre.setLongueur(150f);
		System.out.println("description du produit mbarre :"+maBarre.getDescriptif());

		Poids leger = new Poids();
		leger.setPrix(15f);
		leger.setDescriptif("Poids d'haltère1");
		leger.setCodeBarre("PA0001");
		leger.setPoids(0.5f);
		System.out.println("decription du produit leger "+leger.getDescriptif());

		Poids moyen = new Poids();
		moyen.setPrix(17f);
		moyen.setDescriptif("Poids d'haltère2");
		moyen.setCodeBarre("PA0002");
		moyen.setPoids(1f);
		System.out.println("decription du produit leger "+moyen.getDescriptif());

		Poids lourd = new Poids();
		lourd.setPrix(19f);
		lourd.setDescriptif("Poids d'haltère3");
		lourd.setCodeBarre("PA0003");
		lourd.setPoids(1.5f);
		System.out.println("decription du produit leger "+lourd.getDescriptif());

		ProduitComposite haltere = new ProduitComposite();
		haltere.setDescriptif("Produit composé");
		haltere.add(maBarre);
		haltere.add(leger);
		haltere.add(moyen);
		haltere.add(lourd);
		
		System.out.println("description du produit composé haltere : "+haltere.getDescriptif());

	}

}
