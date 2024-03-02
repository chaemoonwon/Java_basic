package en;

import java.util.EnumSet;

/*
class Fruit {
    public static final Fruit APPLE = new Fruit();
    public static final Fruit PEACH = new Fruit();
    public static final Fruit BANANA = new Fruit();
}
*/
// ==
    enum Fruit {
        APPLE("red"), PEACH("pink"), BANANA("yellow");
            private final String color; //값을 변경하지 못하게 막음.

            //메서드
            public String getColor() {
                return this.color;
    }

    //생성자
    Fruit(String color) {
        System.out.println("Call Constructor " +this);
        this.color = color;
    }
}

enum Company {
    GOOGLE, APPLE, ORACLE
}

public class ConstantV3 {

    public static void main(String[] args) {

        //enum형은 생성할때마다 계속 생성자가 출력되는 것을 확인할 수 있음.
        Fruit type = Fruit.APPLE;
        switch (type) {
            case APPLE -> System.out.println(57 + "kcal, color : " + Fruit.APPLE.getColor());
            case PEACH -> System.out.println(34 + "kcal, color : " + Fruit.PEACH.getColor());
            case BANANA -> System.out.println(93 + "kcal, color : " + Fruit.BANANA.getColor());
        }

        /*
         *  values()
         *  enum의 요소들을 순서대로 enum타입의 배열로 리턴.
         *  열거된 모든 원소를 배열에 담아 순서대로 반환
         */
        for (Fruit f : Fruit.values()) {
            System.out.println("f = " + f);
            System.out.println("f = " + f.getColor());
        }


        /*
        * valueOf()
        * 매개변수로 주어진 String과 열거형에서 일치하는 이름을 갖는 원소를 반환
        * (주어진 String과 일치하는 원소가 없는 경우 IllegalArgumentException 예외 발생)
        *
        * */
        Fruit FV = Fruit.valueOf("APPLE");
        Fruit FV2 = Enum.valueOf(Fruit.class, "APPLE");
        System.out.println(FV.getColor());
        System.out.println(FV2);


        /*
         * ordinal(). 원소에 열거된 순서를 정수 값으로 반환 (0부터 반환)
         */
        Fruit F0 = Fruit.APPLE;
        Fruit F1 = Fruit.PEACH;
        Fruit F2 = Fruit.BANANA;
        System.out.println("FO.ordinal() = " + F0.ordinal());
        System.out.println("F1.ordinal() = " + F1.ordinal());
        System.out.println("F2.ordinal() = " + F2.ordinal());


        //EnumSet
        EnumSet<Company> company = null;
        System.out.println("company = " + company);

        //allOf
        //지정된 elementType에 있는 모든 요소를 포함하는 EnumSet을 리턴함.
        company = EnumSet.allOf(Company.class);
        System.out.println("company = " + company);

        //of
        //enumSet에 포함되는 enum 타입 요소를 EnumSet으로 리턴함.
        EnumSet<Fruit> e_Set = EnumSet.of(Fruit.APPLE, Fruit.PEACH);
        System.out.println("e_Set = " + e_Set);

        //complementOf
        //enumSet에 포함되지 않는 나머지 enum 타입 요소를 EnumSet으로 리턴함.
        EnumSet<Fruit> e_complementSet = EnumSet.complementOf(e_Set);
        System.out.println("e_complementSet = " + e_complementSet);
    }
}



