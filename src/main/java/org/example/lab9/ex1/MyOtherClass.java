package org.example.lab9.ex1;

public class MyOtherClass {
    public static void main(String[] args) throws InterruptedException {

        MyClass myClass = new MyClass("clasa 0");
        MyClass myClass1 = new MyClass("clasa 1");
        MyClass myClass2 = new MyClass("clasa 2");


        Thread thread1 = new Thread(myClass);
        Thread thread2 = new Thread(myClass1);
        Thread thread3 = new Thread(myClass2);

        thread1.start();
        thread2.start();
        thread3.start();

    }


}
