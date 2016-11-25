package com.hcm.template;

public class AppClient {
	public static void main(String args[]) {
		Document document = new Memo();
		document.createDocument();
		System.out.println(" ");
		document = new Invoice();
		document.createDocument();
	}
}
