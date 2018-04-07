package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class InportFile {
	static String[] str = new String [8];
	public static String readFile(String[] argv) {
		String result = "result.txt";
		String pathName = "";
		//读取文件名，需要把文件放置在代码目录之下否则就需要输入文件完整路径
		int i = 0;
		if (argv.length == 1) {
			//检测输入语法正确性
			boolean fn = argv[0].contains(".");
			if (fn) {
				String[] file = argv[0].split("\\.");

				if (file[file.length-1].equals("txt")) {
					pathName = argv[0];
					try {
						File filename = new File(pathName);
						InputStreamReader reader = new InputStreamReader(new FileInputStream(filename));
						BufferedReader br = new BufferedReader(reader);
						br.close();
						//计算方法函数
						System.out.println("every thing is right!");
						str[i] = "every thing is right!";
						i = i + 1;

					} catch (Exception e) {
						System.out.println("error filepath or filename!");
						str[i] = "error filepath or filename!";
						pathName="wrong";
					}
					return pathName;
				} else {
					System.out.println("filetype error input!");
					str[i] = "filetype error input!";
				}
			} else {
				System.out.println("file error input!");
				str[i] = "file error input!";
			}
		}
	    else {
	    	System.out.println("please input the right cmd!");
	    	str[i]="please input the right cmd!";
	    }
	    return "wrong";
	}
    public static String[] getOutput() {
    	 return str; 
    }
	
}
