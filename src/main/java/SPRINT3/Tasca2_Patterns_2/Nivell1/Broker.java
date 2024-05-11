package SPRINT3.Tasca2_Patterns_2.Nivell1;

import java.util.ArrayList;

public class Broker implements Observable {

    private ArrayList<Observer> agencies = new ArrayList<>();
    private boolean stockMarketStatus;

    public boolean getStockMarketStatus() {
        return stockMarketStatus;
    }

    public void setStockMarketStatus(boolean status) {
        this.stockMarketStatus = status;
        notifyAllObservers();
    }

    @Override
    public void addObserver(Observer agency) {
        agencies.add(agency);
    }

    @Override
    public void removeObserver(Observer agency) {
        agencies.remove(agency);
    }

    @Override
    public void listObservers() {
        for(Observer agency : agencies) {
            System.out.println(agency);
        }
    }
    @Override
    public void notifyAllObservers(){
        for(Observer agency : agencies) {
            agency.update(this.stockMarketStatus);
        }
    }
}