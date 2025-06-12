package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CheckFrequenciesEqual {
    public static void main(String[] args) {
Boolean b=IsSameFrequency("aaabbbcccc");
        System.out.println(b);
    }
    private static boolean IsSameFrequency(String s) {
        Map<Character, Integer> freqMap = new HashMap<>();


        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }


        Map<Integer, Integer> freqCountMap = new HashMap<>();
        for (int freq : freqMap.values()) {
            freqCountMap.put(freq, freqCountMap.getOrDefault(freq, 0) + 1);
        }


        if (freqCountMap.size() == 1) {

            return true;
        }

        if (freqCountMap.size() == 2) {
            List<Integer> keys = new ArrayList<>(freqCountMap.keySet());
            int freq1 = keys.get(0), freq2 = keys.get(1);
            int count1 = freqCountMap.get(freq1), count2 = freqCountMap.get(freq2);


            if ((count1 == 1 && (freq1 == 1 || freq1 - freq2 == 1)) ||
                    (count2 == 1 && (freq2 == 1 || freq2 - freq1 == 1))) {
                return true;
            }
        }

        return false;
    }

    }

