import java.util.Scanner;
import java.util.Random;
class Lucky7 {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);	

	Random random = new Random();

	
	
	int randomNumber = random.nextInt(10);
	int randomNumber2 = random.nextInt(10);
	int randomNumber3 = random.nextInt(10);
//	int[] numbers = {randomNumber, randomNumber2, randomNumber3};
	int luckyNumber = 7;
	int alkuRaha = 5;
	// int voittoSumma = 0;
	int summaNyt =alkuRaha;
	String vastaus;
	
	System.out.println("Lucky7\nPeliohjeet: Sinulla on alussa 5€ rahaa. Joka peli maksaa 1€. "
			+"Jos yksi arvotuista numeroista on seitsemän, voitat 3€.\nJos kaksi numeroa on seitsemän, voitat 5€. Jos kolme numeroa on oikein, voitat 7€.\nPeli loppuu kun rahat loppuvat.\n ");
	
	do {
	
	
	
	
		System.out.println("Numerosi ovat " + randomNumber +"," + randomNumber2 + (",") + randomNumber3);
	
		// for (summaNyt = alkuRaha; summaNyt <=0; summaNyt++)
		
		
			
			
		//while (summaNyt <=0)
		
	 	if (randomNumber == luckyNumber && randomNumber2 == luckyNumber && randomNumber3 ==luckyNumber)
	 	
	 		{System.out.println("Onnea! Voitit 7 €");
	 		summaNyt = summaNyt +7; }
	 
	 	else if (randomNumber == luckyNumber && randomNumber2 == luckyNumber || randomNumber2 == luckyNumber && randomNumber3==luckyNumber || randomNumber ==luckyNumber && randomNumber3 == luckyNumber)
		 
	 		{System.out.println("Onnea! Voitit 5€."); 
	 		summaNyt = summaNyt + 5;}
	 
	 	else if (randomNumber == luckyNumber || randomNumber2 == luckyNumber || randomNumber3 == luckyNumber)
	 
	 		{System.out.println ("Onnea! Voitit 3€."); 
	 		summaNyt = summaNyt +3; }
	 	
		else 
	 
	 		{System.out.println("Hävisit.");
	 		summaNyt = summaNyt -1;
	 		}
	 		
	
	 	   System.out.println("Pääomasi on " + summaNyt + "€.");
	 	   
	 	   System.out.println("Haluatko jatkaa peliä? Vastaa k/e ja paina Enter.");
	 	   vastaus = in.nextLine();	
	 	  if (vastaus.equals("e"))
	 	     {System.out.println("Peli loppui.");
	 	   break; }
	 	  
	 	  if (vastaus.equals("k"));
	 	  
	 	  {System.out.println("Peli loppui.");}
	 	  
	 	  
	 	   
	}
	 	  while (summaNyt >0);    
	    
	
	
	
	
	     
	     
	      
	
//	 for (int peli1 =alkuRaha; peli1 <=0; peli1++ ) {
//	 
//		 System.out.println("jotain");

	
	 

	
	}
	
}
