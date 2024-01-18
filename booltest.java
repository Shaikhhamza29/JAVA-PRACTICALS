class booltest
{
    public static void main(String args[]) 
    {
        boolean b;
        b = false;
        System.out.println(" b is : "+ b);
        b = true;
        System.out.println(" b is : "+ b);
        if(b) System.out.println("THIS IS EXECUTED !");
        b = false;
        if(b) System.out.println("THIS IS NOT EXECUTED !");
        System.out.println(" 10 > 9 : "+(10>9));    
    }
}