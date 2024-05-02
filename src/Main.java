import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int i, j;
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        System.out.println("Enter the array elements");
        for (i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The array after moving the zeroes to one side : ");

        for (i = 0,j= arr.length-1; i <= j; ) {
            if (arr[i] == 0) {
                if (arr[j] != 0) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j--;

            }
            else if(arr[i]==0 && arr[j] == 0){
                int temp = arr[i];
                arr[i] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }

            else {
                i++;
            }
        }
        for(i=0;i< arr.length;i++)
            System.out.println(arr[i]);
    }
}