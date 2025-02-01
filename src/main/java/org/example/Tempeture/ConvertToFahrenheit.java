package org.example.Tempeture;

public class ConvertToFahrenheit implements Convert {

    @Override
    public double convert(double CelsDegree) {
        return CelsDegree * (9. / 5.) + 32;
    }
}
