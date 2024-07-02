// PARTNER NAME: 
// PARTNER NAME: 
// CS111 SECTION #: 
// DATE: 

public class Main
{
    public static void main(String[] args)
    {
        //DECLARATION + INITIALIZATION SECTION
        int monthToday = 8;
        int dayToday = 26;
        int yearToday = 1918;
        int result;

        //INPUT SECTION
        // Still no input just yet...

        //CALCULATION SECTION
        result = Main.calcJulianDate(monthToday, dayToday, yearToday);

        //OUTPUT SECTION
        System.out.println("The calculated julian date is: " + result);
    }


    // DESCRIPTION:	Method to take in the current date and convert into the julian date
    // PRECONDITIONS: parameters passed in to the method are valid integers, monthToday < 12
    // POSTCONDITIONS: returns the calculated julian date
    public static int calcJulianDate(int monthToday, int dayToday, int yearToday){
        //DECLARATION + INITIALIZATION SECTION
        int jdnDate, y, m, a;

        //INPUT SECTION
        // N/A

        //CALCULATION SECTION

        a = (14 - monthToday) / 12;
        m = monthToday + 12 * a - 3;
        y = yearToday + 4800 - a;
        jdnDate = dayToday + (153 * m + 2) / 5  + 365 * y + y / 4 -  y / 100 + y  / 400 - 32045;

        //OUTPUT SECTION
        //n/a

        return jdnDate;

    }

}