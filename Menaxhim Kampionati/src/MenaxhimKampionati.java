import java.io.*;
import java.util.*;

public class MenaxhimKampionati{

	//te dhenat mbi nr e shofereve
	private static int nr_shofereve=15;
	
	//konstruktor bosh dhe me nr e shofereve te kampionatit
	public MenaxhimKampionati() {
	}
	
	public MenaxhimKampionati(int n) {
		nr_shofereve=n;
	}
	
	//marrim info mbi nr e shofereve
	public int getNr_Shofereve() {
		return nr_shofereve;
	}
	
	//matrica shoferi ruan te dhenat e shofereve, ndersa matrica statistikat ruan statistikat e tyre
	static String[][] shoferi= new String[nr_shofereve][2];
	static int[][] statistikat= new int[nr_shofereve][4];
	
	//kirjojme dy objekte te klases Scanner per te lexuar file-t
	private static Scanner input1;
	private static Scanner input2;
	
	public static void lexoTeDhenat(){
	
		/* Meqenese ne file dime se si jane organizuar te dhenat, duke qene se jane te ndara nga nje hapsire
		  e vetme atehere marrim te dhenat duke perdorur objektin e skaner dhe duke i ruajtur ne matricat
		  e te dhenave dhe statistikave te shofereve*/
		
		try {
			input1 = new Scanner(new File("Files/shoferet.txt"));
		} catch (FileNotFoundException fileNotFoundException) {
			System.err.println("Error ne hapjen e file-it per lexim.");
			System.exit(1);//dalim nga programi
		}
		//lexojme ne file mbi te dhenat e shofereve
		//cikli vazhdon per sa kohe ka rrjesht tjeter poshte, pra skemi arritur end of file
		while (input1.hasNextLine()) {
			try {
					int i=0;
					do {
					shoferi[i][0]=input1.next();
					shoferi[i][0]+=" "+input1.next();
										
					shoferi[i][1]=input1.next();
					
					shoferi[i][2]=input1.next();
					i++;
					if(!input1.hasNextLine()) break;
					//marrim informacion dhe per nr e shofereve aktual
					nr_shofereve=i;
					}while(true);
						
				
			} catch (NoSuchElementException elementException) {
				System.err.println("File nuk eshte ne formatin e duhur.");
				input1.close();
				System.exit(1);
			} catch (IllegalStateException stateException) {
				System.err.println("Error ne leximin e file.");
				System.exit(1);
			}
		}
			
			//lexojme ne file per te marr informacion mbi statistikat e shofereve
			try {
				input2 = new Scanner(new File("Files/statistikat.txt"));
			} catch (FileNotFoundException fileNotFoundException) {
				System.err.println("Error ne hapjen e file-it per lexim.");
				System.exit(1);
			}
	
			while (input2.hasNextLine()) {
				try {
						int i=0;
						do {
						statistikat[i][0]=input2.nextInt();
						statistikat[i][1]=input2.nextInt();
						statistikat[i][2]=input2.nextInt();
						statistikat[i][3]=input2.nextInt();
						i++;
						if(!input2.hasNextLine()) break;
						}while(true);//cikli vazhdon derisa arrijme end of file
					
				} catch (NoSuchElementException elementException) {
					System.err.println("File nuk eshte ne formatin e duhur.");
					input2.close();
					System.exit(1);
				} catch (IllegalStateException stateException) {
					System.err.println("Error ne leximin e file.");
					System.exit(1);
				}

			}
			
			
		//mbyllim objektet e klases skaner ne menyre qe te mos na shfaqin probleme	
		input1.close();
		input2.close();
	
		
}

	public void krijoShoferTeRi() {
		//krijojme nje objekt s te klases scanner per te marre nga perdoruesi te dhenat e shoferit te ri 
		Scanner s=new Scanner(System.in);
		
		//marrim te dhenat e shoferit te ri dhe i shtojme ne matrice si shoferi i fundit
		System.out.println("Jepni emrin e shoferit: ");
		shoferi[nr_shofereve][0]=s.next();
		
		System.out.println("Jepni vendndodhjen e shoferit: ");
		shoferi[nr_shofereve][1]=s.next();
		
		System.out.println("Jepni ekipin e shoferit: ");
		shoferi[nr_shofereve][2]=s.next();
		
		//shtojme nr aktual te shofereve
		nr_shofereve++;
		
		s.close();
	}

