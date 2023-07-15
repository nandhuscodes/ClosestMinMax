import java.util.Scanner;

public class ClosestMinMax {
    static int findClosestMinMax(int[] array){
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++){
            if(array[i]<min){
                min = array[i];
            }
            if(array[i]>max){
                max = array[i];
            }
        }
        int latestMinIndex = -1, latestMaxIndex = -1, result = array.length;
        for(int i = 0; i < array.length; i++){
            if(array[i] == max){
                latestMaxIndex = i;
                if(latestMinIndex>=0){
                    result = Math.min(result, i-latestMinIndex+1);
                }
            }
            else if(array[i] == min){
                latestMinIndex = i;
                if(latestMaxIndex>=0){
                    result = Math.min(result, i-latestMaxIndex+1);
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Array size: ");
        int N = scanner.nextInt();
        int array[] = new int[N];
        System.out.print("Array Elements: ");
        for(int i = 0; i < N; i++){
            array[i] = scanner.nextInt();
        }
        System.out.println(findClosestMinMax(array));
    }
}
