package Striver.Arrays;
// 58[Easy]. Length of Last Word
public class LengthOfLastWord{
    public static void main(String[] args) {
      String s = "Hello World";
      System.out.println(wordLength(s));
    }
   public static int wordLength(String s){
    char[] arr = s.toCharArray();

    int startIndex = s.length()-1;
    int wordLength = 0;
    for(int j = s.length() - 1; j >= 0; j--){
        if(arr[j] != ' '){
            startIndex = j;
            break;
        }
    }

    System.out.println("Start Index" + startIndex);

    for(int j = startIndex; j >= 0; j--){
        if(arr[j] != ' '){
            wordLength++;
        }else{
            break;
        }
    }
    return wordLength;
   }
}
