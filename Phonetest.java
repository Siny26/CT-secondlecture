/*Создайте класс Phone, который содержит переменные number, model и weight.Создайте три экземпляра этого класса.
Выведите на консоль значения их переменных.Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
 Выводит на консоль сообщение “Звонит {name}”. getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов.
 Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса - number,
 model и weight.Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number,
  model.Добавить конструктор без параметров.Вызвать из конструктора с тремя параметрами конструктор с двумя.Добавьте
  перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего.
  Вызвать этот метод.Создать метод sendMessage с аргументами переменной длины. Данный метод принимает на вход номера
  телефонов, которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.
 */

public class Phonetest {

    public static void main(String[] args) {
        // Создание объектов массива
        Phone phones[] = new Phone[3];
        phones[0] = new Phone("89544567812", "Nokia", 0.49);
        phones[1] = new Phone("87856235567", "Samsung", 0.54);
        phones[2] = new Phone("89545894612", "Huawei", 0.56);
        //Вывод на консоль значения  переменных экземпляров
        for (Phone ph : phones) {
            System.out.println("Номер телефона = " + ph.getNumber() +
                    ", Модель телефона = " + ph.getModel() +
                    ", Вес телефона = " + ph.getWeight());
            ph.receiveCall("Даниил");
            System.out.println(ph.getNumber("89456785923"));
            ph.receiveCall("Алексей", " 89436254789");
            ph.sendMessage("84567956321", "89457895623", "87459623146");

        }


    }

    static class Phone {
        //Переменные класса
        String number;
        String model;
        double weight;

        //  Конструктор в классе Phone, который принимает на вход три параметра для инициализации переменных класса - number,
// model и weight.
        public Phone(String n, String m, double w) {
            //Вызов из конструктора с тремя параметрами конструктор с двумя.
            this(n, m);
            weight = w;
        }

        public String getNumber() {
            return number;
        }

        public String getModel() {
            return model;
        }

        public double getWeight() {
            return weight;
        }

        //  метод,который выводит на консоль сообщение “Звонит {name}”
        public void receiveCall(String name) {
            System.out.println("Звонит " + name);
        }

        // метод,который возвращает номер телефона
        public String getNumber(String num) {
            return num;
        }


        // конструктор, который принимает на вход два параметра для инициализации переменных класса - number,
        //  model
        public Phone(String n, String m) {
            number = n;
            model = m;

        }

        // Конструктор без параметров
        public Phone() {

        }

        // Добавление перегруженного метода receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего.
        public void receiveCall(String name, String num) {
            System.out.println("Звонит " + name + ",  Номер звонящего " + num);
        }

        //Создать метод sendMessage с аргументами переменной длины. Данный метод принимает на вход номера
        //  телефонов, которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.
        public void sendMessage(String... numbers) {
            System.out.println("Номера телефонов для отправки сообщения");
            for (int i = 0; i < numbers.length; i++) {

                System.out.println(" " + numbers[i]);
            }
        }

    }
}