import java.util.*;
class nnumbers
{
    public static void main ()
{
    int n,i,sum=0;
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter a number n ");
    n=sc.nextInt();
    System.out.println("The numbers 0 to n are");
    for(i=0;i<n+1;i++)
    {
        System.out.println(+i);
         sum=sum+i;
    }
    System.out.println("And the sum of number from 0 to n is "+sum);
}
}