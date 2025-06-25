package array;

public class arradd{
    public static void main(String[] args) {
        int[][] a={{1,2,3},{2,3,4},{3,4,5,}};
        int[][] b={{3,4,5},{4,5,6},{5,6,7}} ;
       int m=a.length;
       int n=b[0].length;
       int sum=0;
       int[][] res=new int[m][n];
       for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
           res[i][j]=a[i][j]+b[i][j];
            
        }
        
       }
       for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            System.out.print(res[i][j]+" ");

            
        }
        System.out.println();
        
       }
    }
    
}
