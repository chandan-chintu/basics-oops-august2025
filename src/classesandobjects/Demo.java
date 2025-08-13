package classesandobjects;

public class Demo {

    int abc=100; // this is non static variable - requires object
    static int xyz = 200; // static variable - does not requires object

    public void demo1(){
        System.out.println("demo1 - this is non static method");
    }

    public static void demo2(){
        System.out.println("demo2 - this is static method");
    }
}
