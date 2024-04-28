package SPRINT3.Tasca1_Patterns_1.Nivell2.Factory;

import SPRINT3.Tasca1_Patterns_1.Nivell2.Address.Address;
import SPRINT3.Tasca1_Patterns_1.Nivell2.Phone.Phone;

public interface AbstractFactory {
    Phone createPhone(String number);
    Address createAddress(String address);
}