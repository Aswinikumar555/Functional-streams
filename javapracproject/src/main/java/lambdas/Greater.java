package lambdas;

public class Greater {
    public void greet(Greating greating) {
        greating.perfrom();
    }

    public static void main(String[] args) {
        Greater greeter = new Greater();

        Greating lamda1 = () -> System.out.println("lamda1");
        Greating lamda2 = () -> System.out.println("lamda1");
        greeter.greet(lamda1);
        lamda1.perfrom();

        //object
        Greating innerClass = new Greating() {
            public void perfrom() {
                System.out.println("inner class");
            }
        };
        greeter.greet(innerClass);

    }
}
