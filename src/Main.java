import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Create a program that reads in a dollar amount for the cost of an item
		 * Read in a second amount for how much was paid
		 * Print out how to break it into change
		 * How many 100s,50s,20s,10s,5s,toonies,loonies,quarters,dimes,nickels.
		 * If it does not end in a 5 or 0, you must round the number appropriately.
		 * If the payment doesn't cover the cost, output the amount still owing.
		 */
		Scanner in=new Scanner(System.in);
		System.out.println("How much is the cost?");
		double cost=in.nextDouble();
		System.out.println("How much was paid?");
		double payment=in.nextDouble();
		//TODO: Here is where your code goes
		 double change=payment-cost;
		 int num100s;
		 int num50s;
		 int num20s;
		 int num10s;
		 int num5s;
		 int num0.25s;
		 int num0.05s;
		 
		 //How many 100 dollar bills?
		 num100s=(int)(change/100);
		 //Find out how much money is left
		 change=change%100;
		 //How many 50s?
		 
		 System.out.println(num100s+" x $100");	 
		  
	}

}
