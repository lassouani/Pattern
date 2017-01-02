/*
 * ProduitException.java
 *
 * 
 */


import java.lang.RuntimeException;


public class ProduitException extends RuntimeException {
    public ProduitException() {
        super();
    }
    public ProduitException(String msg) {
        super(msg);
    }
    public ProduitException(Exception e) {
        super(e);
    }
}