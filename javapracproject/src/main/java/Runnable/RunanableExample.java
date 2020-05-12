package Runnable;

public class RunanableExample {
    public static void main(String[] args) {
        Thread mythred = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("inside runnabl");
            }
        });
        mythred.run();

        //lambda

        Thread mythredLambda = new Thread(() -> System.out.println("inside lambda runnable"));
        mythredLambda.run();
    }

}
