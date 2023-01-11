public class TPC08 {
    public static void main(String[] args) {

        //TPC08 JVM의 메모리 모델

        /**
         * JVM이 TPC08 Class(실행 클래스)를 실행하는 절차
         *
         * 1. 해당 클래스를 현재 디렉토리에서 찾는다.
         *
         * 2. 찾으면 클래스 내부에 있는 static 키워드가 있는 메서드를 메모리로 로딩한다.
         *    - method Area의 static zone에 로딩한다. main() method
         *
         *    - method Area는 static zone과 non static zone으로 나뉜다
         *
         * 3. static zone에서 main()메서드를 실행한다(호츌,시작)
         *    - main() method가 호출되면 main() method 호출정보가 Stack Area에 들어간다(push)
         *    - 프로그램이 시작되는 부분이다.(PC의 위차가 현재 동작되고 있는 메서드다.)
         *
         * 4. Stack Area가 비어 있으면 프로그램이 종료된 것이다.
         *   - LIFO -> Last in First Out -> 맨 마지막에 들어간것이 가장 먼저 나온다
         * */

        // 실습
        int a = 30;
        int b = 30;

        int sum = add(a,b); // static method call
        System.out.println("sum = "+ sum);

    }
    public static int add(int a, int b){
        int sum = a+b;
        return sum;
    }

}
