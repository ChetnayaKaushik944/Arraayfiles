package array;

public class productarry {
    public static void main(String[] args) {
        int[] arr={2,3,4,5};
        int product=1;
        for (int i = 0; i < arr.length; i++) {
            product*=arr[i];
            
        }
        System.out.println(product);
    }
    
}
