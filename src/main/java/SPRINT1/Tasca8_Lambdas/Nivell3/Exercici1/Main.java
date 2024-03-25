package SPRINT1.Tasca8_Lambdas.Nivell3.Exercici1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();

        students.add(new Student("Amy", 20, "Java", 10));
        students.add(new Student("Takeshi", 31, "PHP", 8));
        students.add(new Student("Michael", 29, "NodeJS", 4));
        students.add(new Student("Alexander", 19, "Angular", 7));
        students.add(new Student("Asuka", 25, "React", 8));
        students.add(new Student("Kazuya", 17, "PHP", 5));
        students.add(new Student("Noah", 21, "NodeJS", 6));
        students.add(new Student("Haruka", 16, "Java", 9));
        students.add(new Student("William", 47, "Angular", 5));
        students.add(new Student("Chloe", 35, "React", 6));


        System.out.println("Names and ages of students list:" +
                "\n--------------------------------");
        students.forEach(s -> System.out.println("- Name: " + s.getName() + ", " + s.getAge() + " years old."));

        System.out.println("\nStudents whose name begins with \"A\" list:" +
                "\n-----------------------------------------");
        students.stream().filter(s -> s.getName().startsWith("A")).toList().forEach(System.out::println);

        System.out.println("\nStudents with a grade of 5 or higher:" +
                "\n-------------------------------------");
        students.stream().filter(s -> (s.getGrade() >= 5)).toList().forEach(System.out::println);

        System.out.println("\nStudents with a grade of 5 or higher and not coursing PHP:" +
                "\n----------------------------------------------------------");
        students.stream().filter(s -> (s.getGrade() >= 5) && (!s.getCourse().equalsIgnoreCase("PHP")))
                .toList().forEach(System.out::println);

        System.out.println("\nLegal age Java students list:" +
                "\n-----------------------------");
        students.stream()
                .filter(s -> (s.getAge() >= 18) && (s.getCourse().equalsIgnoreCase("Java")))
                .toList().forEach(System.out::println);

    }
}
