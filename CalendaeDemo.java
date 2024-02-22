import java.util.Calendar;
class CalendaeDemo {
    public static void main(String args[]) {
        String months[] = { "JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"};
        Calendar calendar = Calendar.getInstance();
        System.out.print("DATE: ");
        System.out.print(months[calendar.get(calendar.MONTH)]);
        System.out.print(" "+ calendar.get(Calendar.DATE)+" ");
        System.out.println(calendar.get(calendar.YEAR));

        System.out.print("TIME : ");
        System.out.print(calendar.get(Calendar.HOUR));
        System.out.print(":" + calendar.get(Calendar.MINUTE)+":");
        System.out.println(calendar.get(Calendar.SECOND));

        calendar.set(Calendar.HOUR,10);
        calendar.set(Calendar.MINUTE,29);
        calendar.set(Calendar.SECOND,22);
        System.out.println("UPDATED TIME");
        System.out.print("TIME : ");
        System.out.print(calendar.get(Calendar.HOUR));
        System.out.print(":" + calendar.get(Calendar.MINUTE)+":");
        System.out.println(calendar.get(Calendar.SECOND));


    }
}
