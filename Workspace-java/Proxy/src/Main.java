
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Image image1 = new ProxyImage("HiRes_10MB_Photo1");
        Image image2 = new ProxyImage("HiRes_10MB_Photo2");
        Image image3 = new ProxyImage("HiRes_10MB_Photo3");

        image1.displayImage(); // chargement n�cessaire
        image2.displayImage(); // chargement n�cessaire
        image1.displayImage(); // pas de chargement n�cessaire, d�j� fait
        // la troisi�me image ne sera jamais charg�e : pas de temps gaspill�


	}

}
