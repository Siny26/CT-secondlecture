/*Создайте пример наследования, реализуйте класс Student и класс Aspirant, аспирант отличается от студента наличием некой
научной работы.Класс Student содержит переменные: String firstName, lastName, group. А также double averageMark, содержащую
среднюю оценку.Создать переменную типа Student, которая ссылается на объект типа Aspirant.Создать метод getScholarship()
для класса Student, который возвращает сумму стипендии. Если средняя оценка студента равна 5, то сумма 100, иначе 80.
Переопределить этот метод в классе Aspirant. Если средняя оценка аспиранта равна 5, то сумма 200, иначе 180.Создать массив
 типа Student, содержащий объекты класса Student и Aspirant. Вызвать метод getScholarship() для каждого элемента массива.
 */



public class Student {
    public static void main(String[] args) {

        // переменная типа Student, которая ссылается на объект типа Aspirant
        Student k = new Aspirant("Валерий", "Талов", "группа2", 3.56, "монография");
       Student as = new Aspirant("Карина","Орлова", "группа2", 5, "диссертация");
        // Заполнение массива students 4 обьектами типа Student и Aspirant
        Student students[] = new Student[4];
        // Создание объектов массива
        students[0] = new Student("Елена", "Абрамова", "группа1", 4.85);
        students[1] = new Student("Алексей", "Белин", "группа1", 5);
        students [2] = k;
        students [3] =  as;


        for (Student s : students) {
            System.out.println("Имя студента = " + s.getFirstname() +
                    ", Фамилия студента = " + s.getLastname() +
                    ", группа = " + s.getGroup() +
                    ", средняя оценка = " + s.getAverageMark() +
                    // вызов метода getScholarship() для каждого элемента массива
                    ", Сумма степендии = " + s.getScholarship());

        }

    }

    //static class Student {
        //Переменные класса
        String firstname;
        String lastname;
        String group;
        double averageMark;

        public Student(String f, String l, String gr, double aMark) {
            firstname = f;
            lastname = l;
            group = gr;
            averageMark = aMark;
        }

        public String getFirstname() {
            return firstname;
        }

        public String getLastname() {
            return lastname;
        }

        public String getGroup() {
            return group;
        }

        public double getAverageMark() {
            return averageMark;
        }

        //  метод, который возвращает сумму стипендии. Если средняя оценка студента равна 5, то сумма 100, иначе 80.
        public int getScholarship() {
            int n;
            if (averageMark == 5) {
                n = 100;
                return n;


            } else {
                n = 80;
            }
            return n;
        }

    // класс Aspirant, аспирант отличается от студента наличием некой научной работы.
    static class Aspirant extends Student {
        String scientificwork;

        public Aspirant(String firstname, String lastname, String group, double averageMark, String s) {
            super(firstname, lastname, group, averageMark);
            scientificwork=s;
        }

        public String getScientificwork() {
            return scientificwork;
        }


        // переопределение метода getScholarship(), изменение значений
        @Override
        public int getScholarship() {
            int n;
            if (averageMark == 5) {
                n = 200;
                return n;


            } else {
                n = 180;
            }
            return n;
        }
    }
}



