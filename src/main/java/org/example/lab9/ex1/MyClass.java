package org.example.lab9.ex1;

public class MyClass implements Runnable {

    private String name;
    private int index = 0;

    public MyClass(String name) {
        this.name = name;
        index++;
    }

    @Override
    public void run() {
        for (int i = 0; i < index; i++) {
            System.out.println(Thread.currentThread().getName() + "  " + name);
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
