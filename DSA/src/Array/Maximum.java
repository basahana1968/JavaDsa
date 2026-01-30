package Array;

import java.util.Arrays;

public class Maximum {

    public static int bruteforce(int[]arr){
        Arrays.sort(arr);
        ArraysIO.print(arr);

        retuen arr[arr.length -1];
    }


    public static int better(int[] array){
        int largest = Interger.MIN.VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        

    }
    
}
