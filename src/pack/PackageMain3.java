package pack;

import pack.b.User;

public class PackageMain3 {

    public static void main(String[] args) {
        User userB = new User();    //import는 1개만 사용 가능
        pack.a.User userA = new pack.a.User();
    }
}
