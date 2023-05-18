import java.util.*;
public class Main
{
    public static void main(String[] args) 
    {
        int a[];
        int i,size,search,count=0;
        Scanner ob = new  Scanner (System.in);
        System.out.print("Enter the size of array:");
        size=ob.nextInt();
        a= new int [size];
        System.out.print("Enter the vlaue:");
        for(i=0;i<size;i++)
        {
            a[i]=ob.nextInt();
        }
                System.out.println("You entered:");
        for(i=0;i<size;i++)
        {
            if(a[i]%2 == 0){
                System.out.println(a[i]);
       }
               System.out.println("Enter search value:");
               search=ob.nextInt();
               for(i=0;i<=size;i++)
               {
                   count++;
               }
        System.out.println("count search value:"+count);

      }
        
    }
}