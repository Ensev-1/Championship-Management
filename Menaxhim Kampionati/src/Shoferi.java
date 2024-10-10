public abstract class Shoferi {

	//te dhenat e shofereve
	private String emri;
	private String vendndodhja;
	private String ekipi;
	
	//konstruktori bosh per shoferet
	public Shoferi() {
		emri="emri";
		vendndodhja="vendndodhja";
		ekipi="ekipi";
	}
	
	//metodat set per te dhenat e shofereve
	public void setEmri(String emri) {
		this.emri=emri;
	}
	
	public void setVendndodhja(String vendndodhja) {
		this.vendndodhja=vendndodhja;
	}
	
	public void setEkipi(String ekipi) {
		this.ekipi=ekipi;
	}
	
	//metodat get per te dhenat e shofereve
	public String getEmri() {
		return emri;
	}
	
	public String getVendndodhja() {
		return vendndodhja;
	}
	
	public String getEkipi() {
		return ekipi;
	}
	
	
}
