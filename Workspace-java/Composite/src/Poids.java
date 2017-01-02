/*
 * Poids.java
 *
 * 
 */


public class Poids implements Produit {

	
	private float poids = 0;
    private float prix  = 0;
    private String codeBarre;
    private String descriptif;
	
	
    /** Creates a new instance of Poids */
    public Poids() {
    }

    
    
    public float getPoids() {
        return poids;
    }
    
    public void setPoids(float poid) {
    	this.poids=poid;
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