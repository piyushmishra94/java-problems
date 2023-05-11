import java.util.*;

public class LetterCobination {
    // Input: digits = "23"
    // Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
    public static void main(String[] args) {
        List <String> list = new ArrayList<>();
        //list = letterCombinations("23");
        list =  letterCombinations1("234");
        for (String str : list) {
            System.out.println(str);
            
        }
    }
    public static List<String> letterCombinations1(String digit){
        int n = digit.length();
        if(n == 0){
            return new ArrayList<>();
        }
        var map = new ArrayList<String>(List.of("abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"));
        var prevdp = new ArrayList<String>(List.of(""));
        for(int i=n-1;i>=0;i--){
            var dp = new ArrayList<String>();
            for (var x : map.get(digit.charAt(i) - '2').toCharArray()) {
                for (var y : prevdp) {
                    dp.add(x+y);
                    
                }       
            }
            prevdp = dp;
        }

        return prevdp;

    }




    // public static List<String> letterCombinations(String digits) {
    //     var n = digits.length();
    //     if (n == 0) return new ArrayList<>();
    
    //     var map = new ArrayList<String>(List.of("abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"));
    //     var dpPrev = new ArrayList<String>(List.of(""));
    //     for (var i = n-1; i >= 0; i--) {
    //       var dp = new ArrayList<String>();
    
    //       for (var x : map.get(digits.charAt(i) - '2').toCharArray())
    //         for (var y : dpPrev)
    //           dp.add(x + y);
          
    //       dpPrev = dp;
    //     }
    //     return dpPrev;
    //   }
    // public static List<String> letterCombinations(String digits) {
    //     List<String> result = new ArrayList<>();
    //     // If input string is empty, return empty list
    //     if (digits.length() == 0) {
    //         return result;
    //     }
    //     // Mapping of digits to corresponding letters
    //     String[] digitToLetters = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    //     // Generate letter combinations using recursion
    //     generateCombinations(digits, 0, "", digitToLetters, result);

    //     return result;
    // }
    
    // public static void generateCombinations(String digits, int index, String combination, String[] digitToLetters, List<String> result) {
    //     // If we've processed all digits, add current combination to result list and return
    //     if (index == digits.length()) {
    //         result.add(combination);
    //         return;
    //     }

    //     // Get the possible letters for the current digit
    //     String letters = digitToLetters[digits.charAt(index) - '0'];

    //     // Recursively generate combinations for each possible letter of the current digit
    //     for (int i = 0; i < letters.length(); i++) {
    //         generateCombinations(digits, index + 1, combination + letters.charAt(i), digitToLetters, result);
    //     }
    // }
}

