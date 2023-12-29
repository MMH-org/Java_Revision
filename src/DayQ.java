package src;



class Parent{}
class Child extends Parent{
    public void hello(){
        System.out.println("hello");
    }
}
public class DayQ {
    public static void main(String[] args) {
        Child child=new Child();
        child.hello(); // find Answer hello, Compiler error, and Runtime exception
    }
}
