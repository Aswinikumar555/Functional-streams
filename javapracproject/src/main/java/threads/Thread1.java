package threads;

class Runner extends Thread {

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

public class Thread1 {
    public static void main(String[] args) {
        System.out.println("ghjk");
        Runner r1 = new Runner();
        System.out.println("r2");
        Runner r2 = new Runner();

        r1.start();
        r2.start();
    }
}
