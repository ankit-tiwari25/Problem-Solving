package Striver.Arrays;  
// 605.[Easy] Can Place Flowers
// TODO : Need to do this again (Directly Copied)
public class CanPlaceFlowers {
    public static void main(String[] arg) {
        int[] arr = {1,0,0,0,1};
        int n = 1;
        display(arr);
        System.out.println(canPlaceFlowers(arr, 0));
    }
    public static Boolean canPlaceFlowers(int[] flowerbed, int n){
        int a = 0;

        
        if(flowerbed.length == 1){
            if(flowerbed[0] != 1){
                a++;
            }
            if(a == n || a > n){
                return true;
            } 
            else{
                return false;
            }
        }


        if(flowerbed[1] != 1 && flowerbed[0] != 1){
            a++;
            flowerbed[0] = 1;
        }

        
        for(int i = 1; i < flowerbed.length - 1; i++){
            
            if(flowerbed[i - 1] != 1 && flowerbed[i + 1] != 1 && flowerbed[i] != 1){
                a++;
                flowerbed[i] = 1;
            }
        }


        if(flowerbed[flowerbed.length - 1] != 1 && flowerbed[flowerbed.length - 2] != 1){
            a++;
            flowerbed[flowerbed.length - 1] = 1;
        }


        if(a == n || a > n){
            return true;
        }
        else{
            return false;
        }
    }
    public static void display(int arr[]){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    
    
}
