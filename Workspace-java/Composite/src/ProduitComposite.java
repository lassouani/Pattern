/*
 * ProduitComposite.java
 *
 * 
 */



import java.util.*;

/**
 * Classe d'impl�mentation d'un produit composite pour notre magasin.
 * 
 */
public class ProduitComposite implements Produit {
	
	private Collection children;
    private String codeBarre;
    private String descriptif;

    /** Creates a new instance of ProduitComposite */
    public ProduitComposite() {
        children = new ArrayList();
    }

    /** Ajoute un produit � la liste des composants
     * @param produit le produit que l'on veux ajouter au composite
     * @throws ProduitException Si le produit est null.
     */
    public void add(Produit produit) throws ProduitException {
        assert null != children;
        if (null == produit) {
            throw new ProduitException("Impossible d'ajouter un produit null");
        }
        children.add(produit);
    }

    /** Enl�ve un produit de la composition.
     * @param produit le produit � retirer de la composition.
     * @throws ProduitException Si le produit est null ou n'est pas dans la liste.
     */
    public void remove(Produit produit) throws ProduitException {
        assert null != children;
        if (null == produit) {
            throw new ProduitException("Impossible d'enlever un produit null");
        }

        if ( ! children.contains(produit)) {
            throw new ProduitException("Impossible d'enlever le produit, il n'est pas dans la liste");
        }

        children.remove(produit);
    }

    /** Renvoie la liste des composantes du produit sous la forme d'un it�rateur.<p>
     * Voir le pattern it�rateur.
     * @return La liste des composantes.
     */
    public Iterator getChildren() {
        assert null != children;
        return children.iterator();
    }

    /** Code barre unique d'un produit.
     * @return  le code barre du produit
     */
    public String getCodeBarre() {
        return codeBarre;
    }

    /** Descriptif du produit. Peut �tre le r�sultat d'une accumulation de
     * descriptifs si le produit est compos�
     * @return  le descriptif compos�
     */
    public String getDescriptif() {
        assert null != children;

        StringBuffer result = new StringBuffer();
        result.append(descriptif);
        result.append(" : (");

        for (Iterator i = children.iterator(); i.hasNext(); ) {
            Object objet = i.next();

            assert null != objet : "Un objet null a �t� trouv� dans la liste des composantes";
            assert objet instanceof Produit : "Un \"non produit\" a �t� trouv� dans la liste des composantes";

            Produit composant = (Produit)objet;

            result.append(composant.getDescriptif());
            if (i.hasNext()) { // on ajoute une virgule pour s�parer les descriptifs
                result.append(", ");
            }
        }

        result.append(" )");
        return result.toString();
    }

    /** Fournit le prix du produit.
     * Peut �tre calcul�.
     * @return  le prix calcul�
     */
    public float getPrix() {
        float result = 0;
        for (Iterator i = children.iterator(); i.hasNext(); ) {
            Object objet = i.next();

            assert null != objet : "Un objet null a �t� trouv� dans la liste des composantes";
            assert objet instanceof Produit : "Un \"non produit\" a �t� trouv� dans la liste des composantes";

            Produit composant = (Produit)objet;

            result += composant.getPrix();
        }
        result = result * 0.9f; // soit une r�ducion de 10%
        return result;
    }

	@Override
	public void setPrix(float prix) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setCodeBarre(String codebarre) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDescriptif(String description) {
		// TODO Auto-generated method stub
		this.descriptif=description;
		
	}

    

}