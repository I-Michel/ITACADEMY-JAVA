package SPRINT3.Tasca1_Patterns_1.Nivell2.Factory;

import SPRINT3.Tasca1_Patterns_1.Nivell2.Address.Address;
import SPRINT3.Tasca1_Patterns_1.Nivell2.Address.SpanishAddress;
import SPRINT3.Tasca1_Patterns_1.Nivell2.Phone.Phone;
import SPRINT3.Tasca1_Patterns_1.Nivell2.Phone.SpanishPhone;

public class SpanishFactory implements AbstractFactory {
    @Override
    public Phone createPhone(String number) {
        return new SpanishPhone(number);
    }

    @Override
    public Address createAddress(String address) {
        return new SpanishAddress(address);
    }
}
