package com.example;

public class Main {
	public static void main(String[] args) {
		Product [] array = new Product[7];
		Input input = new Input(array);
		input.fileinput();
		
		Calc calc = new Calc(array);
		calc.calc();
		
		Output output = new Output(array);
		output.output();
	}
}
