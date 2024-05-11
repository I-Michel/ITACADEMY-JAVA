package SPRINT3.Tasca2_Patterns_2.Nivell1;

public class BrokerageAgency implements Observer {

    String name;

    public BrokerageAgency(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(boolean stockMarketStatus) {
        String update = (stockMarketStatus) ? "The stock market is going up!" : "The stock market is going down!";
        System.out.println("New update: " + update);
    }

    @Override
    public String toString() {
        return "Brokerage Agency: " + this.name;
    }
}