

public class Main {

    public static void main(String[] args) {
        Lambda1 lambda1 = new Lambda1();
        Lambda2 calculator = new Lambda2();

        System.out.println("[Lambda1 class 실행]");
        lambda1.lambda1_run();
        System.out.println();

        System.out.println("[Lambda2 class 실행]");
        calculator.calculator_run();
    }
}