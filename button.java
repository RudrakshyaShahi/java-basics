import java.util.*;
class button{
    public static void main()
    {
        Scanner sc=new Scanner (System.in);
        
        System.out.println("Enter a number 1 , 2 or 3");
        int a=sc.nextInt();
        if (a==1)
        {
            System.out.println("Hello");
            
        }
        else if (a==2)
        {
            System.out.println("Namaste");
            
        }
         else 
        {
            System.out.println("Bonjour");
            
        }
    }
}