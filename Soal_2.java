package praktikum;

import java.util.Scanner;  // Import the Scanner class
/**
 *@author Mochamad Hafidh Dwyanto
 *@date 2022-31-08
 *Soal_2_PBO
*/

public class Soal_2 {
		public static void main(String[] args) {
		 final double CM_PER_INCH = 2.54;
		 double paperWidth = 8.5;
		 double paperHeight = 11;
		 System.out.println("Paper size in centimeters: " +
		 paperWidth * CM_PER_INCH + " by " + paperHeight *
		 CM_PER_INCH);
		}
	
	public class Constants2 {
		 public static final double CM_PER_INCH = 2.54;
		 public static void main(String[] args) {
		 double paperWidth = 8.5;
		 double paperHeight = 11;
		 System.out.println("Paper size in centimeters: " + paperWidth *
		 CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
		 }
	}
}
