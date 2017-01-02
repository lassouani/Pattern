/*
 * halterre.java
 *
 * 
 */


public class Barre implements Produit {

	
	private float poids = 0;
    private float prix = 0;
    private String codeBarre;
    private String descriptif;

    /** Holds value of property longueur. */
    private float longueur;
	
	
    /** Creates a new instance of haltere */
    public Barre() {
    }

    
    /** Code barre unique d'un produit.
     */
    public String getCodeBarre() {
        return codeBarre;
    }

    
    /** Descriptif du produit. Peut être le résultat d'une accumulation de
     * descriptifs si le produit est composé
     */
    public String getDescriptif() {
        return descriptif;
    }

    
    /** Fournit le prix du produit.
     * Peut être calculé.
     */
    public float getPrix() {
        return prix;
    }

   
    /** Getter for property longueur.
     * @return Value of property longueur.
     */
    public float getLongueur() {
        return this.longueur;
    }

    
    /** Setter for property longueur.
     * @param longueur New value of property longueur.
     */
    public void setLongueur(float longueur) {
        this.longueur = longueur;
    }


	@Override
	public void setPrix(float prix) {
		// TODO Auto-generated method stub
		this.prix= prix;
		
	}


	@Override
	public void setCodeBarre(String codebarre) {
		// TODO Auto-generated method stub
		this.codeBarre=codebarre;
		
	}


	@Override
	public void setDescriptif(String description) {
		// TODO Auto-generated method stub
		this.descriptif=description;
		
	}

    

}