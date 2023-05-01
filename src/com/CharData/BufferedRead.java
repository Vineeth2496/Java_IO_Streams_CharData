package com.CharData;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		String name;
		Integer id;
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);
		System.out.println("Enter name:");
		name=br.readLine();
		System.out.println("Enter id");
		id=Integer.parseInt(br.readLine());
		System.out.println("Name is: "+name);
		System.out.println("Id is: "+id);
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
