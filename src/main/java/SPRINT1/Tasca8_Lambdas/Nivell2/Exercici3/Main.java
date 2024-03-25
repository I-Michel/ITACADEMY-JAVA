package SPRINT1.Tasca8_Lambdas.Nivell2.Exercici3;

public class Main {
    public static void main(String[] args) {

        FuncInter add = (num1, num2) -> num1 + num2;
        FuncInter subtract = (num1, num2) -> num1 - num2;
        FuncInter multiply = (num1, num2) -> num1 * num2;
        FuncInter divide = (num1, num2) -> num1 / num2;

        float addition = add.operation(50, 2);
        float subtraction = subtract.operation(50, 2);
        float multiplication = multiply.operation(50, 2);
        float division = divide.operation(50, 2);

        System.out.println("Addition result: " + addition +
                "\nSubtraction result: " + subtraction +
                "\nMultiplication result: " + multiplication +
                "\nDivision result: " + division);
    }
}
