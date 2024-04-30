import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int i,j ;
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        System.out.println("Enter the array elements");
        for(i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int count= 0;
        for(i=0;i< arr.length;i++){
            if(arr[i]!=0){
                arr[count++]=arr[i];
                }
            }
        for(;count< arr.length;count++){
            arr[count]=0;
        }
        for(i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        }
}
