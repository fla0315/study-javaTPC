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


    }//end

}
