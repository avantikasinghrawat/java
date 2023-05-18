import java.util.*;
class Table
{
    public static void main(String[] arr)
    
    {
        int i ,n;
        Scanner ss=new Scanner(System.in);

        System.out.print("Enter Table number");
     n=ss.nextInt();
        
        for(i=1;i<=10;i++)
        {
            System.out.println(n*i);
        }
    }
}
