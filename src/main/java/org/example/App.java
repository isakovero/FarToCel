package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {
    public static void main(String[] args) {
        // Fahrenheit to Celsius
        double fahrenheit = 98.6;
        Converter converter = new Converter(fahrenheit);
        double celsius = converter.toCelsius();
        System.out.println(fahrenheit + "°F is " + celsius + "°C");

        // Kelvin to Celsius
        float kelvin = 310.15f;
        float celsius2 = Converter.kelvintoCel(kelvin);
        System.out.println(kelvin + "K is " + celsius2 + "°C");

        // Kelvin to Fahrenheit
        double fahrenheit2 = Converter.kelvintoFah(kelvin);
        System.out.println(kelvin + "K is " + fahrenheit2 + "°F");
    }
    }


