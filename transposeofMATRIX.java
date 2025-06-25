package array;

public class transposeofMATRIX {
    
    public static void main(String[] args) {
        int[][] arr={{2,3},{4,5},{5,6}};
        int m=arr.length;
        int n=arr[0].length;
        // for (int j= 0; j < n; j++) {//cols
        //     for (int i = 0; i<m; i++) {//rows
        //         System.out.print(arr[i][j]+" ");

        //     }
            System.out.println();
                
        //transpose
        int[][]transpose=new int[n][m];
        for (int i= 0; i < n; i++) {
            for (int j = 0; j <m; j++) {
                transpose[i][j]=arr[j][i];
                System.out.print(transpose[i][j]+" ");
                
            }
          
        System.out.println();    
        }
        
   }
    
}

