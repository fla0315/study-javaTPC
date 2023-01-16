import kr.tpc.BookVO;

public class TPC11 {
    public static void main(String[] args) {
        // TPC11 객체가 메모리에 어떻게 만들어지나 객체생성과정
        // 책 1권을 저장하기위해 [객체를 생성] 하시오

        //자료형 변수 할당
        BookVO vo = new BookVO();
        
        //객체를 생성하여 값 설정
        vo.title ="파이썬";
        vo.price = 14999;
        vo.company = "에이콘";
        vo.page =500;

    }
}
