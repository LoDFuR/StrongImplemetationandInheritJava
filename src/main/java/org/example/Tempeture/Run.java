package org.example.Tempeture;

import java.awt.image.Kernel;

public class Run {
    private double CelsDegree;
    public String ConvertResult(ConvertToKelvin Kelvin, ConvertToFahrenheit Fahrenheit, double CelsDegree){
        String res = "";
        res+= "Celsius Degrees: " + CelsDegree;
        res+= "\nKelvin Degrees: " + Kelvin.convert(CelsDegree);
        res+= "\nFahrenheit Degrees: " + Fahrenheit.convert(CelsDegree);
        return res;
    }
    public void main(){
        ConvertToFahrenheit Fahrenheit = new ConvertToFahrenheit();
        ConvertToKelvin Kelvin = new ConvertToKelvin();
        //double CelsDegree = 5.4;
        System.out.println(this.ConvertResult(Kelvin, Fahrenheit, this.CelsDegree));
    }

    public double getCelsDegree() {
        return CelsDegree;
    }

    public void setCelsDegree(double celsDegree) {
        CelsDegree = celsDegree;
    }
}
