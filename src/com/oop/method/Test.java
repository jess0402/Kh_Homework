package com.oop.method;

public class Test {
    int a = 100;
    static int s = 99;
    
    public static void main(String[] args) {
        Test t = new Test();
        t.test1(); 
        /* 1000 
         * 99
         */
        /*정답
         * 100
         * 99
         */
        
        t.test2();
        /* 100
         */
        /* 정답
         * 100
         */
        
        Test t3 = new Test();
        t.test3(t3); 
        System.out.println(t3.a); // 10
        /*10
         * ?
         */
        /*정답
         * 10
         * 10
         */
        
    	System.out.println("******");
        t.test4(t);
        /* 1000  
         */
        /* 정답
         * 1000
         */
            
    }

    public void test1() {
        int a = 1000;
        int s = 999;
        System.out.println(this.a);
        System.out.println(Test.s);
    }

    public void test2() {
        Test t = new Test();
        t.a = 1000;
        System.out.println(a);
    }

    public void test3(Test t) {
        t.a = 10; // t3.a = 10
        System.out.println("원래 a : " + a); //100 
        this.a = 200; // 
        System.out.println("바뀐 a : " + a); // 200
        System.out.println(t.a); //10..?
    }

    public void test4(Test t) {
        t.a = 1000;
        System.out.println(this.a);

    }

}