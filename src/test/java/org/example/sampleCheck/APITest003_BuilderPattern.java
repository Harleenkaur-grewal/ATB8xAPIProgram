package org.example.sampleCheck;

public class APITest003_BuilderPattern {
    public APITest003_BuilderPattern step1(){
        System.out.println("step1 created");
        System.out.println("step1 done");
        return this;
    }
    public APITest003_BuilderPattern step2(){
        System.out.println("step2 created");
        System.out.println("step2 done");
        return this;
    }
    public APITest003_BuilderPattern step3(String name){
        System.out.println("step3 created "+ name);
        System.out.println("step3 done");
        return this;
    }
    public static void main(String[] args) {
        APITest003_BuilderPattern np =new APITest003_BuilderPattern();
        np.step1().step2().step3("Harry");

    }
}
