package poly.ex1;

public class AnimalSountMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        //타입이 다르므로 배열도 중복제거 불가
//        Cow[] cowArr = {dog, cat, cow};

        System.out.println("동물 소리 테스트 시작");
        dog.sound();
        System.out.println("동물 소리 테스트 종료");

        soundCat(cat);
//        System.out.println("동물 소리 테스트 시작");
//        cat.sound();
//        System.out.println("동물 소리 테스트 종료");

        soundCow(cow);
//        System.out.println("동물 소리 테스트 시작");
//        cow.sound();
//        System.out.println("동물 소리 테스트 종료");
    }

    //메서드 사용
    //타입이 다르므로 중복 제거 어려움
    private static void soundCow(Cow cow) {
        System.out.println("동물 소리 테스트 시작");
        cow.sound();
        System.out.println("동물 소리 테스트 종료");
    }
    private static void soundCat(Cat cat) {
        System.out.println("동물 소리 테스트 시작");
        cat.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
