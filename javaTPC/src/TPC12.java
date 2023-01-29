import kr.tpc.BookVO;

public class TPC12 {
    public static void main(String[] args) {
        //TPC12 객체가 메모리에 어떻게 만들어지나.

        /**
         * 생성자 메서드 (Constructor)
         * 1. 객체가 생성할 때 사용되는 메서드
         * 2. 객체 생성 후 객체의 초기화를 하는 역할 수행
         * 3. 특징
         *     - 클래스이름과 동일한 메서드
         *     - 메서드의 return type이 없다. (void 아님)
         *     - public 접근 권한을 가진다. (단, private 생성자도 있음)
         *     - 생성자가 없을 때는 기본 생성자가 만들어진다.
         *
         * ====== 생성자 -> 생성 + 초기화 -> 중복정의 가능
         * */

        BookVO vo = new BookVO();
        // 객체가 생성되며 생성자로 초기화ㄱㄱㄱ
        
        //  생성자를 통해 초기화된 값 호출
        String title = vo.title;
        int price = vo.price;
        String company = vo.company;
        int page = vo.page;

        System.out.println("title   = "+ title);
        System.out.println("price   = "+ price);
        System.out.println("company = "+ company);
        System.out.println("page    = "+ page);


        //초기화 된 값을 다른 객체에서도 가져온다
        BookVO vo2 = new BookVO();
        String title2 = vo2.title;
        int price2 = vo2.price;
        String company2 = vo2.company;
        int page2 = vo2.page;

        System.out.println("title2   = "+ title2);
        System.out.println("price2   = "+ price2);
        System.out.println("company2 = "+ company2);
        System.out.println("page2    = "+ page2);

        System.out.println("vo 주소값 = "+ vo.hashCode());
        System.out.println("vo2 주소값 = "+ vo2.hashCode());

        System.out.println("vo.equals(vo2) = "+ vo.equals(vo2));


        BookVO vo3 = new BookVO("파이썬", 13333, "대림", 600);

        System.out.println("title3   = "+ vo3.title);
        System.out.println("price3   = "+ vo3.price);
        System.out.println("company3 = "+ vo3.company);
        System.out.println("page3    = "+ vo3.page);
        System.out.println();

        BookVOasdaasd

    }
}
