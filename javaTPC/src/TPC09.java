public class TPC09 {
    public static void main(String[] args) {
        // JVM Memory Model2
        // heap Area => 객체가 생성되는 메모리 == new 연산자를 통해 만들어지는 부분

        int a = 30;
        int b = 50;

        //new 연산자를 통해 method area에 있는 sum 메서드를 heap Area에서 호출할 수 있도록 함.
        TPC09 tpc09 = new TPC09();
        int sum = tpc09.sum(a,b);

        System.out.println("sum = "+ sum);

    }
    public int sum (int a, int b ){
        int sum = a+b;
        return sum;
    }

}
