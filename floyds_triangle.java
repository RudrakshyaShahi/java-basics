import java.util.*;
class floyds_triangle
{
    public static void main ()
    {
        Scanner sc = new Scanner (System.in);
        int i,j,n;
        n=5;
        int m=1;
        for (i=1;i<=n;i++){
            for (j=1;j<=i;j++)
            {
                System.out.print(m+" ");
                m++;
            }
            System.out.println(" ");
        }
    }
}