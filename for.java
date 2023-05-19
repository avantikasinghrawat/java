impot java.util.scanner;
class My
{
    public static void main(string arr[])
    {
        int a[]={2,5,3,4,7,5,88,11};
        int b[]=new int [10];
        int c[]=new int [10];
        system.arraycopy(a,0,b,0,3);
        for(int i:b)
        system.out.println(i);
        system.arraycopy(a,2,c,5,4);
        for(int i;c)
        system.out.print(i+" ");
    }
}