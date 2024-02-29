package org.example;
public class Converter {

    double fahrenheit;
    public Converter(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public double toCelsius() {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static float kelvintoCel(float kel){
        return (float) (kel-273.15);
    }

    public static double kelvintoFah(double kel) {
        return (kel - 273.15) * 9 / 5 + 32;
    }

}
