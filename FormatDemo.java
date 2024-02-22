import java.util.Formatter;

class FormatDemo {
    public static void main(String args[]) {
        Formatter fmt = new Formatter();
        fmt.format("FORMATTING %s is easy %d %f", "with java ",10,98.6);
        System.out.println(fmt);
        fmt.close();
    }    
}
