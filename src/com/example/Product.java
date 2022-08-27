package com.example;

public class Product {
	private String name;
	private int su, buyprice, selprice, transport, money;
	private double rate;

	public Product(String name, int su, int selprice, int buyprice, int transport) {
		this.name = name;
		this.su = su;
		this.selprice = selprice;
		this.buyprice = buyprice;
		this.transport = transport;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSu() {
		return su;
	}

	public void setSu(int su) {
		this.su = su;
	}

	public int getBuyprice() {
		return buyprice;
	}

	public void setBuyprice(int buyprice) {
		this.buyprice = buyprice;
	}

	public int getSelprice() {
		return selprice;
	}

	public void setSelprice(int selprice) {
		this.selprice = selprice;
	}

	public int getTransport() {
		return transport;
	}

	public void setTransport(int transport) {
		this.transport = transport;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return String.format("%-15s%,7d%,14d%,18d%,14d%,20d%12.2f",
				name, su, buyprice, selprice, transport, money, rate);
	}
}
