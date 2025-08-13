package classesandobjects;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Hello everyone welcome to Spring1 module");

        Student student1 = new Student();
        System.out.println("student1 is : "+student1);

        Student student2 = new Student(123,"Ajay","ajay123@gmail.com","male","234,hdjei,nddjie,sjsisi","7th grade");
        System.out.println("student2 is : "+student2);

        //student1=student2;

        // assign the values to the object
        student1.id = 234;
        student1.name="Vijay";
        student1.email="vijay123@gmail.com";
        student1.address="234, deiei, sjki, siiw";
        student1.gender="male";
        student1.grade="7th grade";

        System.out.println("student1 after assigning values : "+student1);

        Demo demo = new Demo();
        System.out.println("abc is : "+demo.abc);
        demo.demo1();

        System.out.println("xyz is : "+Demo.xyz);
        Demo.demo2();

        int aaa = 100;
        final int bbb=900;

        aaa=400;
        //bbb=300; - final variable cannot be changed
    }
}
