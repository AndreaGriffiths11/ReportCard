package me.andreagriffiths11.ReportCard;

/*This class creates a report card for Teachers to store grades for the year*/
public class ReportCard {
		
    private String Name;
    private String Year;
    private int mathGrade ;
    private int scienceGrade;
    private int englishGrade;
    private int Sum ; 
    private int gradesTotal ;
    private double Percentage ;
    
    public ReportCard (){
	}
  /* constructor*/
    public ReportCard(String name, String year, int math, int science, int english, int sum, int total) {
        
    	{
    	this.Name = name; 
        this.Year = year; 
    	mathGrade = math;
    	scienceGrade = science;
    	englishGrade = english;
        Sum = 0 ; 
        gradesTotal = total; 
        Percentage = 0.0; 		
 
    	}
    }
    /* Getter and Setters for course grades*/
    public void getMathGrade(int math){
       mathGrade = math;
    }
    public void setMathGrade(int math){
        mathGrade = math; 	
    }

    public void getScienceGrade(int science){
        scienceGrade = science;
    }
    public void setScienceGrade(int science){
        scienceGrade = science;
    }
    public void getEnglishGrade(int english){
        englishGrade = english;
    }
    public void setEnglishGrade(int english){
        englishGrade = english;
 }
    /* Getter and setter for Student name */
    public String getName() {
        return Name;
    }
    public void setName(String name){
    	this.Name = name; 	  
    	}
    
    /* Getter and setter for Year */
    public String getYear() {
       return Year;
    }
    public void setYear(String year){
		this.Year = year; 	  
	}
  
    /* Getter and setter for sum, total and percentage */

    public double getSum(){
        Sum = mathGrade + scienceGrade + englishGrade ; 
		return Sum;   
    }
    public int getGradesTotal(){
		return gradesTotal;  
	}
	public void setGradesTotal(int total){
		gradesTotal = total; 		   
	}
	
	public double getPercentage(){
		Percentage = (Sum / gradesTotal) * 100; 
		return Percentage;  
    }
    /* Print to string */
    @Override
    public String toString() {
    	    return String.format("Report Card:" +  "Math = " + mathGrade +
    	    	    "Science = " + scienceGrade + "\n" +
    	    	    "English = " + englishGrade + "\n" +
    	    	    "Name = " + Name + "\n" + 
    	            "Year = " + Year + "\n" + 
    	            "Percentage = " + Percentage + "\n"); 
    	 }
 	}
