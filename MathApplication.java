class Mathoperation {
    static float mul(float x, float y){
        return x*y;
    }    
    static float div(float x, float y){
        return x/y;
    }
}
 
public class MathApplication {
    public static void main(String args[]){
        float a = MathOperation.mul(4.0,5.0);
        float b = MathOperation.div(a,2.0);
        System.out.println("b = "+b);
        
    }
}