package SPRINT3.Tasca1_Patterns_1.Nivell2.Address;

public class BrazilianAddress implements Address {
    private String address;
    private final static String COUNTRY = "BRAZIL";

    public BrazilianAddress(String address) {
        this.address = address;
    }

    @Override
    public String getFullAddress() {
        return this.address + " " + COUNTRY;
    }
}
