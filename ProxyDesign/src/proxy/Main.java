package proxy;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Image image1 = new ProxyImage("HiRes_10MB_Photo1");
		Image image2 = new ProxyImage("HiRes_10MB_Photo2");

		image1.displayImage(); // loading necessary
		image1.displayImage(); // loading unnecessary
		image2.displayImage(); // loading necessary
		image2.displayImage(); // loading unnecessary
		image1.displayImage(); // loading unnecessary

		// Tulosta kuvan nimi
		System.out.println("\n\n*Tulosta kuvan nimi*");
		image1.showData();
		image2.showData();

		ArrayList<Image> imageFolder = new ArrayList<>();

		Image image3 = new ProxyImage("HiRes_10MB_Photo3");
		Image image4 = new ProxyImage("HiRes_10MB_Photo4");
		Image image5 = new ProxyImage("HiRes_10MB_Photo5");
		Image image6 = new ProxyImage("HiRes_10MB_Photo6");

		imageFolder.add(image3);
		imageFolder.add(image4);
		imageFolder.add(image5);
		imageFolder.add(image6);



		// Tulosta tiedot valokuvakansion sisällöstä (kuvia ei ladata).
		System.out.println("\n\n*Tulosta tiedot valokuvakansion sisällöstä*");

		for (Image img : imageFolder) {
			img.showData();
		}

		// Esitä myös, kuinka valokuvakansiota voidaan selata (kuvat ladataan, ellei vielä ole ladattu).
		System.out.println("\n\n*Lataa kuvat*");
		for (Image img : imageFolder) {
			img.displayImage();
		}

	}

}
