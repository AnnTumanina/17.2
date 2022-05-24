package com.company;

import java.util.ArrayList;
import java.util.List;


abstract class Deliver{
    String name;
    List<String> params = new ArrayList<>();

    public void print() {
        System.out.println("Variant deliver: "+name);
        for (String i: params){
            System.out.println(i);
        }
    }

}

abstract class DeliverVariants{
    public abstract Deliver createDeliverVariant();
}

class TruckVariant extends DeliverVariants{
    public Deliver createDeliverVariant(){
        return new Truck();
    }
}

class ShipVariant extends DeliverVariants{
    public Deliver createDeliverVariant(){
        return new Ship();
    }
}

class AirplaneVariant extends DeliverVariants{
    public Deliver createDeliverVariant(){
        return new Airplane();
    }
}

class Truck extends Deliver{
    public Truck(){
        name = "Truck";
        params.add("Delivery time: 1week-1month");
        params.add("Delivery cost:10$\n");
    }
}

class Ship extends Deliver{
    public Ship(){
        name = "Ship";
        params.add("Delivery time: 3 days - 1 week");
        params.add("Delivery cost:40$\n");
    }
}

class Airplane extends Deliver{
    public Airplane() {
        name = "Airplane";
        params.add("Delivery time:1-3day");
        params.add("Delivery cost:70$\n");
    }
}

public class Main{
    public static void main(String[] args) {
        DeliverVariants TruckVariant1 = new TruckVariant();
        DeliverVariants ShipVariant1 = new ShipVariant();
        DeliverVariants AirplaneVariant1 = new AirplaneVariant();
        Deliver Truck1 = TruckVariant1.createDeliverVariant();
        Deliver Ship1 = ShipVariant1.createDeliverVariant();
        Deliver Airplane1 = AirplaneVariant1.createDeliverVariant();
        Truck1.print();
        Ship1.print();
        Airplane1.print();
    }
}
