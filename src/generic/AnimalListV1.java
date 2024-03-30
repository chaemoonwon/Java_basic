package generic;

public class AnimalListV1<T> {

    private T[] animal;

    public AnimalListV1(T[] animal) {
        this.animal = animal;
    }

    public T getAnimal(int index) {
        return animal[index];
    }
}
