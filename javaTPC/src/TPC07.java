public class TPC07 {
    public static void main(String[] args) {

        //TPC07 메서드의 매개변수 전달기법(parameter passing)

        /**
         * Call by value (값 전달 기법) => 기억공간 개별
         * 
         * 
         * Call by reference (번지 전달 기법) => 기억공간 공유
         *
         * */

        int a = 20;
        float b = 56.11f;

        float sum = sum(a,b); // Call by value => 값 전달 기법
        System.out.println("float sum = "+sum);

        int[]arr = {1,2,3,4,5};
        // 배열의 총합
        int intSum = arrSum(arr); // Call by reference => 주소전달 기법
    }

    public static float sum(int a, float b){
        float sum = a+b;
        return sum;
    }
    public static int arrSum(int[] arr){
        int intSum = 0;
        for (int i = 0; i < arr.length; i++) {
            intSum += arr[i];
        }
        return intSum;
    }

}
