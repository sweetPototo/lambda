@FunctionalInterface
interface MyCalculator{
    int calculate(int a, int b);
}

public class Main {

    public static int product(MyCalculator cal1, MyCalculator cal2) {
        int a = cal1.calculate(1, 1);
        int b = cal2.calculate(5, 3);
        return a * b;
    }

    public static MyCalculator myCal(){
        return (a, b) -> a % b;
    }
    public static void main(String[] args) {
        int result1, result2, result3, result4;

        MyCalculator add = (a, b) -> a + b; //객체 재정의 및 생성
        result1 = add.calculate(1, 2);

        MyCalculator minus = (a, b) -> a - b;
        result2 = minus.calculate(5, 2);

        result3 = product(add, minus);

        MyCalculator division = myCal();
        result4 = division.calculate(6, 3);

        System.out.println("result1(add 1 + 2) = " + result1);
        System.out.println("result2(minus 5 - 2) = " + result2);
        System.out.println("result3(product add(1 + 1) * minus(5 - 3)) = " + result3);
        System.out.println("result4(divison 6 % 3) = " + result4);
    }
}