package org.example.Transport;

import org.example.Transport.Transport;

public class Bus implements Transport {
    double Fuel;
    int Passengers;
    final double PricePerLiter = 50.32;
    @Override
    public void run() {
        System.out.println("Going forward!!!");
    }

    @Override
    public void passengers(int N) {
        this.Passengers=N;
    }

    @Override
    public double getOil(double Litres) {
        return Litres * this.PricePerLiter;
    }
}
