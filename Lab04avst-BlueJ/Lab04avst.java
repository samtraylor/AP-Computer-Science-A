// Lab04avst.java
// The Mortgage Payment Program
// This the student, starting version of the Lab04a assignment.

 
public class Lab04avst
{
    public static void main(String[] args)
    {
        //Naming conventions explained
        //princiPlusOne- reslt of the Principal amount plus one
        //parenPowered- result of The contents of the parenthesis to the power of numMonth's value
        //topLine- result of everything on the top half of the fraction INSIDE the brackets.
        //bottomline- result of everything on the bottom half of the fraction 
        //bracketTotal- result of everything in the bracket AFTER division
        //morgageFinal- returns the entirety of the the eqution
        
        System.out.println("Lab04a, 90 Point Version");

        double principal  = 250000;
        double annualRate = 4.85;
        double numYears   = 30;      
        
        double monthlyRate = annualRate / 1200;
        double numMonths = numYears * 12; 
        double monthPlusOne = monthlyRate + 1;
        double parenPowered = Math.pow(monthPlusOne, numMonths);
        
        double topLine = monthlyRate * parenPowered;
        double bottomLine = parenPowered - 1;
        double bracketTotal = topLine / bottomLine;
        double morgageMonthly = bracketTotal * principal;
        
        double totalPayments = morgageMonthly * numMonths;
        double totalInterest = totalPayments - principal;
        System.out.println();
        System.out.println();
        System.out.println("Principal:        $" + principal);     
        System.out.println("Annual Rate:      $" + annualRate);
        System.out.println("Number of Year:   $" + numYears);     
        
        System.out.println("Monthly Payments: $" + morgageMonthly);
        System.out.println("Total Payments:   $" + totalPayments);
        System.out.println("Total Interest:   $" + totalInterest);
        
    
    }
}

