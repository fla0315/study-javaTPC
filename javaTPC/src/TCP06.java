public class TCP06 {

    public static void main(String[] args) {
        //TPC06 변수와 메서드

        /**
         * 변수 - 데이터를 한개만 (한개의 형태) 저장 가능하다. => 저장만한다
         * */


        /**
         * *** 메서드 -> 동작(method), 기능(function)
         * 메서드 - 동작을 한 후에 데이터를 한개만 만들어 낸다 -> 동작후 저장한다.
         *
         * 메서드의 형태 -
         * 접근제어자 리턴타입 메서드이름 (매개변수 리스트){
         *      //처리부분 (로직)
         *      //리턴여부 -> return
         * }
         *
         * */

        int a = 67;
        int b = 67;
        int result = sum(a,b); //=> a,b 매개변수 전달기법 call by value

        System.out.println("result = "+result);

        int[] arr = makeArr();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("sum = "+ sum);

    }
    // 정수 2개를 매개변수로 받아서 총합을 구하여 리턴하는 메서드를 정의하시오.
    public static int sum(int a, int b){

        int sum = a+b;

        return sum;
    }

    // 10 ,20 ,30 return 을 여러개 하고 싶을때
    public static int[] makeArr(){
        int x = 10;
        int y = 20;
        int z = 30;

        int[]arr = new int[3];
        arr[0] = x;
        arr[1] = y;
        arr[2] = z;

        return arr;
    }




}
