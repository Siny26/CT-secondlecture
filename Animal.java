/*Создать класс Animal и расширяющие его классы Dog, Cat, Horse. Класс Animal содержит переменные food, location
и методы makeNoise, eat, sleep. Метод makeNoise, например, может выводить на консоль "Такое-то животное спит". Dog, Cat,
 Horse переопределяют методы makeNoise, eat. Добавьте переменные в классы Dog, Cat, Horse, характеризующие только этих животных.
  Создайте класс Ветеринар, в котором определите метод void treatAnimal(Animal animal). Пусть этот метод распечатывает food и
   location пришедшего на прием животного. В методе main создайте массив типа Animal, в который запишите животных всех имеющихся
   у вас типов. В цикле отправляйте их на прием к ветеринару.
 */

public class Animal {
    public static void main(String[] args) {
//массив типа Animal, в который записаны животные всех имеющихся  типов.
        Animal[] animals = new Animal[3];
        animals[0] = new Animal.Dog("кость", "в будке", "дружок");
        animals[1] = new Animal.Cat("молоко", "в доме", "черная");
        animals[2] = new Animal.Horse("сено", "в стойле", 5);
//Цикл, который отправляет всех животных на прием к ветеринару.
       for (Animal a : animals) {
           Veterinarian.treatAnimal(a);
        }
    }

    String food;
    String location;

    public Animal(String f, String l) {
        food = f;
        location = l;
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    public void makeNoise() {
        System.out.println("Животное молчит ");
    }

    public void eat() {
        System.out.println("Животное ест");
    }

    public void sleep() {
        System.out.println("Животное легло спать");
    }

    static class Dog extends Animal {
        public Dog(String f, String l, String n) {
            super(f, l);
            String name = n;
        }

        // Переопределение методов для класса Dog
        @Override
        public void makeNoise() {

            System.out.println("Собака лает");
        }

        @Override
        public void eat() {

            System.out.println("Собака грызет ");

        }

        @Override
        public void sleep() {

            System.out.println("Собака спит");

        }
    }

    static class Cat extends Animal {
        String color;
        public Cat(String f, String l, String c) {
            super(f, l);
           color = c;
        }

        // Переопределение методов для класса Cat
        @Override
        public void makeNoise() {

            System.out.println("Кот мяукает");
        }

        @Override
        public void eat() {

            System.out.println("Кот лакает");

        }

        @Override
        public void sleep() {

            System.out.println("Кот спит и мурчит");

        }
    }

    static class Horse extends Animal {

        public Horse(String f, String l, int n) {
            super(f, l);
            int number = n;
        }

        // Переопределение методов для класса Horse
        @Override
        public void makeNoise() {

            System.out.println("Лошадь фыркает");
        }

        @Override
        public void eat() {

            System.out.println("Лошадь жует");

        }

        @Override
        public void sleep() {

            System.out.println("Лошадь спит в конюшне");

        }
    }

    public  static class Veterinarian {
        private static Animal animal;

//метод распечатывает food и
//   location пришедшего на прием животного.
        public static void treatAnimal(Animal an){
           animal = an;
            System.out.println("Еда для животного: " + an.getFood() + ", Где находиться животное: " + an.getLocation());
        }

    }

}
