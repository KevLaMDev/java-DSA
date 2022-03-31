package codechallenges;

import datastructures.hashmap.HashMap;
import datastructures.hashmap.HashMapPair;

import java.util.*;

public class WordRepeater {

    public String findFirstRepeat(String text) {
        String[] splitText = text.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
        HashMap<String, Integer> hashMap = new HashMap<>(splitText.length * 2);
        for (String currentWord : splitText) {
            if (hashMap.contains(currentWord)) {
                return currentWord;
            } else {
                hashMap.set(currentWord, 1);
            }
        }
        return null;
    }

    public List<HashMapPair<String, Integer>> getIndividualWordCount(String text) {
        String[] splitText = text.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
        HashMap<String, Integer> hashMap = new HashMap<>(splitText.length * 2);
        for (String currentWord : splitText) {
            if (hashMap.contains(currentWord)) {
                Integer newValue = hashMap.get(currentWord) + 1;
                hashMap.set(currentWord, newValue);
            } else {
                hashMap.set(currentWord, 1);
            }
        }
        return hashMap.entries();
    }

    public List<HashMapPair<String, Integer>> getMostCommonWords(String text) {
        String[] splitText = text.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
        HashMap<String, Integer> hashMap = new HashMap<>(splitText.length * 2);
        for (String currentWord : splitText) {
            if (hashMap.contains(currentWord)) {
                Integer newValue = hashMap.get(currentWord) + 1;
                hashMap.set(currentWord, newValue);
            } else {
                hashMap.set(currentWord, 1);
            }
        }
        List<HashMapPair<String, Integer>> list = hashMap.entries();
        int max = 0;
        for (HashMapPair<String, Integer> hashMapPair : list) {
            if (hashMapPair.getValue() > max) max = hashMapPair.getValue();
        }
        List<HashMapPair<String, Integer>> mostCommonWords = new ArrayList<>();
        for (HashMapPair<String, Integer> hashMapPair : list) {
            if (hashMapPair.getValue() >= (max * .75)) mostCommonWords.add(hashMapPair);
        }
        return mostCommonWords;
    }
}



