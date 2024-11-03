/*
@FunctionalInterface
interface MyFunction{
    void run();
}

public class Main {

    public static void excute(MyFunction f1){
        f1.run();
        f1 = () -> System.out.println("Hello excute");  //들어온 f1을 재정의
        f1.run();
    }
    public static void main(String[] args) {

        MyFunction f1 = new MyFunction() {
            public void run() {
                System.out.println("Hello f1");
            }
        };

        MyFunction f2 = () -> System.out.println("Hello f2");

        f1.run();
        f2.run();
        excute(f1);

        */
/*MyFunction f3 = new MyFunction() {
            () -> System.out.println("Hello f3")
            람다식도 익명 "객체" 이기 때문에 인스턴스화가 진행된다.
            그래서 이런 형식의 코드는 X
        };*//*

    }
}*/
