package SPRINT1.Tasca8_Lambdas.Nivell3.Exercici1;

public class Student {

    private String name;
    private int age;
    private String course;
    private int grade;

    public Student(String name, int age, String course, int grade) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getCourse() {
        return course;
    }
    public int getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student " + this.name + ": " + this.age + " years old, " +
                this.course + " course and " + this.grade + " grade.";
    }
}
