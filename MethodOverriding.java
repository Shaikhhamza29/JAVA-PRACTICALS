class Class1 {
    void printhello(){
        System.out.println("HELLO");
    }    
}

class Class2 extends Class1{
    void printhello(){
        System.out.println("WORLD");
    }
}

class MethodOverriding extends Class2{
    public static void main(String args[]) {
        Class2 obj = new Class2();
        obj.printhello();
    }
}
