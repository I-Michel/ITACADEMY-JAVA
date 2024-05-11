package SPRINT3.Tasca2_Patterns_2.Nivell1;

public class Main {
    public static void main(String[] args) {

        Broker broker = new Broker();

        broker.addObserver(new BrokerageAgency("The Agency"));
        broker.addObserver(new BrokerageAgency("Japanese Agency"));
        broker.addObserver(new BrokerageAgency("Divina Papaya Agency"));

        broker.listObservers();

        broker.setStockMarketStatus(true);
        broker.setStockMarketStatus(false);
    }
}