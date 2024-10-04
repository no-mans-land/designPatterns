package observer.subject;

import observer.observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class Stock implements Subject{

    private double price;
    private String symbol;
    private List<Observer> observers;

    public Stock(double price, String symbol){
        this.price = price;
        this.symbol = symbol;
        observers = new ArrayList<>();

    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observers){
            observer.update(symbol, price);
        }

    }

    public void setPrice(double price){
        this.price = price;
        notifyObserver();
    }

}
