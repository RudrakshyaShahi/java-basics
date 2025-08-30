import java.util.*;
class table{
    public static void main ()
    {
        Scanner sc=new Scanner (System.in);
        int i,n,s;
        System.out.println("Enter the number of which table will be generated ");
        n=sc.nextInt();
        for(i=0;i<11;i++)
        {
            int num=i*n;
            System.out.println(+num);
        }
        
    }
}