import java.util.Scanner;

public class bubbledescending {
    public static void descending(int arr[]){
        for(int i = 0;i<arr.length -1;i++){
            for(int j = 0;j<arr.length - i- 1;j++){
                if(arr[j] < arr [ j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void print(int arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        descending(arr);
        print(arr);
    }
}
