package com.CharData;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class CharacterData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);
		//To read br data only character data
		FileWriter fw=new FileWriter("TextData");
		//Store br data in fw
		System.out.println("Enter Character Data");
		for(int i; (i=br.read())!='#';)
		{
			fw.write(i);
		}
		}
		catch (Exception e) {
			// TODO: handle exception
		e.printStackTrace();
		}
	}

}
