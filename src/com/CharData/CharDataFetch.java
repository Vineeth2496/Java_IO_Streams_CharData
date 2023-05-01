package com.CharData;

import java.io.FileReader;
import java.io.InputStreamReader;

public class CharDataFetch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		
		FileReader fr=new FileReader("TextData");
		for(int i; (i=fr.read())!=-1;)
		{
			System.out.println((char)i);
		}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
