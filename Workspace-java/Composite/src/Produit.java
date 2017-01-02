/*
 * Produit.java
 *
 * 
 */

public interface Produit {

    /**
     * Fournit le prix du produit.
     * Peut être calculé.
     */
    public float getPrix();
    
    /**
     * initialise le prix
     * @param prix
     */
    public void setPrix(float prix);
    
    
    /**
     * Code barre unique d'un produit.
     */
     public String getCodeBarre();
     
     public void setCodeBarre(String codebarre);
  
     
     /**
     * Descriptif du produit. Peut être le résultat d'une accumulation de 
     * descriptifs si le produit est composé
     */
    public String getDescriptif();
    
    /**
     * initialise la description d'un produit
     */
    public void setDescriptif(String description);

}