/*
@FunctionalInterface와 Comparator 인터페이스를 공부하다 생긴 의문점을 공부하기 위한 클래스
목표 : 객체 A의 메서드 오버라이딩을 추상메서드 형식으로 할 수 있는가?
*/

import java.util.HashMap;

public class FunctionalInterfaceTest{
    private String name;

    public boolean equals(FunctionalInterfaceTest fit) {
        return (this == fit);
    }

    public void test (Object obj){
        System.out.println(obj);
    }

    public void test2(){
        Object MyFunctionTest = new String();
        Object test2 = new HashMap<String, String>();
        test(MyFunctionTest);
    }
}

@FunctionalInterface
interface MyFunctionTest{
    int MyFunction_1(int a, int b);
    //boolean eaquals(Object obj);
}
