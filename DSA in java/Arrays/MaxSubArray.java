
import java.util.Scanner;

public class MaxSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int currsum = arr[0];
        int maxsum =Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            currsum = currsum+arr[i];
            if(currsum <0){
                currsum = 0;
            }
            maxsum = Math.max(maxsum,currsum);
        }
        System.out.println(maxsum+" ");
    }
}
