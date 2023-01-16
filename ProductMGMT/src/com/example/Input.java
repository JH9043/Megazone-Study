package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Input {
	private List<Product> list;
	private File file;
	private Scanner sc;

	public Input(List<Product> list) { // 생성자가 하는 일
		this.list = list;
		this.file = new File("C:\\eclipse_workspace\\productdata.txt");
		try {
			this.sc = new Scanner(this.file);
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
			return;
		}

	}
	
	public void fileinput() {
		int count = 0;
		while(this.sc.hasNextLine()) { //다음 라인이 있으면 true 아니면 false
			String line = this.sc.nextLine(); //한 줄씩 읽는다
//			System.out.println(line);  //NOTEBOOK	36000	5000	4700	2000
			
			Scanner myscan = new Scanner(line).useDelimiter("\\s+"); //한 줄씩 읽어서 공백을 기준으로 끊는다
			String name = myscan.next(); //상품이름
			int su = myscan.nextInt(); //수량
			int selprice = myscan.nextInt(); //판매 단가
			int buyprice = myscan.nextInt(); //매입 단가
			int transport = myscan.nextInt(); //운송료
			Product p = new Product(name, su, selprice, buyprice, transport);
			this.list.add(p); //이 배열의 0번째부터 값을 넣는다
		}
	}
}
