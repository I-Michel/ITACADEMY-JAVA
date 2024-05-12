package SPRINT3.Tasca2_Patterns_2.Nivell3;

public class CurrencyConverter implements Converter {
    @Override
    public double convert(double amount, String currency) {
        double result = 0;
        switch(currency) {
            case "USD": result = amount * 1.08;
                break;
            case "JPY": result = amount * 168.16;
                break;
            case "CNY": result = amount * 7.80;
                break;
        }
        return result;
    }
}