	public void fshiSkuader() {
		Scanner s=new Scanner(System.in);
		
		//marrim te dhenat mbi skuadren qe do fshime
		System.out.println("Jepni emrin e shoferit: ");
		String emri=s.next();
		
		System.out.println("Jepni vendndodhjen e shoferit: ");
		String vendndodhja=s.next();
		
		System.out.println("Jepni ekipin e shoferit: ");
		String ekipi=s.next();
		
		//kerkojme tek te gjithe te dhenat e shofereve dhe skuadrave ne menyre qe te gjejme skuadren qe do fshime
		for(int i=0;i<shoferi.length;i++) {
			if ( emri.equals(shoferi[i][0]) && vendndodhja.equals(shoferi[i][1]) && ekipi.equals(shoferi[i][2]) ) {
				//kur te dhenat perputhen me ato qe jane dhene nga perdoruesi duhet te heqim nje shofer nga lista
				for(i=0;i<shoferi.length-1;i++) {
					shoferi[i][0] = shoferi[i+1][0];
					shoferi[i][1] = shoferi[i+1][1];
					shoferi[i][2] = shoferi[i+1][2];
					
					statistikat[i][0] = statistikat[i+1][0];
					statistikat[i][1] = statistikat[i+1][1];
					statistikat[i][2] = statistikat[i+1][2];
					statistikat[i][3] = statistikat[i+1][3];
					statistikat[i][4] = statistikat[i+1][4];
					
					nr_shofereve--;//pasi kemi zhvendosur cdo info te shofereve ulin nr total te shofereve me 1
				}
				}
		}
		
		s.close();
	}

	public void ndryshoShofer() {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Jepni ekipin e shoferit qe doni te ndryshoni: ");
		String ekipi= s.next();
		
		//kerkojme per ekipin shoferin e te cilit do ndryshojme
		for(int i=0;i<shoferi.length;i++) {
			if(ekipi.equals(shoferi[i][2])) {
				System.out.println("Jepni emrin e ri te shoferit: ");
				shoferi[i][0] = s.next();//marrim emrin e shoferit te ri dhe e zevendesojme me ate te vjetrin
			}
		}
		
		s.close();
	}

	public void shfaqStatistikatPerNjeShofer() {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Jepni emrin e shoferit te cilit deshironi ti shikoni statistikat: ");
		String emri= s.next();
		
		//kerkojme per shoferin te cilin do ti shfaqim statistikat
		for(int i=0;i<shoferi.length;i++) {
			if(emri.equals(shoferi[i][0])) {
				//ne momentin qe gjejme shoferin shfaqim te gjitha statistikat e tij
				System.out.println("Statistikat per:"+emri+ " ");
				System.out.println("Vend i pare: " +statistikat[i][0]);
				System.out.println("Vend i dyte: " +statistikat[i][1]);
				System.out.println("Vend i trete: " +statistikat[i][2]);
				System.out.println("Piket: " +statistikat[i][3]);
				System.out.println("Numri i garave: " +statistikat[i][4]);
			}
		}
		
		s.close();
	}

	public void shfaqTabelen() {
		//indeks i matricave te reja qe do krijojme per te shfaqur te dhenat e renditura
		int k=0;
		//marrim nje kusht qe do perdorim me poshte
		int kushti=0;
		
		//marrim si max vleren minimale ne menyre qe cfardolloj vlere te haset e para te jete maksimum per heren e pare
		int max=Integer.MIN_VALUE, poz=0;
		
		String[][] shoferi2= new String[100][2];
		int[][] statistikat2= new int[100][4];
		
		//perserisim gjetjen e maksimumit per te gjith nr e elementeve qe kemi
		for(int j=0;j<statistikat.length;j++) {
		//gjejme maksimumin e pikeve te shofereve aktual
		for(int i=0;i<statistikat.length;i++) {
			//kontrollojme shoferin aktual nese eshte marre njehere parasysh si maksimum duke u renditur ne matricen e re
			for(k=0;k<shoferi2.length;k++)
			if(shoferi[i][0].equals(statistikat2[k][0])) kushti=1; 
			//nese kemi gjetur qe shoferi eshte renditur njehere, bejme continue duke kaluar tek shoferi rradhes dhe resetojme kushtin
			if(kushti==1) {
				kushti=0;
				continue;
				}
			if(max<statistikat[i][3]) {max=statistikat[i][3];
										poz=i;}
			//nese piket jane te barabarta shohim kush ka dal me shpesh ne vend te pare per ti dhene maksimumin dhe pozicionin e max
			else if(max==statistikat[i][3]) {
						if(statistikat[max][0]>statistikat[i][0]) {
																max=max; poz=poz;
																}
						else {
							max=statistikat[i][3];
							poz=i;
						}
						}
		}
		
		//rendisim shoferet ne matricat e reja ne rendin zbrites 
		shoferi2[k][0]=shoferi[poz][0];
		shoferi2[k][1]=shoferi[poz][1];
		shoferi2[k][2]=shoferi[poz][2];
		
		statistikat2[k][0]=statistikat[poz][0];
		statistikat2[k][0]=statistikat[poz][1];
		statistikat2[k][0]=statistikat[poz][2];
		statistikat2[k][0]=statistikat[poz][3];
		statistikat2[k][0]=statistikat[poz][4];
		
		k++;
		}
		
		//shfaqim gjithe shoferet e renditur sipas statistikave
		for(int i=0;i<shoferi2.length;i++) {
			System.out.println("Statistikat per: "+shoferi2[i][0]+"nga "  +shoferi2[i][2]+   "Vend i pare: " +statistikat2[i][0] +" Vend i dyte: " +statistikat2[i][1]+" Vend i trete: " +statistikat2[i][2] + " Piket: " +statistikat2[i][3]+" Numri i garave: " +statistikat2[i][4]);
			
		}
		
		
	}

