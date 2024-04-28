package SPRINT3.Tasca1_Patterns_1.Nivell2.Phone;

public class JapanesePhone implements Phone {
    private String number;
    private static final String PREFIX = "+81";

    public JapanesePhone(String number) {
        this.number = number;
    }

    @Override
    public String getNumber() {
        return PREFIX + " " + this.number;
    }
}
