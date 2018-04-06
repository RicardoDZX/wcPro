package wcpro;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


public class OutputFile {

	public void OutPut(List<Map.Entry<String,Integer>> res) throws IOException
	{
		String result = "";
		for(int i = 0;i<res.size();i++){
			result += res.get(i).getKey()+" "+res.get(i).getValue();
			if(i != res.size()-1){
				result +="\r\n";
			}			
		}
		File f = new File("result.txt");
		FileWriter file = new FileWriter(f);
		file.write(result);
		file.close();
	}

}
