package polymorphismexample;

public class PerformSum {

    public void sum(int a, int b){
        System.out.println("sum of two int numbers is : "+(a+b));
    }

    public int sum(int a, int b,int c){
        System.out.println("sum of three int numbers is : "+(a+b+c));
        return (a+b+c);
    }

    public void sum(float a, float b){
        System.out.println("sum of two float numbers is : "+(a+b));
    }

    public void sum(double a, double b){
        System.out.println("sum of two double numbers is : "+(a+b));
    }

    public void sum(int a, double b){
        System.out.println("sum of one int an one double numbers is : "+(a+b));
    }
}
