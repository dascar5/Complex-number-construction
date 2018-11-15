
public class Kompleksni {
	private float re; //private da ne budu dostupne spolja, re=realni dio
	private float im; //imaginarni dio
	
	//Metode klase
	
	public Kompleksni() {//generisan konstruktor 
		re=0;
		im=0; 
	}

	public Kompleksni(float re) { //kada mu se posredi parametar postavlja ga
		this.re = re; //this.re sluzi za pristup varijablama na samom vrhu
		this.im =0;
	}

	public Kompleksni(float re, float im) {
		this.re = re;
		this.im = im;
	} 
	
	//Geteri i seteri

	public float getRe() {
		return re;
	}

	public void setRe(float re) {
		this.re = re; //postavljamo vrijednost, ne treba nam vracanje vrijednosti
	}

	public float getIm() {
		return im;
	}

	public void setIm(float im) {
		this.im = im;
	}
	public void ispisiBroj(){
		if(this.im >=0)
			System.out.println(this.re+" +i" + this.im);
		else
			System.out.println(this.re+" -i" + Math.abs(this.im));
	}
	public float moduo(){
		return (float) Math.sqrt(this.re*this.re+this.im*this.im);
	}

	public Kompleksni saberi(Kompleksni a){
		Kompleksni rez = new Kompleksni();
		rez.setRe(this.re + a.re);
		rez.setIm(this.im + a.im);
		return rez;
	}
	
}
