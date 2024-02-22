class Rectangle1 {
    int length , width;
    Rectangle1(int x ,int y){
        length = x;
        width = y;
    }    
    int rectArea(){
        return(length * width);
    }
}
class RectangleArea{
    public static void main(String args[]) {
        Rectangle1 rect1 = new Rectangle1(15, 10);
        int area1 = rect1.rectArea();
        System.out.println("Area = "+area1);
    }
}