package array;
import java.util.Scanner;
public class reversearr { 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={ 10,20,30,40,50,60};
        int n=arr.length;
        for(int ele:arr){
        System.out.print(ele+" ");}

System.out.println();
//revese solution
int i=0,j=n-1;
while(i<=j){
 int temp=arr[i];
 arr[i]=arr[j];
 arr[j]=temp;
 i++;
 j--;
}
for(int ele:arr){
System.out.print(ele+" ");
}
System.out.println();


}

    }
    

