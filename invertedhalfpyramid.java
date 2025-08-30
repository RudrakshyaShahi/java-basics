import java.util.*;
class invertedhalfpyramid
{
    public static void main (){
        Scanner sc = new Scanner (System.in);
        int i,n,m,j;
        n=4;
        m=4;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=m;j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
            m--;
        }
        
    }
}