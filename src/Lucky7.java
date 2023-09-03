import java.util.Scanner;
import java.util.Random;
class Lucky7 {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);	

	Random random = new Random();

	int luckyNumber = 7;
	int alkuRaha = 0;
	String pelaajanRahasumma;
	String vastaus;
	
	//Pahoittelut finglish -sekoituksesta :D
	
	//Peliohjeet
	System.out.println("Lucky7\nPeliohjeet: Syötä aluksi haluamasi rahasumma. Peli arpoo sinulle kolme numeroa väliltä 1-10.\nYksi peli maksaa 1€. "
	+"Jos yksi arvotuista numeroista on seitsemän, voitat 3€.\nJos kaksi numeroa on seitsemän, voitat 5€. Jos kolme arvotuista numeroista on seitsemän, voitat 7€.\nPeli loppuu kun rahat loppuvat.\n ");
	
	//Kehoitetaan pelaajaa syöttämään haluamansa rahasumma
	System.out.println("Syötä haluamasi rahasumma numeroina (€) ja paina Enter, niin peli alkaa:");
	pelaajanRahasumma = in.nextLine(); 
	System.out.println("-------------");
	int summaNyt =alkuRaha + Integer.parseInt(pelaajanRahasumma);
	
	//looppi alkaa
	
do {
	int randomNumber = random.nextInt(10);
	int randomNumber2 = random.nextInt(10);
	int randomNumber3 = random.nextInt(10);
		
			//Ilmoittaa pelaajalle mitkä ovat random-numerot
			System.out.println("Numerosi ovat " + randomNumber +"," + randomNumber2 + (",") + randomNumber3);
	
		
	 	if (randomNumber == luckyNumber && randomNumber2 == luckyNumber && randomNumber3 ==luckyNumber)
	  		{System.out.println("Onnea! Voitit 7 €");
	 		summaNyt = summaNyt -1 +7; }
	 
	 	else if (randomNumber == luckyNumber && randomNumber2 == luckyNumber || randomNumber2 == luckyNumber && randomNumber3==luckyNumber || randomNumber ==luckyNumber && randomNumber3 == luckyNumber)
		 	{System.out.println("Onnea! Voitit 5€."); 
	 		summaNyt = summaNyt -1 + 5;}
	 
	 	else if (randomNumber == luckyNumber || randomNumber2 == luckyNumber || randomNumber3 == luckyNumber)
	  		{System.out.println ("Onnea! Voitit 3€."); 
	 		summaNyt = summaNyt -1 +3; }
	 	
		else 
	  		{System.out.println("Hävisit.");
	 		summaNyt = summaNyt -1;
	 		}
	 		
	 		//Ilmoittaa pelaajalle mikä on hänen alkupääomansa nyt
	 	   	System.out.println("Pääomasi on " + summaNyt + "€.");
	 	   
	 	   	System.out.println("Haluatko jatkaa peliä? Vastaa k/e ja paina Enter.");
	 	   	vastaus = in.nextLine();
	 	   	System.out.println("---------");
	 	   
	 	 if (vastaus.equals("e") || summaNyt ==0)
	 	     {System.out.println("Peli loppui.");
	 	   break; }
	 	  	
	}
	
 while (summaNyt >0);  
	   //looppi päättyy tähän
	      
		 

	
	}
	
}
