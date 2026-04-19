package com.sunbeam;
import java.util.HashMap;

public class WordCount {
    public static void main(String[] args) {
        String line = "Java is great and Java is powerful";

        HashMap<String, Integer> map = new HashMap<>();

        
        String[] words = line.toLowerCase().split("\\W+");

        for (String word : words) {
            if (!word.isEmpty()) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }

       
        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}