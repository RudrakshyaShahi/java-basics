import java.util.*;
public class halfpyramid{
    public static void main ()
    {
        int i,j,n,m;
        Scanner sc = new Scanner (System.in);
        n=4;
        m=5;
        for (i=1;i<=n;i++)
        {
            for (j=1;j<=m;j++)
            {
                if(i>=j){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
            }
            System.out.println(" ");
        }
    }
}