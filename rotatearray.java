package array;
import java.util.*;
public class rotatearray {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60,70};
        int n=arr.length;
        for(int ele:arr){
        System.out.print(ele+" ");
        }
        System.out.println();
        //solution
        int i=0,j=n-1,k;
        
        
        while(i<=j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        }
        
        




    }

    
}