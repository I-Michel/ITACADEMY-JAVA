package SPRINT1.Tasca8_Lambdas.Nivell1.Exercici8;

public class Main {
    public static void main(String[] args) {

        String word = "I love plants";
        StringBuilder sb = new StringBuilder();

        FuncInter funcInter = (s -> {
            sb.append(s);
            return sb.reverse().toString();
        });

        System.out.println(word + "\n" + funcInter.reverse(word));
    }
}
