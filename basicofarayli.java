package array;
import java.util.ArrayList;
import java.util.Scanner;
public class basicofarayli {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(6);
        arr.add(0,10);
        arr.add(1,20);
        arr.add(2,30);
        arr.add(3,40);
        arr.add(4,50);
        arr.add(5,60);
// System.out.println(arr);
for(int i=0;i<arr.size();i++){
System.out.print(arr.get(i)+" ");
}
System.out.println();
arr.set(2,300);
for(int i=0;i<arr.size();i++){
    System.out.print(arr.get(i)+" ");
}
arr.add(1,90);
System.out.println();
System.out.println(arr.size());
for(int i=0;i<arr.size();i++)
System.out.print(arr.get(i)+" ");
}
}
    
        