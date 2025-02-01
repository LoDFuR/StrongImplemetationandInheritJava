package org.example.Tempeture;

public class ConvertToKelvin implements Convert {
    @Override
    public double convert(double CelsDegree) {
        return CelsDegree - 273.15;
    }
}
