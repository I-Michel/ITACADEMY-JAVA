package SPRINT3.Tasca1_Patterns_1.Nivell2;

import SPRINT3.Tasca1_Patterns_1.Nivell2.Address.Address;
import SPRINT3.Tasca1_Patterns_1.Nivell2.Phone.Phone;

public class Contact {
    private String name;
    private Address address;
    private Phone phone;

    public Contact(String name, Address address, Phone phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return this.name;
    }
    public Address getAddress() {
        return this.address;
    }
    public Phone getPhone() {
        return this.phone;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "CONTACT: " + this.name + "\nAddress: " + this.address.getFullAddress() +
                "\nPhone: " + this.phone.getNumber();
    }
}