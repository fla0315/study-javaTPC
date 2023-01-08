public class TPC02 {

    public static void main(String[] args) {
        // 프로그래밍의 3대 요소 : 변수 , 자료형(DataType), 할당(=)
        // 1+1=2

        // int 자료형
        // 크기 : 4byte
        // 종류 : 정수
        int a,b,c;
        a = 1;  //a라는 변수에 1을 할당
        b = 1;  //b라는 변수에 1을 할당
        c = a+b;
        // 출력
        System.out.println("int = "+c);

        // short , long
        // 크기 : 2 , 4 byte
        // 종류 : 정수
        short s;
        s = 10;
        System.out.println("short = "+s);

        long l;
        l = 10000000L;
        System.out.println("long = "+ l);

        // float  , double 자료형
        // 크기 : 4, 8 byte
        // 종류 : 실수
        float f;
        f = 34.5f;
        System.out.println("float = "+ f);

        // char 자료형
        // 크기 : 2 byte
        // 종류 : 문자
        char character;
        character = 'C';
        System.out.println("character = "+c);

        // boolean 자료형
        // 크기 1 byte
        // 종류 : 참거짓

        boolean bool;
        bool = false;
        System.out.println("boolean = "+ bool);

        /*
            1. 변수 , 자료형 , 할당

            1. 변수 (Variable)
                ㄴ 데이터를 저장할 메모리에 공간의 이름
            2. 자료형 (Data Type)
                ㄴ 변수의 크기와 변수에 저장될 데이터의 종류를 결정하는 것
            3. 할당 (Assign)
                ㄴ 변수에 값을 저장(대입,할당)하는 것

            * 변수선언 - 메모리에 변수(기억공간)를 만드는 것
            * 할당  a = b  -> b의 값을 a에 할당하는 것

        */

    }//end

}
