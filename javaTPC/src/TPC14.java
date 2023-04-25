import kr.tpc.MemberVO;

public class TPC14 {


    public static void main(String[] args) {
        /**
         * 정보은닉 (private) : 다른 객채 (class)로부터 접근을 막는 것
         * */

        /**
         * private 멤버 변수에 접근을 위해 getter, setter 메서드를 이용해 접근한다.
         *
         * */
        MemberVO m = new MemberVO();

        /**
            m.name = "홍길동";
            m.age = 50;
            m.tel = "010-1111-2222";
            m.addr = "서울";

            System.out.print(m.name+"\t");
            System.out.print(m.age+"\t");
            System.out.print(m.tel+"\t");
            System.out.print(m.addr+"\t");

         접근제한자로 인해 값에 접근을 못함 setter, gettet 메서드로 접근을 해야함.

         */

        m.setName("홍길동");
        m.setAge(31);
        m.setTel("010-9173-9759");
        m.setAddr("서울특별시 관악구 솔밭로 2길 25 수빌리지");

        System.out.print(m.getName()+"\t");
        System.out.print(m.getAge()+"\t");
        System.out.print(m.getTel()+"\t");
        System.out.print(m.getAddr()+"\t");

    }
}
