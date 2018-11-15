
public class KompleksniTest {

	public static void main(String[] args) {
		
		/*z1.ispisiBroj(); //metoda za stampanje
		z1.setRe(5); //postavlja vrijednost re na 5
		z1.ispisiBroj(); // ispisuje je opet
		
		/*mogli bi smo odma pozvat re da smo stavili da je re
		 * public unutar kompleksni.java, mada to narusava 
		 * enkapsulaciju i ne treba da se koristi
		 
		System.out.println("Moduo je " + z1.moduo()); //samo smo istampali moduo metodu*/
		
		Kompleksni z1 = new Kompleksni(3, (float)-5.2);
		Kompleksni z2 = new Kompleksni(4,8), rez;
		
		rez = z1.saberi(z2);
		rez.ispisiBroj();
	}
	
}
// poenta programa je da spoji realni i imaginarni dio broja 