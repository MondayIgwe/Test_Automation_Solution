package com.starter;


public class Calculator {

	private int total;
	private String name;
	
	
	public Calculator(int amount) {
		this.total=amount;
	}

	public void add(int amount) {
		total = total + amount;
	}
	
	public int getTotal() {
		return total;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {	
		return name; //return comes back with value and store in another variable
	}
	
	public static void main(String[] args) {
		Calculator calculator = new Calculator(1);
		calculator.setName("mon");
		
		Object name = calculator.getName();
		System.out.println(name);
	}
}
