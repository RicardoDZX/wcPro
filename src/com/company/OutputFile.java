package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


public class OutputFile {
	
	public void outPut(List<Map.Entry<String,Integer>> res) throws IOException
	{
		String result = "";

		for(int index = 0;index<res.size();index++){
			result += res.get(index).getKey()+" "+res.get(index).getValue();
			if(index != res.size()-1){
				result +="\r\n";
			}			
		}
		File f = null;
		FileWriter file = null;
		try{
			f = new File("result.txt");
			file = new FileWriter(f);
			file.write(result);
		}
		catch(Exception e){
			System.out.println(e);
		}	
		finally {
			file.close();
		}
	}

}
