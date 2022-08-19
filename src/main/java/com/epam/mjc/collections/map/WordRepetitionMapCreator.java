package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> res = new HashMap<>();

        StringBuilder sb = new StringBuilder();
        for (char ch: sentence.toLowerCase().toCharArray()){
            if ('a' <= ch && ch <= 'z'){
                sb.append(ch);
            }else{
                if (sb.toString().isEmpty()) continue;
                res.put(sb.toString(), res.getOrDefault(sb.toString(), 0) + 1);
                sb = new StringBuilder();
            }
        }

        return res;
    }
}
