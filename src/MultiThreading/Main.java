package MultiThreading;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Creating Objects
        // A obj1 = new A();
        // B obj2 = new B();
        // // To start the Thread;
        // obj1.start();
        // obj2.start();

        // // By using Runnable

        // C obj3 = new C();
        // D obj4 = new D();
        // Thread t1 = new Thread(obj3);
        // Thread t2 = new Thread(obj4);
        // t1.start();
        // t2.start();

        // As Runnable is a Function Interface we can use lambda Functions
        Runnable E = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("From Lambda Fn E");
            }
        };
        Runnable F = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("From Lambda Fn F");
            }
        };
        Thread t3 = new Thread(E);
        Thread t4 = new Thread(F);
        t3.start();
        t4.start();
        // This Makes the other thread to wait until this thread get executes;
        t4.join();
        t3.join();
        // To set priority Explicitly
        t4.setPriority(20);
    }
}

// Creating a Thread for class A
class A extends Thread {
    // Run method has to be overriden
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println("From class A");
        }
    }
}

// Creating a Thread for class B
class B extends Thread {
    // Run method has to be overriden
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println("From class B");
        }
    }
}

// By using Runnable Interface

class C implements Runnable {
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println("From class C");
        }
    }
}

class D implements Runnable {
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println("From class D");
        }
    }
}
