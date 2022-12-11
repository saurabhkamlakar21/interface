package com.tns.interfacee;

import java.io.*;

class BufferReader {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Your Name");
		String str = br.readLine();
		System.out.println("Your Name is :- " + str);
	}

}