package prime;

public class Prime {
	/**
	 * This method will determine if a given number is prime or not
	 * @param args
	 */

	public static void main(String[] args){
		int Number =4; //enter the number here, for which you want know if it is prime or not.
		int Reminder = 0; // will have the reminder of the Number%i
		boolean Result = true; // the value of this is used to determine if a given number is prime or not
		
		for (int i=2 ; i<=Number/2 ; i++){ //the loop will do the calculation to find if the entered number is prime or not
			Reminder = Number%i;
			if (Reminder == 0) {
				Result = false;
				break;
				}
			}
		
		if (Result == false){
			System.out.println("Not Prime Number");
			}
		
		else{
			System.out.println("PRIME");
			}
		}
	}
