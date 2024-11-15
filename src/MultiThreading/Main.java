package MultiThreading;

public class Main {
    public static void main(String[] args) {
        // Creating Objects
        A obj1 = new A();
        B obj2 = new B();
        // To start the Thread;
        obj1.start();
        obj2.start();

        // By using Runnable

        C obj3 = new C();
        D obj4 = new D();
        Thread t1 = new Thread(obj3);
        Thread t2 = new Thread(obj4);
        t1.start();
        t2.start();
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
