package com;

public class City {
    String cityName;
    int pinCode;
    public City(String cn,int pin){
        cityName=cn;
        pinCode=pin;
    }

    public static void main(String[] args) {
        City c1 = new City("Thirthahalli",577432);
        City c2 = new City("Guddekoppa",577414);
        System.out.println(c1.cityName+" "+"city"+" "+"has a pincode of"+" "+ c1.pinCode);
        System.out.println(c2.cityName+" "+"city"+" "+ "has a pincode of"+" "+c2.pinCode);
    }
}
