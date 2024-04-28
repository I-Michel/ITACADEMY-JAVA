package SPRINT3.Tasca1_Patterns_1.Nivell2.Factory;

import SPRINT3.Tasca1_Patterns_1.Nivell2.Address.Address;
import SPRINT3.Tasca1_Patterns_1.Nivell2.Address.JapaneseAddress;
import SPRINT3.Tasca1_Patterns_1.Nivell2.Phone.JapanesePhone;
import SPRINT3.Tasca1_Patterns_1.Nivell2.Phone.Phone;

public class JapaneseFactory implements AbstractFactory {
    @Override
    public Phone createPhone(String number) {
        return new JapanesePhone(number);
    }

    @Override
    public Address createAddress(String address) {
        return new JapaneseAddress(address);
    }
}
