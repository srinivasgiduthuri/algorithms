package com.amigoscorp.algos.hackerrank;

import java.util.HashMap;
import java.util.Map;

public class Anagrams {
    private static boolean anagrams(String value1, String value2) {
        value1 = value1.replaceAll("[^\\w]", "").toLowerCase();
        value2 = value2.replaceAll("[^\\w]", "").toLowerCase();
        Map<Character, Integer> characterIntegerMap1 = buildCharacterIntegerMap(value1);
        Map<Character, Integer> characterIntegerMap2 = buildCharacterIntegerMap(value2);
        if (characterIntegerMap1.size() == characterIntegerMap2.size()) {
            for (Map.Entry<Character, Integer> entry : characterIntegerMap1.entrySet()) {
                if (entry.getValue() != characterIntegerMap2.get(entry.getKey())) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    private static Map<Character, Integer> buildCharacterIntegerMap(String value) {
        Map<Character, Integer> characterIntegerMap = new HashMap<Character, Integer>();
        for (char ch : value.toCharArray()) {
            if (characterIntegerMap.containsKey(ch)) {
                characterIntegerMap.put(ch, characterIntegerMap.get(ch) + 1);
            } else {
                characterIntegerMap.put(ch, 1);
            }
        }
        return characterIntegerMap;
    }

    public static void main(String[] args) {
        System.out.println(anagrams("rail safety", "fairy tales"));
        System.out.println(anagrams("Rail! Safety!", "fairy tales"));
        System.out.println(anagrams("Hi there", "Bye there"));
    }
}
