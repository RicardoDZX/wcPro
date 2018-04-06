package wcpro;

import java.util.List;
import java.util.Map;

public class Main_class {
    static InportFile inportfile=new InportFile();
    public static void main(String[] args) throws Exception{


        //String filename = "War.txt";
        WordTest test = new WordTest();
        test.process(inportfile.readFile(args));
        Sort mSort=new Sort();
        List<Map.Entry<String,Integer>> res=mSort.mySort(test.map);
        OutputFile outputFile = new OutputFile();
        outputFile.OutPut(res);



        //System.out.println("the different word number: " + test.map.size());
        // System.out.println("the counter word number: " + test.counter);

    }
}
