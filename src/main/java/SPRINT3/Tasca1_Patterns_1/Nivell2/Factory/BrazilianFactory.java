package SPRINT3.Tasca1_Patterns_1.Nivell2.Factory;

import SPRINT3.Tasca1_Patterns_1.Nivell2.Address.Address;
import SPRINT3.Tasca1_Patterns_1.Nivell2.Address.BrazilianAddress;
import SPRINT3.Tasca1_Patterns_1.Nivell2.Phone.BrazilianPhone;
import SPRINT3.Tasca1_Patterns_1.Nivell2.Phone.Phone;

public class BrazilianFactory implements AbstractFactory {
    @Override
    public Phone createPhone(String number) {
        return new BrazilianPhone(number);
    }

    @Override
    public Address createAddress(String address) {
        return new BrazilianAddress(address);
    }
}
