import java.util.Arrays;

public class Main {
    static boolean isEqual(int value, int i, int[]arr) {
        for (int k = 0; k < i; k++) {
            if (arr[k] == value) {
                return true;
            }
        }
        return false;
    }

    static int counter(int value,int[]numbers){
        int count=0;
        for(int j=0;j<numbers.length;j++){
                if( numbers[j]==value){
                  count ++;
                }
        }
        return count;
    }

    public static void main(String[] args) {
        int counter = 0, k = 0;
        int[] numbers = {2, 4, 4, 9, 11, 10, 4, 5, 7, 11, 8, 2, 2, 2, 3};
        //int[] repetitive = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if(!isEqual(numbers[i],i,numbers)){
                System.out.println(numbers[i]+" sayısı "+counter(numbers[i],numbers)+" kez tekrar edildi");
            }
        }
    }
}