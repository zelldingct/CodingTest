package javaDataStructure.exceptionSample;

public class tryCatchExample {

    public static void main(String[] args) {
        int a,b,result;
        a=3;
        b=0;
        try{
            result = a/b;
            System.out.println("실제로 실행되어야하는 함수");
        }catch(ArithmeticException e) {
            System.out.println("Arithmetic Exception 발생");
        }finally{
            //보통 에러 메세지를 담는다. 여러가지 Exception이 있을 수 있으니까
            System.out.println("최종적으로 이렇게 처리하시오");
            result = b/a;
            System.out.println(result);
        }
        System.out.println("main 함수 실행종료");
    }

}
