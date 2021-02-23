package java8.diff.doctorClinic;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
		
	public static List<Patient> filterPatient (String doctorName)
     {
	 /* your code to collect patient doctor wise */
		return null;
     }

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		 String output=String.format("%-5s %-20s %-20s %-20s","Serial No","Patient Name","Address","Doctor");
		while(true)
		{
		/* your code to create menu */
			System.out.println("Enter Choice(1-4).");
			String option=scanner.nextLine();
            switch(option)
            {
            /* your code for different switch..cases */
            case "4" : System.exit(0);
           }// end of switch
		}// end of loop
	}// end of main

}// end of class
