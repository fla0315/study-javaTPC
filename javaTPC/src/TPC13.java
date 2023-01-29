import kr.tpc.BookVO;
import kr.tpc.Inflearn;

public class TPC13 {
    public static void main(String[] args) {
        /**
         * private 생성자 메서드 (Constructor)
         * -> 객체 생서어에 관여하는 생성자 메서드가 private 접근제어를 가지면 객체를 생상할 수 없다는 뜻이된다.
         * -> 그러므로 객체를 생성하지 않고도 사용가능 해야 된다.(모든 클래스의 멤버가 static 멤버가 되어야 한다)
         *
         * non-static 멤버인 경우 (인스턴스 메서드)
         * new로 객체 생성 후 접근 가능
         *
         * static 멤버인 경우 (클래스 메서드)
         * 객체 생성 없이 접근 가능 (클래스 이름으로 접근)
         *
         * */

        //클래스 메서드를 통해 생성자 없이 메서드 사용 가능
        Inflearn.java();

        //인스턴스 메서드로 new로 객체 생성 후 사용 가능
        Inflearn inf = new Inflearn();
        inf.tpc();

        //만일 new라는 객체르 사용하고 싶지 않으면 private 생성자를 생성하면 new 객체 참조 못함

    }
}
