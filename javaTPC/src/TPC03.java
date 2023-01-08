import kr.bit.Book;
import kr.bit.Person;

public class TPC03 {

    public static void main(String[] args) {
        // TPC03 관계를 이해하라.

        // 정수 1개를 저장하기 위한 변수를 선언하시오.
        int a; // 변수 a를 선언
        a = 10;

        // 책 1권을 저장하기 위한 변수를 선언하시오
        Book b;
        b = new Book();
        // b    => b라는 인스턴스 변수 선언 (Instance 변수)
        // new  => 생성
        // Book => 객체
        // ();  => 생성자 함수

        b.title     = "자바";
        b.price     = 15000;
        b.company   = "한빛미디어";
        b.page      = 700;

        //println = 줄바꿈
        System.out.println("b.title     = "+ b.title);
        System.out.println("b.price     = "+ b.price);
        System.out.println("b.company   = "+ b.company);
        System.out.println("b.page      = "+ b.page);

        System.out.println("==============================================================");

        //print = 줄바꿈 없이
        System.out.print("b.title   = "+ b.title    + "\n");
        System.out.print("b.price   = "+ b.price    + "\n");
        System.out.print("b.company = "+ b.company  + "\n");
        System.out.print("b.page    = "+ b.page);


        Person p = new Person(); //p 라는 인스턴스 변수에 person 객체를 생성

        p.name = "리미";
        p.age =  31;
        p.weight = 86.4f;
        p.height = 171.8f;

    }

}
