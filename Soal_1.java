package praktikum;

import java.util.Scanner;  // Import the Scanner class
/**
	*@author Mochamad Hafidh Dwyanto
	*@date 2022-31-08
	*Soal_1_PBO
*/
public class Soal_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char temp = 'n';
		while(temp != 'y' || temp != 'Y') {
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		System.out.print("Enter number :");
	    String user = myObj.nextLine();  // Read user input	   
		try {			
			long inp = Long.parseLong(user);
			if(inp < Byte.MAX_VALUE && inp > Byte.MIN_VALUE) {
				System.out.println(inp + " can be fitted in");
				System.out.println(" * short\n * int \n * long ");
			}else if(inp < Short.MAX_VALUE && inp < Short.MIN_VALUE) {
				System.out.println(inp + "can be fitted in");
				System.out.println(" * int \n *long ");
			}else if(inp > Integer.MIN_VALUE && inp < Integer.MAX_VALUE) {
				System.out.println(inp + "can be fitted in");
				System.out.println(" * int \n * long ");
			}else if(inp < Long.MAX_VALUE && inp > Long.MIN_VALUE) {
				System.out.println(inp + "can be fitted in");
				System.out.println(" * long ");
			}
			
		}catch(NumberFormatException e) {
			System.out.println("can’t be fitted anywhere");
		}
		System.out.println();
		System.out.print("Exit ? ");
		temp  = myObj.nextLine().charAt(0);
		}
	}

}
