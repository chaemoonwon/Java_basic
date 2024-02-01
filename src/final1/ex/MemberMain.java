package final1.ex;

public class MemberMain {

    public static void main(String[] args) {
        Member member = new Member("myId", "kim");
        member.print();

        //final키워드를 사용했기 때문에 값을 변경하는 것은 불가함.
        member.changeData("myId2", "seo");
        member.print();
    }
}
