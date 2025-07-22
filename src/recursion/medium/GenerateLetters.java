package recursion.medium;

import java.util.*;

public class GenerateLetters{
    static List<String> generateLettersList(String p, String up) {
        if (up.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        List<String> list = new ArrayList<>();
        int digit = up.charAt(0) - '0';

        if (digit < 2 || digit > 9) {
            // skip invalid digits like 1 or 0 (should already be handled before calling)
            return list;
        }

        int start = (digit - 2) * 3;
        int end = start + 2;

        // Adjustments for 7, 8, 9 which have different letter counts
        if (digit == 7) {
            end = start + 3;
        } else if (digit == 8) {
            start++;
            end = start + 2;
        } else if (digit == 9) {
            start++;
            end = start + 3;
        }

        for (int i = start; i <= end; i++) {
            char ch = (char) ('a' + i);
            list.addAll(generateLettersList(p + ch, up.substring(1)));
        }

        return list;
    }

    public static List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty()) return new ArrayList<>();

        return generateLettersList("", digits);
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }
}

