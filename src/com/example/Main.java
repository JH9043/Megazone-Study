package com.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
//		Product [] array = new Product[7];
		List<Product> list = new ArrayList<Product>();
		Input input = new Input(list);
		input.fileinput();
		
		Calc calc = new Calc(list);
		calc.calc();
		
		Sort sort = new Sort(list);
		sort.sort();
		
		Output output = new Output(list);
		output.output(); //화면 출력
		output.fileOutput(); //파일 출력
		System.out.println("File Output Success");
		
		
		
	}
}
