package an;

import javax.management.DescriptorKey;

class Parent {
    void ParentMethod() {
    }
}

class Child extends Parent {
    @Override
    @Deprecated
    void ParentMethod() {}
}

@FunctionalInterface
interface Testable {
//    void test();      //추상 메서드
    void check();
}

public class AnnotationEx {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Child c = new Child();
        c.ParentMethod();   //deprecated된 메서드 사용
    }
}