	public void shtoGare() {
		//Krijojme nje gare te re duke marre kohen e runtime
		System.out.println("Filloi gara");
		System.out.println(java.time.LocalTime.now());
		
		//Kemi marre perfundimet te mirevendosura, por mund ti krijonim dhe random apo te pyesnim perdoruesin
		
		//per cdo shofer i shtojme piket ne statistikat e tij dhe renditjen ne vendin e 1 2 dhe 3 per tre te paret
		System.out.println("VENDI I PARE!!! - "+shoferi[0][0]+" -fiton 25 pike");
		statistikat[0][0]+=1;
		statistikat[0][3]+=25;
		System.out.println("VENDI I DYTE!!! - "+shoferi[1][0]+" -fiton 18 pike");
		statistikat[1][1]+=1;
		statistikat[1][3]+=18;
		System.out.println("VENDI I TRETE!!! - "+shoferi[2][0]+" -fiton 15 pike");
		statistikat[2][2]+=1;
		statistikat[2][3]+=15;
		System.out.println("");
		System.out.println("Vendi i 4 - "+shoferi[3][0]+" -fiton 12 pike");
		statistikat[3][3]+=12;
		System.out.println("Vendi i 5 - "+shoferi[4][0]+" -fiton 10 pike");
		statistikat[4][3]+=10;
		System.out.println("Vendi i 6 - "+shoferi[5][0]+" -fiton 8 pike");
		statistikat[5][3]+=8;
		System.out.println("Vendi i 7 - "+shoferi[6][0]+" -fiton 6 pike");
		statistikat[6][3]+=6;
		System.out.println("Vendi i 8 - "+shoferi[7][0]+" -fiton 4 pike");
		statistikat[7][3]+=4;
		System.out.println("Vendi i 9 - "+shoferi[8][0]+" -fiton 2 pike");
		statistikat[8][3]+=2;
		System.out.println("Vendi i 10 - "+shoferi[9][0]+" -fiton 1 pike");
		statistikat[9][3]+=1;
		/*nese do kishim krijuar random apo do kishim marre perdoruesit, do kishim bere nje kerkim per cdo emer te marre qe te
		gjenim ne cilin pozicion ndodhet ai shofer dhe ti rifreskonim statistikat e reja*/
	}

	public void shkruajTeDhenat() {
		//perdorim nje objekt te klases MyWriter per te shkruar ne file
		FileWriter myWriter;
		 
		 try {
			 //shkruajme fillimisht te dhenat e shofereve
		      myWriter = new FileWriter("Files/shoferet.txt");
		      for(int i=0;i<shoferi.length;i++) {
		      myWriter.write(shoferi[i][0]+" "+ shoferi[i][1]+ " "+ shoferi[i][2]);
		      myWriter.write("\n");
		      }
		      //mbyllim objektin e klases MyWriter
		      myWriter.close();
		    } catch (IOException e) {
		    	System.err.println("Error ne hapjen e file-it per lexim.");
		   		System.exit(1);
		    }
     
		 try {
			 //shkruajme me pas statistikat e shofereve
		      myWriter = new FileWriter("Files/statistikat.txt");
		      for(int i=0;i<shoferi.length;i++) {
		      myWriter.write(statistikat[i][0]+" "+ statistikat[i][1]+ " "+ statistikat[i][2]+ statistikat[i][3]+ " "+ statistikat[i][4]);
		      myWriter.write("\n");
		      }
		      //mbyllim objektin e klases MyWriter
		      myWriter.close();
		    } catch (IOException e) {
		    	System.err.println("Error ne hapjen e file-it per lexim.");
		   		System.exit(1);
		    }
		
		
	}
	

}
	

