package poly.ex2;



public class AnimalPolyMain3 {
    public static void main(String[] args) {
        Animal[] animalArr = {new Dog(), new Cat(), new Cow(), new Duck(), new Pig()};

        //Animal 클래스를 생성할 수 있는 문제 => 추상 클래스로 해결 가능
//        Animal a = new Animal();

        for (Animal animal : animalArr) {
            soundAnimal(animal);
        }
    }

    //변하지 않는 부분
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

}
