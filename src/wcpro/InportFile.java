package wcpro;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class InportFile {
	 public String readFile(String []argv){
		 String result="result.txt";
		 String pathName = "";
	     if(argv!= null){


	        	String[] file = argv[0].split("\\.");
	    	    if(argv[0] != null && file[1].equals("txt"))
	    	    	pathName = argv[0];
	    	    else
	    	        System.out.println("error input!");
	        }

	     try {
	            File filename = new File(pathName);  
	            InputStreamReader reader = new InputStreamReader(new FileInputStream(filename)); 
	            BufferedReader br = new BufferedReader(reader);
	            br.close();
	            

	    }catch (Exception e) {  
	    	 System.out.println("error path or name!");
        }
        return pathName;
	} 
}
