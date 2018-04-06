package wcpro;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class WordTest {

    public Map<String, Integer> map = new HashMap<>();
    public int counter;



    public void process(String filename) throws Exception{
//        String filename =  "/War.txt";

        BufferedReader buffer =  new BufferedReader(new InputStreamReader(new FileInputStream(filename)));

        String line = null;
        while((line = buffer.readLine()) != null ) {
            if( line.length() == 0 ) {
                continue;
            }
            String str = line.trim();
            StringBuilder builder = new StringBuilder();
            for(int i = 0; i < str.length(); i++) {
                if(Character.isLetter(str.charAt(i))) {
                    builder.append(str.charAt(i));
                } else if( str.charAt(i) == '-' && (i < str.length() - 1) && Character.isLetter(str.charAt(i + 1)) ) {
                    builder.append(str.charAt(i));
                }
                else if(builder.length() != 0){
                    counter++;
                    String string = builder.toString().toLowerCase();
                    if(map.get(string) == null) {
                        map.put(string, 1);
                    } else {
                        map.replace(string, map.get(string) + 1);
                    }
                    builder.delete(0, builder.length());
                }
            }
            // 边界,
            if(builder.length() != 0){
                counter++;
                String string = builder.toString().toLowerCase();
                if(map.get(string) == null) {
                    map.put(string, 1);
                } else {
                    map.replace(string, map.get(string) + 1);
                }
                builder.delete(0, builder.length());
            }

        }

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();
        while(iterator.hasNext()) {
            Map.Entry entry = iterator.next();
           // System.out.println( "Word: " + (String)entry.getKey() + " counter: " + (Integer)entry.getValue());
        }
    }

}
