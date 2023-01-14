package kr.tpc;

public class BookDTO {

    /**
     * 보이지는 않지만 default 생성자가 생략되어 있음
     * */
    public BookDTO(){
        super();
        //생성자에서 객체를 생성하는 작업한다. => (기계어코드)
    }

    //제목
    public String title;

    //가격
    public int price;

    //출판사
    public String company;

    //페이지
    public int page;

}
