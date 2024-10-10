import java.util.*;

public class Formula1MenaxhimKampionati extends MenaxhimKampionati{
	
	public static void main(String[] args) {
	//krijojme objektin in te klases skaner per te marre nje karakter nga perdoruesi pas shfaqjes se menuse
	Scanner in= new Scanner(System.in);
	
	//lexojme te dhenat nga file i shofereve dhe statistikave per te pasur mundesi te perdorim programin ne menyre koherente
	MenaxhimKampionati m= new MenaxhimKampionati();
	m.lexoTeDhenat();
	
	//shfaqim menune dhe i japim mundesi zgjedhje perdoruesit
		do {
			
			System.out.println("******************************************");
			System.out.println("             ** Menu **");
			System.out.println("******************************************");
			System.out.println("");
			
			System.out.println("1. Krijo nje shofer te ri");
			System.out.println("2. Fshi nje skuader me shoferin e saj perkates");
			System.out.println("3. Ndrysho shoferin per nje skuader ekzistuese");
			System.out.println("4. Shfaq statistikat per nje shofer");
			System.out.println("5. Shfaq tabelen e shofereve te Formules 1");
			System.out.println("6. Shto nje gare");
			System.out.println("");
			System.out.println("s. Save");
			System.out.println("e. Exit");
			System.out.println("");
			
			System.out.println("");
			System.out.println("");
			System.out.println("Zgjidhni: ");
			//na intereson vetem 1 karakter prandaj perdorim charAt(0)
			char c=in.next().charAt(0);
			
			//krijojme objektin per menaxhimin e kampionatin ku kemi krijuar metodat e ndryshme qe paraqiten dhe ne menu
			//ne varesi te karakterit qe jep perdoruesi therrasim metoden nga klasa menaxhim kampionati
			MenaxhimKampionati mn= new MenaxhimKampionati(m.getNr_Shofereve());
			
			if(c=='1') mn.krijoShoferTeRi();
				
			else if(c=='2') mn.fshiSkuader();
				
			else if(c=='3') mn.ndryshoShofer();
				
			else if(c=='4') mn.shfaqStatistikatPerNjeShofer();
				
			else if(c=='5') mn.shfaqTabelen();
				
			else if(c=='6') mn.shtoGare();
				
			else if(c=='s') mn.shkruajTeDhenat();
				
			else if(c=='e') {
				System.out.println("");
				in.close();//mbyllim objektin in
				System.out.println("Mirupafshim!");
				System.exit(1);//dalim nga programi
			}
			
			else System.out.println("Jepni komanden sakte. Shtypni 1,2,3,4,5,6,s ose e per te dale.");//i tregojme perdoruesit cfare mund te shtyp
		}
		while(true);//perseritet derisa perdoruesi shtyp "e" ne menu per ti bere exit
		
	
	}

}
