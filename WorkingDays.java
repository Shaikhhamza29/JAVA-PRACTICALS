public class WorkingDays {
    enum Days{
        Sunday,
        Monday,
        Tuesday,
        Wednesday,
        Thurday,
        Friday,
        Saturday

    }
    public static void main(String args[]) {
        for (Days d : Days.values()){
            weekend(d);
        }
    }
    
    public static void weekend(Days d) {
        if (d.equals(Days.Sunday)){
            System.out.println("Value = " + d + " Holiday");
        }
        else{
            System.out.println("Value = "+ d +" Working days");
        }
    }
}
