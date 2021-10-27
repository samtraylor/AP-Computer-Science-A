// Lab03vst.java
// Student starting version of the Lab03 assignment.
// Resave this program as Lab03v80 for the 80 point version.
// Resave this program as Lab03v100 for the 100 point version.


public class Lab03vst
{
    public static void main(String[] args)
    {
      System.out.println("Lab03, 80 Point Version\n");
      int sec = 10000 ;
      int secHour = 3600 ;
      int secMin = 60 ;
      int hour = sec / secHour  ;
      int secHourRmn = 2800 ;
      int minRmn = secHourRmn / secHour ;
      int secRmn = secHourRmn % secHour ;
      System.out.println( "Starting Seconds:  "+ sec);
      System.out.println( "Hours:             "+ sec / secHour);
      System.out.println( "Minutes:           "+ secHourRmn / secMin);
      System.out.println( "Seconds:           "+ secHourRmn % secMin);
    }
} 

