package construct;

public class MethodInitMain2 {
    public static void main(String[] args) {

        //생성자가 필요한 이유
        //객체로 생성하는 시점에 작업을 하고 싶을때 이용.
        MemberInit member1 = new MemberInit();
        member1.InitMember("user1", 15, 90);

        MemberInit member2 = new MemberInit();
        member2.InitMember( "user2", 16, 80);

        MemberInit[] members = {member1, member2};

        for (MemberInit s : members) {
            System.out.println("이름: " + s.name +" 나이: " +s.age + " 성적: " + s.grade);
        }
    }
}
