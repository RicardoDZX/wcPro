package com.company;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
public class WordAnalysis {

    public Map<String, Integer> map = new HashMap<>();
    public int counter;

    public Map process(String filename) throws Exception{
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
        return map;
    }
}

