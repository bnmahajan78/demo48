package com;

public class HelloFile {

	public HelloFile() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SayHi sh = new SayHi();
		String msg = sh.callme();
		System.out.println("Hello World !!" + msg );
	}

}
