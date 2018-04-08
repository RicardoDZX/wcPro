package com.company;

import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
        //long startTime = System.currentTimeMillis();

        WordAnalysis wordAnalysis=new WordAnalysis();
        String temp=InportFile.readFile(args);

        //long startTime2 = System.currentTimeMillis();

        //wordAnalysis.process(temp);

        //long startTime3 = System.currentTimeMillis();

        Sort sort=new Sort();
        List<Map.Entry<String,Integer>> res=sort.mySort2(wordAnalysis.process(temp));
        //long startTime4 = System.currentTimeMillis();
        //List<Map.Entry<String,Integer>> res2=sort.mySort3(wordAnalysis.map);
        //long startTime5 = System.currentTimeMillis();


        OutputFile outputFile=new OutputFile();
        outputFile.outPut(res);

        //long endTime=System.currentTimeMillis();
        //System.out.println("当前程序耗时："+(endTime-startTime)+"ms");
        //System.out.println("输入耗时："+(startTime2-startTime)+"ms");
        //System.out.println("词频耗时："+(startTime3-startTime2)+"ms");
        //System.out.println("排序耗时："+(startTime4-startTime3)+"ms");
        //System.out.println("排序2耗时："+(startTime5-startTime4)+"ms");
        //System.out.println("输出耗时："+(endTime-startTime4)+"ms");



    }
}
