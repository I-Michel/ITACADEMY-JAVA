package Tasca8_Lambdas.Nivell1.Exercici3;

import Tasca3_Java_Collections.Nivell1.Exercici1.Month;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> months = new ArrayList<String>();
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");

        months.forEach(m -> System.out.println(m));
    }
}
