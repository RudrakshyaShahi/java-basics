import java.util.*;
class invertedhalfpyramid2{
    public static void main(){
        Scanner sc = new Scanner (System.in);
        int i,j,n;
        n=5;
        for (i=1;i<=n;i++)
        {
            for (j=1;j<=n-i;j++){
             System.out.print(" ");   
            }
            for (j=1;j<=i;j++){
             System.out.print("*");  
        }    
        
             System.out.println(" ");  
            
        }
        }
    }
