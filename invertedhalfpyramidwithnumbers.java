import java.util.*;
class invertedhalfpyramidwithnumbers{
    public static void main (){
        Scanner sc=new Scanner (System.in);
        int i,j,m,n;
        n=5;
        m=5;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=m;j++){
                System.out.print(+j);
            }
            m--;
              System.out.println(" ");
        }
        
    }
}