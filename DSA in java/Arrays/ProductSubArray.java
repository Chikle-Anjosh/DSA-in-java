public class ProductSubArray {
    public static void main(String[] args) {
        int arr[] = {-2,3,-4};
        int ans = arr[0];
        int maxending = arr[0];
        int minending = arr[0];
        for(int i=1;i<arr.length;i++){
            int v1 = maxending * arr[i];
            int v2 = minending * arr[i];
            int v3 = arr[i];
            maxending = Math.max(v1,Math.max(v2,v3));
            minending = Math.min(v1,Math.max(v2,v3));
            ans = Math.max(ans,Math.max(maxending,minending));
        }
        System.out.println("the product of subarrays is : "+ans);
    }
}
