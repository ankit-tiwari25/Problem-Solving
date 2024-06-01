package Striver.BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 1268. [Medium] Search Suggestions System
// TODO
public class SearchSuggestionsSystem {
    public static void main(String[] args) {
        String products[] = {"mobile","mouse","moneypot","monitor","mousepad"};
        String searchWord = "mouse";
        List<List<String>> ans = suggestedProducts(products, searchWord);
        display(ans);
    }
     public static List<List<String>> suggestedProducts(String[] products, String searchWord) {
         Arrays.sort(products);
        List<List<String>> result = new ArrayList<>();
        int left = 0, right = products.length - 1;
        for (int i = 0; i < searchWord.length(); i++) {
            char currentChar = searchWord.charAt(i);
            while (left <= right && (products[left].length() <= i || products[left].charAt(i) != currentChar)) {
                left++;
            }
            while (left <= right && (products[right].length() <= i || products[right].charAt(i) != currentChar)) {
                right--;
            }
            List<String> suggestions = new ArrayList<>();
            for (int j = left; j < Math.min(left + 3, right + 1); j++) {
                suggestions.add(products[j]);
            }
            result.add(suggestions);
        }
        return result;
    }
    public static void display(List<List<String>> ans){
        for(int i = 0; i < ans.size(); i++){
            List<String> s = ans.get(i);
            for(int j = 0; i < s.size(); j++){
                String st = s.get(i);
                System.out.print(st);
            }
            System.out.println();
        }
    }
}
