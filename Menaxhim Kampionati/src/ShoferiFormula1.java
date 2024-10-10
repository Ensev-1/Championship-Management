public class ShoferiFormula1 extends Shoferi{

	//statistikat e shofereve
	private int nr_vendIPare;
	private int nr_vendIDyte;
	private int nr_vendITrete;
	private int piket;
	private int nr_garave;
	
	//konstruktori bosh per statistikat e shofereve
	public ShoferiFormula1() {
		nr_vendIPare=0;
		nr_vendIDyte=0;
		nr_vendITrete=0;
		piket=0;
		nr_garave=0;
	}
	
	//metodat set per statistikat e shofereve
	public void setNr_VendIPare(int nr_vendIPare) {
		this.nr_vendIPare=nr_vendIPare;
	}
	
	public void setNr_VendIDyte(int nr_vendIDyte) {
		this.nr_vendIDyte=nr_vendIDyte;
	}
	
	public void setNr_VendITrete(int nr_vendITrete) {
		this.nr_vendITrete=nr_vendITrete;
	}
	
	public void setPiket(int piket) {
		this.piket=piket;
	}
	
	public void setNr_Garave(int nr_garave) {
		this.nr_garave=nr_garave;
	}
	
	//metodat get per statistikat e shofereve
	public String getNr_VendIPare() {
		return ""+nr_vendIPare;
	}
	
	public String getNr_VendIDyte() {
		return ""+nr_vendIDyte;
	}
	
	public String getNr_VendITrete() {
		return ""+nr_vendITrete;
	}
	
	public String getPiket() {
		return ""+piket;
	}
	
	public String getNr_Garave() {
		return ""+nr_garave;
	}
	
}
