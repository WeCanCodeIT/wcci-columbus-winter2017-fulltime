import java.util.Scanner;
public class JavaBasics {

	public static void main(String[] args) {

////ORIGINAL SOLUTION WITH HARD-CODED VALUES  		
//	int diners = 4;
//	int indMoney = 13;
//	int bill = diners * indMoney;
//	System.out.println(bill); 

		//REPLACING HARD-CODED VALUES WITH USER INPUT
		//Create the scanner object
		Scanner input = new Scanner(System.in);
//		
//		//Prompt the user to enter information
//		System.out.println("Enter number of diners");
//		//Initialize diners variable to hold number entered by user
//		int diners = input.nextInt();
//		
//		//Prompt the user to enter information
//		System.out.println("How much is each diner paying?");
//		//Initialize diners variable to hold number entered by user
//		int indMoney = input.nextInt();
//		
//		//Do the calculation
//		int bill = diners * indMoney;
//		
//		//Print the result of the calculation
//		System.out.println(bill); 
		
		//ADDING DISCOUNT CONDITIONAL
				//Prompt the user to enter information
				System.out.println("Enter number of diners:");
				//Initialize diners variable to hold number entered by user
				int diners = input.nextInt();
				
				//Prompt the user to enter information
				System.out.println("How much is each diner paying?");
				//Initialize diners variable to hold number entered by user
				int indMoney = input.nextInt();
				
				//Do the calculation
				int bill = diners * indMoney;
				
				//Print the result of the calculation
				System.out.println("Original Bill: $" + bill);
				
				//Condition to test if the bill is at least $50
				if(bill >= 50){
					//create variable to calculate discounted amount
					double discount = bill * .1;
					
					//create variable for the discounted bill amount
					double newBill = bill-discount;
					
					//Print the new discounted bill amount
					System.out.println("Discounted Bill: $" + newBill);
				} else {
					//create variable to calculate discounted amount
					double discount = bill * .05;
					
					//create variable for the discounted bill amount
					double newBill = bill-discount;
					
					//Print the new discounted bill amount
					System.out.println("Discounted Bill: $" + newBill);
				}
		
		
	}

}
