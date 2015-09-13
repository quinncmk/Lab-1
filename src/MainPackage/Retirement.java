package MainPackage;

// import Scanner from library
import java.util.Scanner;

// import 2 accounting formulas from library
import org.apache.poi.ss.formula.functions.*;

public class Retirement {
  public static void main(String[] args) {
	  // Create a Scanner
	  java.util.Scanner input = new Scanner(System.in);
	  
	  // Prompt user to enter the years that they want to work
	  System.out.print("Please enter how many years you want to work: ");
	  double workYears = input.nextDouble();
	  
	  // Prompt user to enter their expected annual return on their investment
	  System.out.print("Please enter what is your expected annual return on your investment: ");
	  double annualReturnInvest = input.nextDouble();
	  
	  // Prompt user to enter how long they want to draw
	  System.out.print("Please enter how long you want to draw: ");
	  double yearsDraw = input.nextDouble();
	  
	  // Prompt user to enter the annual return when they retire
	  System.out.print("Please enter the annual return when you retire: ");
	  double annualReturnRetire = input.nextDouble();
	  
	  // Prompt user to enter their required income
	  System.out.print("Please enter your required income: ");
	  double requiredIncome = input.nextDouble();
	  
	  // Prompt user to enter their monthly SSI
	  System.out.print("Please enter your monthly SSI: ");
	  double monthlySSI = input.nextDouble();
	  
	  // To get monthly rate of return on thier investment 
	  double monthReturnInvest = annualReturnInvest / 12;
	  
	  // To get monthly rate of return when they retire
	  double monthReturnRetire = annualReturnRetire / 12;
	  
	  // To get how many monthes that they need to work 
	  double workMonth = workYears *12;
	  
	  // To get how many monthes that they want to draw
	  double monthDraw = yearsDraw * 12;
	  
	  // To get the payment by using required income to minus monthly SSI
	  double payment = requiredIncome - monthlySSI;
	  
	  // To assign present value to 0
	  double presentValue = 0;
	  
	  // To assign future value to 0
	  double futureValue = 0;
	  
	  // To assign boolean t to false
	  boolean t = false;
	  
	  // To calculate their present value 
	  double PV = FinanceLib.pv(monthReturnRetire, monthDraw, payment, futureValue, t);
	  
	  // To display the result of present value to user
	  System.out.println("The amount you need to save is " + PV);
	  
	  // To calculate their payment 
	  double PMT =FinanceLib.pmt(monthReturnInvest, workMonth, presentValue, PV, t);
	  
	  // To display the result of their payment
	  System.out.println("The amount you need to save each month is " + PMT);
	  
	  
  }
}
