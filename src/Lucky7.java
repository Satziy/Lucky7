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
	
	System.out.println("Numerosi ovat " + randomNumber +"," + randomNumber2 + (",") + randomNumber3);
	
	 if (randomNumber == luckyNumber || randomNumber2 == luckyNumber || randomNumber3 ==luckyNumber)
	 	
	 {
		 System.out.println("Onnea!");
	 }
	 else 
		 
	 {System.out.println("Hävisit");}
	 
	 
	 
	}
    
}
