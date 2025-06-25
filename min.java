package array;

public class min {
    public static void main(String[] args) {
        int[] arr={4,5,7,9,3,6};
        int n=arr.length;
        int min= Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
    
        min=Math.min(min,arr[i]);
        
        
        }
        System.out.println(min);
    }
    
}
