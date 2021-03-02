import java.util.Scanner;
import java.lang.Math; 

class Main {
		  public static void main(String[] args) {
			  Scanner myObj = new Scanner(System.in);

			  System.out.println("Enter investment amount: ");
        Double investmentAmount = myObj.nextDouble(); 

			  System.out.println("Enter annual interest rate: ");
        Double annualInterestRate = myObj.nextDouble();

			  System.out.println("Enter number of years: "); 
        Double numberOfYears = myObj.nextDouble(); 

        Double one =  1 + ((annualInterestRate/100)/12); 
        Double two = numberOfYears*12; 
        
			  Double futureInvestmentValue = Math.pow(one,two);
			  System.out.println("Accumulated value is $" +  String.format("%.2f",(investmentAmount * futureInvestmentValue)));
			  
		  }
	
		  }
