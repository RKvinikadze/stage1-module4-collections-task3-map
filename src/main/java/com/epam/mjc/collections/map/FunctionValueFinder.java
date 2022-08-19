package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);

        for (int x: functionMap.keySet()){
            if (x == requiredValue)
                return true;
        }

        return false;
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map<Integer, Integer> res = new HashMap<>();
        for (int x: sourceList){
            res.put(x, 5 * x + 2);
        }

        return res;
    }
}
