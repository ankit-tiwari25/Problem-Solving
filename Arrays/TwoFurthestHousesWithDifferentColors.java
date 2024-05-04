package Striver.Arrays;
// 2078[Easy]. Two Furthest Houses With Different Colors
public class TwoFurthestHousesWithDifferentColors {
    public static void main(String[] args) {
        int[] arr = {4,4,4,11,4,4,11,4,4,4,4,4};

        display(arr);
        System.out.println(twoFurthestHousesWithDifferentColors(arr));

    }
    public static int twoFurthestHousesWithDifferentColors(int[] colors){
         //Trying with two pointer
         int maxDistance = Integer.MIN_VALUE;

         // Left constatnt right traverse
          for(int i = 0, j = colors.length - 1; j > i; j--){
              if(colors[i] != colors[j]){
                  int distance = j - i;
                  maxDistance = Math.max(maxDistance, distance);
                  }
          }
          // Right constatnt left traverse
           for(int i = 0, j = colors.length - 1; i < colors.length; i++){
              if(colors[i] != colors[j]){
                  int distance = j - i;
                  maxDistance = Math.max(maxDistance, distance);
              }
          }
          return maxDistance;
    }
    public static void display(int arr[]){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
