public class TPC04 {

    public static void main(String[] args) {
        //TPC04 데이터를 이동하라(변수 VS 배열의 관계)

        /**
         * Array(배열) =>
         * 동일한 타입의 데이터를 여러 개 저장하기 위한 연속적인 메모리 구조
         *
         * 배열의 특징
         * 1. 많은 수의 변수를 만들기가 용이하다.
         * 2. 기억공간 접근이 쉽다 (반복문 사용가능)
         * 3. 데이터 이동이 쉽다 (데이터를 하나의 형태로 담아서 이동가능)
         *
         * but. 서로 다른 데이터 타입(이질적인 구조, 객체)를 저장할 수 없다.
         * */

        int a,b,c;
        a = 10;
        b = 20;
        c = 30;

        // a+b+c =? 메서드 처리 -> sum()

        //함수 호출
        sum(a,b,c);

        //int가 여러개 있는 경우 효율적으로 값을 관리하기 위해 배열을 사용

        int[] arr = new int[3]; //int 배열 선언 후 객체 생성 ㅁㅁㅁ 총 3개의 방이 생성
        arr[0] = a; //10
        arr[1] = b; //20
        arr[2] = c; //30

        //배열 함수 sum함수 호출
        arraySum(arr);

    }//end

    // 합계 메서드
    public static void sum(int a, int b, int c){

        //합계
        int sum = (a+b+c);
        System.out.println("sum = " +sum);

    }

    // 배열 합계 메서드
    public static void arraySum(int[] arr){

        /**
         * - for 반복문
         *
         *   for(초기화식; 조건식; 증감식) {
         *
         *       조건식이 true일 경우 실행문 동작
         *
         *   }
         *
         */

        // 합계 초기값 설정
        int arraySum = 0;
        for (int i = 0; i < arr.length; i++) {
            arraySum += arr[i];
        }
        System.out.println("for arraySum = " +arraySum);

        /**===========================================================*/

        /**
         * - while 반복문
         *
         *   while(조건식){
         *
         *      조건식이 true일 경우
         *      실행문 동작
         *
         *   }
         *
         * */

        int length = arr.length;
        int whileSum = 0;
        while (length-- > 0){
            whileSum += arr[length];
        }
        System.out.println("while whileSum = " +whileSum);

        /**===========================================================*/

        /**
         * - do while 반복문
         *
         *    do {
         *
         *        무조건 한번은 최초 실행 동작
         *
         *        그 후 조건식이 true 일 경우 동작
         *
         *    } while (조건식);
         *
         * */

        int doWhileLength = arr.length;
        int doWhileSum = 0;
        do {
            //ArrayIndexOutOfBoundsException 방지를 위해 초기값 셋
            if(doWhileLength != 3){
                doWhileSum += arr[doWhileLength];
            }
        } while (doWhileLength-- > 0);

        System.out.println("do while doWhileSum = " +doWhileSum);

    }

}
