package com;

public class Mobile{
		String brand;
		int price;
		Mobile(String brand,int price){
			this.price = price;
			this.brand = brand;
		}
	public static void main(String[] args){
		Mobile m1 = new Mobile("Poco M3",10000);
		Mobile m2 = new Mobile("Samsung S23 Ultra",70000);

		System.out.println(m1.brand + " " + m1.price);
		
		System.out.println(m2.brand + " " + " "+ m2.price);
	}
}


