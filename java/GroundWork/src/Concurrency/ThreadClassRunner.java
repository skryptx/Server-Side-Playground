package Concurrency;

import java.util.stream.IntStream;

//Way 1
class Task101to200 extends Thread {
    public void run() {
        for(int num: IntStream.range(101,201).toArray()) {
            System.out.printf("%d ",num);
        }
    }
}

//Way 2
class Task201to300 implements Runnable {
    public void run() {
        for(int num: IntStream.range(201,301).toArray()) {
            System.out.printf("%d ",num);
        }
    }
}
public class ThreadClassRunner {
    public static void main(String[] args) {
        //task1
        Task101to200 task101to200 = new Task101to200();
        task101to200.start();

        //task2
        Task201to300 task201to300 = new Task201to300();
        Thread thread201to300 = new Thread(task201to300);
        thread201to300.start(); 
    }
}
