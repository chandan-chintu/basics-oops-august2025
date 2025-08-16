package interfaceexample;

public class SampleClass implements SampleInterface, SampleInterface2{
    @Override
    public void sample1() {
        System.out.println("sample1 implementation inside sampleclass");
        System.out.println("aaa is :"+SampleInterface.aaa);
    }

    @Override
    public void sample2() {
        System.out.println("sample2 implementation inside sampleclass");
        System.out.println("bbb is :"+SampleInterface.bbb);
    }

    @Override
    public void sample3() {
        System.out.println("sample3 implementation inside sampleclass");
    }
}
