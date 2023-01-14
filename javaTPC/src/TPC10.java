import kr.tpc.BookDTO;

public class TPC10 {

    public static void main(String[] args) {
        //기본자료형 vs 사용자정의자료형
        /**
         * 기본자료형
         *  - 컴파일러에서 기본적으로 제공해주는 자료형
         *  int , float, char, boolean -> PDT
         * */

        int a;
        a = 10;

        /**
         * 사용자정의자료형
         *  - 사용자가 직접 만들어서 사용하는 자료형
         * */
        // 책이라는 자료형을 만들자 --> class
        BookDTO book = new BookDTO(); // => new 연산자를 통해 객체 생성

        book.title = "자바";
        book.price = 50000;
        book.company = "한빛소프트";
        book.page = 500;

        System.out.println("title = "   + book.title);
        System.out.println("price = "   + book.price);
        System.out.println("company = " + book.company);
        System.out.println("page = "    + book.page);

    }



}
