import java.util.*;
class GregorianCalendarDemo {
    public static void main(String args[]) {
        String months[] ={ "JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"};
        int year;
        GregorianCalendar gcalerder = new GregorianCalendar();
        System.out.print("DATE: ");
        System.out.print(months[gcalerder.get(gcalerder.MONTH)]);
        System.out.print(" "+ gcalerder.get(Calendar.DATE)+" ");
        System.out.println(year = gcalerder.get(gcalerder.YEAR));

        System.out.print("TIME : ");
        System.out.print(gcalerder.get(Calendar.HOUR));
        System.out.print(":" + gcalerder.get(Calendar.MINUTE)+":");
        System.out.println(gcalerder.get(Calendar.SECOND));
        

        if(gcalerder.isLeapYear(year)){
            System.out.println("THE CURRENT YEAR IS THE LEAP YEAR ");
        }
        else{
            System.out.println("THE CURRENT YEAR IS NOT THE LEAP YEAR ");
        }
    }    
}
