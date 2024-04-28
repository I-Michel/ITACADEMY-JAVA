package SPRINT3.Tasca1_Patterns_1.Nivell2.Address;

public class JapaneseAddress implements Address {
    private String address;
    private final static String COUNTRY = "JAPAN";

    public JapaneseAddress(String address) {
        this.address = address;
    }

    @Override
    public String getFullAddress() {
        return this.address + " " + COUNTRY;
    }
}
