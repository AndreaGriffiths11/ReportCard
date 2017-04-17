package me.andreagriffiths11.ReportCard;
import java.util.Scanner;

/*This class creates a report card for Student advisors to produce a grade average and access the need for extra credits in case by case basis*/

public class ReportCard {
	
public static void main(String [ ] args ) {

	/*create scanner*/
	Scanner sc = new Scanner(System.in);
	/*define data type*/
	double math1, science2, english3, average;
	
		System.out.println("Enter Student's last name:"); //enter name
		sc.nextLine();
	    
	  	System.out.println("Enter grade for Math:");
	    math1=sc.nextDouble();
	    
	    System.out.println("Enter grade for Science:");
	    science2=sc.nextDouble();
	    
	    System.out.println("Enter grade for English:");
	    english3=sc.nextDouble();
	    
	   average = ( math1 + science2 + english3 ) / 3;
	
	   if( average < 60) {
		   System.out.printf( "Semester grades average is: %.0f. Failing grade", average);
		   
	   } else if ( average <70){
		   System.out.printf( "Semester grades average is: %.0f. Failing grade", average);
		   
	   } else if (average <80){
		   System.out.printf( "Semester grades average is: %.0f. Passing grade", average);
		   
	   } else if (average <90){
		   System.out.printf( "Semester grades average is: %.0f. Passing grade", average);
		   
	   } else if (average <=100){
		   System.out.printf( "Semester grades average is: %.0f. Passing grade", average);
		  
	   } else {
		   System.out.printf( "Semester grades average is " + average + "that's an invalid average check the grades" );
		   
	   }
	   {
	 System.out.println();  
		        // Evaluate the need for extra credits  by manually inputting the students grade average
		        System.out.print("Enter grade average *round up: " ); 
		        // use scanner to get the value from user console  
		        int intValue = sc.nextInt();  
		        // close the scanner object  
		        sc.close();  
		        Integer myValue = new Integer(intValue); 
		        String value = myValue.toString();
		        System.out.println("ONLY FOR scholarship recipients "
		        	 + "setup Mandatory counseling meeting if average below 70. This students average is: " + value );          
	   }     
    }   
}

	   
	    
   
